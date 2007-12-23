package pk

class MyController {
	
	def index = {
		render 'hello'
	}
	
	static void main(args) {
		cobegin {
			
		}
		coforall(1..3) { i ->
			
		}
		forall(1..10) { i ->
			
		}
	}
	
}