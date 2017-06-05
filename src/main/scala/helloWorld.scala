/**
  * Created by Administrator on 05/06/2017.
  */
object helloWorld {

  def main(args: Array[String]) {
    println("Hello World! I work.")
    val meaningOfLife = 42
    println(s"The meaning of life is computed to be $meaningOfLife, Goodbye!")

    var mutableVar = 10
    mutableVar=mutableVar + 5
    println(s"The mutable variable here is $mutableVar")



  }

}
