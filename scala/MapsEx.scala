object MapsEx {
	def main (args:Array[String]){
		val m = Map("Sam"->"Jha", "Sreya"->"Jha")
		println(m)
		m.keys.foreach{i =>
					   print("Key::"+i)
					   println(" Value::"+m(i))}
					   
		if(m.contains("Sam")){
			println("We have Sam")
		}
		if(!m.contains("Samrat")){
			println("We dont have Samrat")
		}
		
		//Scala options.
		println(m.get("Sam"))
		println(m.get("Samrat"))
		
		//Scala Options value parsing with RegEx
		println(checkVal(m.get("Sam")))
		println(checkVal(m.get("Samrat")))
		
		def checkVal(x:Option[String]) = x match{
			case Some(s)=>s
			case None=>"?"
		
		}
	}
}