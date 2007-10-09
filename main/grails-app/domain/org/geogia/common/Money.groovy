/*
 * Copyright 2006-2007 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */ 

/**
 * Money class 
 * Geogia project
 *
 * @author Chanwit Kaewkasi
 * @since 19-Dec-2006
 * @update 2-Sept-2007
 *
**/

package org.geogia.common;

class Money { 	

	Long raw	
	Currency unit
	
	Double getAmount() { return this.raw / (10**this.unit.getDefaultFractionDigits()) }
	void setAmount(Double value) { this.raw = value * (10**this.unit.getDefaultFractionDigits()) }
	
	static transients = ['amount'] 	
	
	static constraints = {
		raw(nullable:false)
		unit(nullable:false)
	}
		
	def Money(){}
	
	def Money(Double value, String unit){
		this.unit = Currency.getInstance(unit)
		this.amount = value
	}
	
	def convertTo(String unit) {
		// TODO: some calculation with the exchange rate
		this.unit = Currency.getInstance(unit)
	}
	
	def String toString() {
		return "Money : " + this.amount + " " + this.unit
	}
}	
