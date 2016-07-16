object TupleEx{
	def main(args:Array[String]){
		val v =  (1,"Samrat",25.45)
		val v1 = (1,4,6)
		
		println(v)
		println(v1._1+v1._2+v1._3)
		
		v1.productIterator.foreach(i=>println(i))
	}
}