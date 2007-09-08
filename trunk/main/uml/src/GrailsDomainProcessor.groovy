import groovy.text.Template
import groovy.text.SimpleTemplateEngine
import org.omg.uml.foundation.core.AssociationClass
import org.omg.uml.foundation.core.Attribute
import org.omg.uml.foundation.core.EnumerationLiteral
import org.omg.uml.foundation.core.DataType
import org.omg.uml.foundation.core.Operation
import org.omg.uml.foundation.core.UmlClass
import org.omg.uml.foundation.datatypes.OrderingKindEnum
import org.omg.uml.modelmanagement.Model
import org.omg.uml.modelmanagement.UmlPackage

class GrailsDomainProcessor extends GroovyModelProcessor {
            
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
               
   void process(Map context) {

      getAllClasses(context.model).each { modelElement ->           
           context.currentModelElement = modelElement                      
           def fullyQualifiedName = getFullyQualifiedName(context.currentModelElement)
           if (!fullyQualifiedName.startsWith("java") && fullyQualifiedName.size() > 0) {               
               def templateName = "templates/GrailsDomainClass.gtl"
               def outputName = "${fullyQualifiedName.replace('.','/')}.groovy"               
               processTemplate(templateName, outputName, context)               
           }           
	  }
  
      getAllEnums(context.model).each { modelElement ->           
           context.currentModelElement = modelElement                      
           def fullyQualifiedName = getFullyQualifiedName(context.currentModelElement)
           if (!fullyQualifiedName.startsWith("java") && fullyQualifiedName.size() > 0) {               
               def templateName = "templates/GrailsDomainEnum.gtl"
               def outputName = "${fullyQualifiedName.replace('.','/')}.groovy"               
               processTemplate(templateName, outputName, context)               
           }      		
      }
   }
   
}
