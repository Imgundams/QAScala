object helloWorld {

  def main(args: Array[String]) {
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


  abstract class Vehicle {

    def make: String

    def model: String

    def year: Int
  }

  case class Car(make: String, model: String, year: Int, numberOfDoors: Int) extends Vehicle()

  case class Bike(make: String, model: String, year: Int, engineSize: Int) extends Vehicle()

  case class Truck(make: String, model: String, year: Int, cargoCapacity: Int) extends Vehicle()


  abstract class Person {

    def fullName: String

    def contactNumber: Int
  }

  case class Employee(fullName: String, contactNumber: Int, employeeId: Int, jobTitle: String, wage: Int) extends Person()

  case class Customer(fullName: String, contactNumber: Int, customerId: Int, customerVehicle: String) extends Person()

  var Car1 = new Car("Best Car", "Polo", 1998, 3)
  var Car2 = new Car("Worst Car", "Polo", 2001, 3)


  val stream = (5 to 1000).toStream
  stream(556)

  var lists = List(1, 2) ++ List(3, 4)

  var lists2 = List(2, 3) :: List(4, 5)


  print(lists2)

  import scala.collection.{immutable, mutable}

  def calculatePrimesStream(end: Int): List[Int] = {
    val odds = Stream.from(3, 2).takeWhile(_ <= Math.sqrt(end).toInt)
    val composites = odds.flatMap(i => Stream.from(i * i, 2 * i).takeWhile(_ <= end))
    Stream.from(3, 2).takeWhile(_ <= end).diff(composites).toList
  }
  calculatePrimesStream(1000000)
  def primesIterative(end: Int): List[Int] = {
    val primeIndices = mutable.ArrayBuffer.fill((end + 1) / 2)(1)
    val intSqrt = Math.sqrt(end).toInt
    for (i <- 3 to end by 2 if i <= intSqrt) {
      for (nonPrime <- i * i to end by 2 * i) {
        primeIndices.update(nonPrime / 2, 0)
      }
    }

    (for (i <- primeIndices.indices if primeIndices(i) == 1) yield 2 * i + 1).tail.toList
  }

  primesIterative(1000000)


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
