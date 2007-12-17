
package org.geogia.accounting

class PaymentMode {

	static void initEnums() {
		if(PaymentMode.count()==0) {
			new PaymentMode(value:'ELECTRANSFERT').save() 
			new PaymentMode(value:'CHECK').save() 
			new PaymentMode(value:'LCR').save() 
		}
	}
	
	String value
	
	String toString() {
		return "${id}: ${value}"
	}
      
}

