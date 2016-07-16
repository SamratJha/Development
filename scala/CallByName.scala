object CallByName {
	def main(args: Array[String]){
		println(delay(test()))
	}
	
	def test():Long = {
		println("Inside the test method")
		System.nanoTime
	}
	
	def delay(f: =>Long) = {
		println("Inside delay method" + f)
		f
	}
}