object ListScala {
	def main(args: Array[String]){
		//val means constant, the value wont change.
		val list1:List[Int] =  List(21,22,34)
		val fruit = "apples"::("oranges"::("pears"::Nil))
		val fillEx = List.fill(3)("Sam")
		println("List 1":+list1.head)
		println("List 1":+fruit.tail)
		println(list1:::fruit)
		println(list1.:::(fruit))
		println("List 1":+fillEx)
	}
}