/**
* Function, Array usage and String to Integer conversion
*/
object Add{
	def add(a:Int, b:Int):Int ={
		var sum:Int = a+b
		sum
	}
	def main(args: Array[String]){
		println(add(args(0).toInt,args(1).toInt))
	}
}