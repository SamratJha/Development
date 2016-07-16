object NestedFunc{
	
	//Declaring Anonymous function
	def funct = (x:Int, y:Int) => x*y
	
	
	def main(args:Array[String]){
		println("Factorial of: "+args(0)+" is: " +fact(args(0).toInt))
		println(funct(6,7))
	}
	def fact(num:Int):Int = {
		
		
		def factorial(a:Int, accumulator:Int):Int = {
			if(a==1)
				accumulator
			else
				factorial(a-1,a*accumulator)
				
		}
		factorial(num,1)
	}
}