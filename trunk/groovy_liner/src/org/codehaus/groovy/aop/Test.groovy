package org.codehaus.groovy.aop

class Test {
	static void main(args) {
		def s1 = System.currentTimeMillis()
//		1000000.times {
//			int i = 10
//			println "test ${i}"
//		}
		1.times {
			Thread.dumpStack()
		}
		def s2 = System.currentTimeMillis()
		println "time: ${s2-s1}"
	}
}