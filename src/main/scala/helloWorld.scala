object helloWorld {

  def main(args: Array[String]) {


  }


  def startUp:Unit= {
    println("Hello World! I work.")
    val meaningOfLife = 42
    println(s"The meaning of life is computed to be $meaningOfLife, Goodbye!")

    var mutableVar = 10
    mutableVar = mutableVar + 5
    println(s"The mutable variable here is $mutableVar")

    implicit val tupl = ('a', 'b', 'c', true)

    def matchtup(elem: Any) = elem match {
      case (a, b, c, true) => println(s"hihihihihi $a $b $c")
      case _ => print("dunno")
    }


    matchtup(tupl)

    implicit val dos = 1003.1
    val q = 10

    def totaler(quantity: Int)(implicit discount: Double, notdis: Double): Double = {
      quantity * 15 * discount
    }

    totaler(q)

    def gim[Lo0ads](items: Lo0ads*) = {
      items.foreach(item => println(item))

    }

    gim(1, 2, 3, 4, 5)
    gim("one", "two", "three", 4, false)

  }



  val stream = (5 to 1000).toStream
  stream(556)

  var lists = List(1, 2) ++ List(3, 4)

  var lists2 = List(2, 3) :: List(4, 5)


  print(lists2)



  //Optional callback function
  def printStuff (sendStuff: Option[()=>Unit]= None)={
    println("Stuff")
    sendStuff map (callback=>callback())

  }
  printStuff()
  printStuff(Some(()=>{
    println("Finished")
  }))
}
