object callByNameArg{
	def main(args : Array[String]){
		println(testFunc(a=5, b=7))
		println(testFunc(b=5, a=7))
		varArg("Samrat")
		varArg("Samrat","Sreya")
		varArg("Samrat","Sreya","Porshia")
	}
	
	def testFunc(b:Int, a:Int):Int = {
		b-a
	}
	
	def varArg(args:String*){
		for(arg <- args){
			println ("Args:" +arg)
		}
	}
}