import org.geogia.xmi.XMIPreFilter

// jar:file:./uml/accounting.zargo!/accounting.xmi . file:./uml/src/GrailsDomainProcessor.groovy

class GrailsDomainProcessor extends GroovyModelProcessor {
	
   def getClassesByStereotype = { model, stereotype ->
	  return getAllClasses(model).findAll { elem ->
	  	elem.stereotype.any{ s -> s.name == stereotype}
	  }
   }
            
   def getAllEnums = { model ->
   	  return model.core.enumeration.refAllOfType()
   }
   
   def getEnumLiterals = { anEnum ->
      return anEnum.literal 
   }        
   
   def friendlyNameType = { type -> 
       def attributeType = javaType(type)
       if(attributeType.startsWith('java')) {
           return type.name
       } else {
    	   return attributeType 
       }
   }

   def prepareBinding = { map ->
       def binding = [
           "javaToSql":javaToSql,
           "javaType":javaType,
           "friendlyNameType":friendlyNameType,
           "firstCharUpper":firstCharUpper,
           "firstCharLower":firstCharLower,
           "getPackageName":getPackageName,
           "getAttributes":getAttributes,
           "getEnumLiterals":getEnumLiterals,
           "getAssociationEnds":getAssociationEnds,
           "getEndType":getEndType,
           "getEndName":getEndName,
           "taggedValues":taggedValues,
           "isOneToOne":isOneToOne,
           "isOneToMany":isOneToMany,
           "isManyToOne":isManyToOne,
           "isManyToMany":isManyToMany,
           "isOwner":isOwner,
           "isCollection":isCollection
       ]
       if (map) {
           binding.putAll(map)
       }
       return binding
   }
   
   InputStream preProcessXMI(InputStream inputStream) {
       return new XMIPreFilter().transform(inputStream)
   }   
               
   void process(Map context) {
//      getAllClasses(context.model).each { modelElement ->           
//           context.currentModelElement = modelElement                      
//           def fullyQualifiedName = getFullyQualifiedName(context.currentModelElement)
//           if (!fullyQualifiedName.startsWith("java") && fullyQualifiedName.size() > 0) {               
//               def templateName = "templates/GrailsDomainClass.gtl"
//               def outputName = "${fullyQualifiedName.replace('.','/')}.groovy"               
//               processTemplate(templateName, outputName, context)               
//           }           
//	  }
// 		if argouml
//      getAllEnums(context.model).each { modelElement ->           
//           context.currentModelElement = modelElement                      
//           def fullyQualifiedName = getFullyQualifiedName(context.currentModelElement)
//           if (!fullyQualifiedName.startsWith("java") && fullyQualifiedName.size() > 0) {               
//               def templateName = "templates/GrailsDomainEnum.gtl"
//               def outputName = "${fullyQualifiedName.replace('.','/')}.groovy"               
//               processTemplate(templateName, outputName, context)               
//           }      		
//      }
		getClassesByStereotype(context.model, 'entity').each { modelElement ->
			// TODO generate entity classes
		}
		
		getClassesByStereotype(context.model, 'enumeration').each { modelElement ->
	      context.currentModelElement = modelElement                      
	      def fullyQualifiedName = getFullyQualifiedName(context.currentModelElement)
	      if (!fullyQualifiedName.startsWith("java") && fullyQualifiedName.size() > 0) {               
	          def templateName = "templates/GrailsDomainEnum_P6.gtl"
	          def outputName = "${fullyQualifiedName.replace('.','/')}.groovy"               
	          processTemplate(templateName, outputName, context)               
	      }      		
		}  	  
   }
   
}
