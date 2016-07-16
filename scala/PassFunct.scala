object PassFunct {
	def main (args : Array[String]){
		println ("Passing function as an Arguement:" + mainFunc(passedFunc, "Samrat"))
	}
	
	//First parameter is a function which takes String and returns String
	def mainFunc(func:String => String, name:String):String = {
		func(name)
	}
	def passedFunc(name:String):String ={
		"My Name is "+name
	}
}