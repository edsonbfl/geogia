
package org.geogia.accounting

class BaseDateType {

	static void initEnums() {
		if(BaseDateType.count()==0) {
			new BaseDateType(value:'INVOICE').save() 
			new BaseDateType(value:'SHIPMENT').save() 
		}
	}
	
	String value
	
	String toString() {
		return "${id}: ${value}"
	}
      
}

