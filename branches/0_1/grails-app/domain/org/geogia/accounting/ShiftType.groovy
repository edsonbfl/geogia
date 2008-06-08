
package org.geogia.accounting

class ShiftType {

	static void initEnums() {
		if(ShiftType.count()==0) {
			new ShiftType(value:'DATE').save() 
			new ShiftType(value:'ENDMONTH').save() 
			new ShiftType(value:'STARTNEXTMONTH').save() 
		}
	}
	
	String value
	
	String toString() {
		return "${id}: ${value}"
	}
      
}

