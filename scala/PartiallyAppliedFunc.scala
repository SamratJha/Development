import java.util.Date
object PartiallyAppliedFunc{
	
	def main(args:Array[String]){
		val date =  new Date
		var dateBoundFunc =  funct(date, _:String)
		println(dateBoundFunc("message1"))
		println(dateBoundFunc("message2"))
		println(dateBoundFunc("message3"))
		
	}
	
	def funct(date: Date, message: String): String = {
			Thread.sleep(1000)
			println("Current time:"+ new Date + "But date in the function not changed" )
			message+"_____"+date
	}
}