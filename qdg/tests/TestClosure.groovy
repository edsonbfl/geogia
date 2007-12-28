import static Math.*
import static org.codehaus.qdg.runtime.DefaultMethods.*

class TestClosure {

	def a = {
//		println 'test 123'
		println sin(123.456) * cos(456.789)		
		100.times {
			println it
		}
	}

}
/*
class TestClosure {
	def a = {
		def b = {
				
		}
		forall(1..10) {
			
		}
	}
}
*/