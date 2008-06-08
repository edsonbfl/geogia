import org.geogia.accounting.*

class BootStrap {

     def init = { servletContext ->
     
     	initAccountTypeEnum()
     
     }
     
     def destroy = {
     }
     
     def initAccountTypeEnum() {
     	if(AccountType.count()==0) {
  			new AccountType(value:'GL').save()
 			new AccountType(value:'PROJECT').save()
    	}    	 
     }
} 