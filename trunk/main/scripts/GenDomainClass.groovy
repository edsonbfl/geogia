import groovy.util.*

class GenDomainClass {
	
	// TODO 1. Enumeration, still noway to correct his
	// 		2. Constraints, @see def constraintGen
	//		3. Validation
		
	def fieldMaps = [:]				
	def sqlTypes =  [:]
	
	GenDomainClass() {
		// populate field type data
		def ft = new XmlSlurper().parse('../framework/entity/fieldtype/fieldtypemysql.xml')
		ft.'field-type-def'.each {
			// TODO reformat data type, for example indicator -> would be boolean or char(1)
			// TODO generate a correct validation			
			sqlTypes[it.'@type'.text()] = it.'@sql-type'.text()
			fieldMaps[it.'@type'.text()] = normalise(it.'@java-type'.text())
		}
	}
	
	private String normalise(String className) {
		if(className=='java.sql.Timestamp') return 'Timestamp'
		if(className=='java.sql.Date') return 'Date'
		if(className=='java.sql.Time') return 'Time'
		return className
	}
	
	private String decap(String s) {
		return s[0].toLowerCase() + s[1..-1]
	}
	
	def fieldGen = { f, fields ->
		fields[f.'@name'.text()] = fieldMaps[f.'@type'.text()]
	}	
	
	def relationGen = { r, fields, hasMany ->
		switch(r.'@type') {
			case 'one': 	
			case 'one-nofk':
							def fname = r.'key-map'.'@field-name'.text()
							if(fname.lastIndexOf('Id') != -1) { 
								fields.remove(fname)
								fname = fname[0..fname.length()-3] 								
							}
							fields[fname] = r.'@rel-entity-name'.text()
							break
			case 'many': 	def name = r.'@title'?.text()
							if(name == null || name=='') name = r.'@rel-entity-name'.text()
							hasMany[decap(name)] =  r.'@rel-entity-name'.text()							
							break
		}
	}
	
	def constraintsGen = {
		def m = sqlType =~ /(\w+)(\((\d+)(,(\d+))?\))?/ // results in 6, [1], [3], [5] are answers of $1($3,$5)
	}
	
	def primaryKeyGen = { pk ->
		
	}
	
	def dumpFields = { fs, sb ->
		def warnings = []
		fs.each { name, type ->
			if(type==null) warnings << name
			sb.append "\t$type $name\n"
		}
		warnings.each {
			println "Warning: ${it}'s type is null"
		}
	}
	
	def dumpHasMany = { hasMany, sb ->
		if(hasMany.size()==0) return
		sb.append('\tstatic hasMany = [')
		hasMany.each { k, v ->
			sb.append("$k: $v, ")
		}
		sb.delete(sb.length()-2,sb.length())
		sb.append("]\n\n");
	}
	
	def gen = { ent ->
		StringBuffer sb = new StringBuffer()
		sb.append "package ${ent.'@package-name'}\n"
		sb.append '\n'
		sb.append "class ${ent.'@entity-name'} {\n"
		sb.append '\n'
		def fs = [:]
		def hasMany = [:]
		ent.field.each { fieldGen it, fs }		
		ent.relation.each { relationGen it, fs, hasMany }
		ent.'prim-key'.each { primaryKeyGen it }

		dumpHasMany(hasMany, sb)
		dumpFields(fs, sb)

		sb.append '\n'
		sb.append "}"
		
		def dir = ent.'@package-name'.text().replace('.','/')
		def filename = ent.'@entity-name'.text()
		println "Generating $filename ..."
		new File(dir).mkdirs()
		new File(dir + '/' + filename + '.groovy').write(sb.toString());
	}	
	
	static main(args) {
		def modules = [
			'manufacturing', 'marketing', 'accounting',
			'content', 'humanres',
			'order', 'party', 'product',
			'workeffort'
		]
		modules.each { module ->
			try {
				def root = new XmlSlurper().parse("../applications/$module/entitydef/entitymodel.xml")
				root.entity.each {
					new GenDomainClass().gen(it)
				}
			} catch(FileNotFoundException e) {
				println e.message
			}
		}
	}
		
}
