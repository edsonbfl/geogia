class GenEntity {
	
	static void main(a) {
		def args = System.getProperty('grails.cli.args')
		if(args == null)  {
			println "No argument"
			return	
		}
		
		def sb = new StringBuffer()
		sb.append("class ${args} {\n")
		sb.append("\n")
		sb.append("}\n")
		new File("./grails-app/domain/entity/${args}.groovy").write(sb.toString())
	}
			
}