/*
/*

import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import scala.io.Source


//https://www.dotnetperls.com/list-scala
//https://www.spantree.net/blog/2015/10/05/5-things-about-scala.html
//http://docs.scala-lang.org/cheatsheets/
//https://github.com/lampepfl/progfun-wiki/blob/gh-pages/CheatSheet.md

You can execute commands directly in the terminal
REPL : Read Evaluate Print Loop
Type scala in terminal to start and :q to quit

// Creates a variable of the correct type
10 + 3 * 5 / 2

// You only use semicolons in Scala if you have multiple statements per line

// Define your own variable
var myName = "Dan"
// Define your own constant variable
val myAge = 40

// You can define the type
val lastName: String = "Rai"

// ---------- DATA TYPES ----------

// All datatypes in Scala are objects and they include
// (Get the max value with MaxValue)
// Byte : -128 to 127
// Boolean : true or false
// Char : unsigned max value 65535
// Short : -32768 to 32767
// Int : -2147483648 to 2147483647
// Long : -9223372036854775808 to 9223372036854775807
// Float : -3.4028235E38 to 3.4028235E38
// Double : -1.7976931348623157E308 to 1.7976931348623157E308

// A Double will only hold precision up to 15 digits
val num13 = 1.999999999999999

// Create a BigInt
val lgPrime = BigInt("622288097498926496141095869268883999563096063592498055290461")
lgPrime + 1

 Create a BigDecimal
val pi50 = BigDecimal("3.14159265358979323846264338327950288419716939937510")
0.00000000000000000000000000000000000000000000000001 + pi50

var randInt = 100000

// See functions available by typing randInt. (Click Tab)
// randInt.asInstanceOf[Double] casts number to a double
// randInt.isInstanceOf[Int] checks if is of type Int

// ---------- MATH ----------
"5 + 4 = " + (5 + 4)
"5 - 4 = " + (5 - 4)
"5 * 4 = " + (5 * 4)
"5 / 4 = " + (5 / 4)
"5 % 4 = " + (5 % 4)

// Shorthand notation (No randInt++, or randInt--)
randInt += 1
"randInt += 1" + randInt

randInt -= 1
"randInt -= 1" + randInt

randInt *= 1
"randInt *= 1" + randInt

randInt /= 1
"randInt /= 1" + randInt

// Import the math library in the terminal import scala.math._

abs(-8)
cbrt(64) // Cube root a^3 = n (Find a)
ceil(5.45)
round(5.45)
floor(5.45)
exp(1) // Euler's number raised to the power
pow(2, 2) // 2^2
sqrt(pow(2,2) + pow(2,2))
hypot(2, 2) // sqrt(X^2 + y^2)
log10(1000) // = 3 (10 × 10 × 10 = 10^3)
log(2.7182818284590455) // Natural logarithm to the base e
min(5, 10)
max(5, 10)
(random * (11 - 1) + 1).toInt // Random number between 1 and 10
toRadians(90)
toDegrees(1.5707963267948966)

// acos, asin, atan, atan2, cos, cosh, sin, sinh, tan, tanh

// ---------- CONDITIONALS ----------
// if statements are like Java except they return a value like the
// ternary operator

// Conditional Operators : ==, !=, >, <, >=, <=
// Logical Operators : &&, ||, !

var age = 18

val canVote = if (age >= 18) "yes" else "no"

// You have to use { } in the REPL, but not otherwise
if ((age >= 5) && (age <= 6)) {
  println("Go to Kindergarten")
} else if ((age > 6) && (age <= 7)) {
  println("Go to Grade 1")
} else {
  println("Go to Grade " + (age - 5))
}

true || false
!(true)

*/

object ScalaTut {
  def main(args: Array[String]) {

    // ---------- LOOPING ----------
    // To compile and run in the terminal
    // 1. scalac ScalaTut.scala
    // 2. scala ScalaTut

    var i = 0

    while (i <= 10) {
      println(i)
      i += 1
    }

    do {
      println(i)
      i += 1
    } while(i <= 20)

    for (i <- 1 to 10){
      println(i)
    }

    // until is often used to loop through strings or arrays
    val randLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    for (i <- 0 until randLetters.length){

      // Get the letter in the index of the String
      println(randLetters(i))
    }

    // Used to iterate through a list
    val aList = List(1,2,3,4,5)
    for(i <- aList){
      println("List Item " + i)
    }

    // Store even numbers in a list
    var evenList = for { i <- 1 to 20
                         // You can put as many conditons here separated with semicolons
                         // as you need
                         if (i % 2) == 0
    } yield i

    println("Even List")
    for(i <- evenList)
      println(i)

    // This loop assigns a value to the 1st variable and it retains
    // that value until the 2nd finishes its cycle and then it iterates
    for (i <- 1 to 5; j <- 6 to 10){
      println("i: " + i)
      println("j: " + j)
    }

    // There is no break or continue in Scala
    def printPrimes() {

      val primeList = List(1,2,3,5,7,11)
      for (i <- primeList){

        // Works like break if you return from a function
        if(i == 11){
          return
        }

        // Works like continue
        if (i != 1){
          println(i)
        }

      }

    }

    printPrimes


    // ---------- INPUT / OUTPUT ----------

    var numberGuess = 0

    do{
      print("Guess a number : ")

      // You can also use readInt, readDouble, readByte, readShort, readLong,
      //
      numberGuess = readLine.toInt

    } while(numberGuess != 15)

    printf("You guessed the secret number %d\n", 15)

    // You can use string interpolation
    val name = "Derek"
    val age = 39
    val weight = 175.5
    println(s"Hello $name")

    println(f"I am ${age + 1} and weigh $weight%.2f")

    // printf Style Format Specifiers
    // %c : Characters
    // %d : Integers
    // %f : Floating Point Numbers
    // %s : Strings
    printf("'%5d'\n",5) // Right justify

    printf("'%-5d Hi'\n",5) // Left justify

    printf("'%05d'\n",5) // Zero Fill

    printf("'%.5f'\n",3.14) // 5 decimal minimum & maximum

    printf("'%-5s'\n", "Hi") // Left Justify String

    // Special Characters : \n, \b, \\, \a

    // ---------- STRINGS ----------
    var randSent = "I saw a dragon fly by"

    // Get the 3rd index value
    println("3rd Index : " + randSent(3))

    // Get String length
    println("String length " + randSent.length())

    // Concatenate strings
    println(randSent.concat(" and explode"))

    // Compare strings for equality
    println("Are strings equal " + "I saw a dragon".equals(randSent))

    // Get index of a match
    println("dragon starts at index ", randSent.indexOf("dragon"))

    // Convert a string into an array
    val randSentArray = randSent.toArray

    for (v <- randSentArray)
      println(v)

    // ---------- FUNCTIONS ----------
    // def funcName (param1:dataType, param2:dataType) : returnType = {
    //    function body
    //    return valueToReturn
    // }

    // You can give parameters default values
    def getSum( num1:Int = 1, num2:Int = 1) : Int = {
      return num1 + num2
    }

    println("5 + 4 = " + getSum(5,4))

    // you can use named arguments
    println("5 + 4 = " + getSum(num2=5, num1=4))

    // A function that returns nothing (Procedure)
    def sayHi() : Unit = {
      println("Hi how are you doing")
    }

    sayHi

    // Receive variable number of arguments
    def getSum2(args: Int*) : Int = {
      var sum : Int = 0
      for(num <- args){
        sum += num
      }
      sum
    }

    println("getSum2: " + getSum2(1,2,3,4,5))

    // Recursion example calculating factorials
    def factorial(num : BigInt) : BigInt = {
      if (num <= 1)
        1
      else
        num * factorial(num - 1)
    }

    // 1st: num = 4 * factorial(3) = 4 * 6 = 24
    // 2nd: num = 3 * factorial(2) = 3 * 2 = 6
    // 3rd: num = 2 * factorial(1) = 2 * 1 = 2

    println("Factorial of 4 = " + factorial(4))

    // ---------- ARRAYS ----------
    // You'll use arrays when the size is fixed, or an ArrayBuffer for a
    // variable size

    // Create an array of Ints with a max size of 20
    val favNums = new Array[Int](20)

    // Create and initialize array in 1 line
    val friends = Array("Bob", "Tom")

    // Change the value in an array
    friends(0) = "Sue"

    println("Best Friend " + friends(0))

    // Create an ArrayBuffer
    val friends2 = ArrayBuffer[String]()

    // Add an item to the 1st index
    friends2.insert(0, "Phil")

    // Add item to the next available slot
    friends2 += "Mark"

    // Add multiple values to the next available slot
    friends2 ++= Array("Susy", "Paul")

    // Add items starting at 2nd slot
    friends2.insert(1, "Mike", "Sally", "Sam", "Mary", "Sue")

    // Remove the 2nd element
    friends2.remove(1)

    // Remove 2 elements starting at the 2nd index
    friends2.remove(1, 2)

    // Cycle through and print ArrayList or Array
    var friend : String = " "
    for(friend <- friends2)
      println(friend)

    // Add values to an array with a loop
    for (j <- 0 to (favNums.length - 1)){
      favNums(j) = j
      println(favNums(j))
    }

    // Use yield to multiply all values times 2 and store in a new array
    val favNumsTimes2 = for(num <- favNums) yield 2 * num

    // Another way to print out values in array
    favNumsTimes2.foreach(println)

    // You can also store values that match a condition
    var favNumsDiv4 = for(num <- favNums if num % 4 == 0) yield num

    favNumsDiv4.foreach(println)

    // Create a multidimensional array with Array.ofDim
    var multTable = Array.ofDim[Int](10,10)

    for(i <- 0 to 9){
      for(j <- 0 to 9){
        multTable(i)(j) = i * j
      }
    }

    for(i <- 0 to 9){
      for(j <- 0 to 9){
        printf("%d : %d = %d\n", i, j, multTable(i)(j))
      }
    }

    println("Sum : " + favNums.sum)

    println("Min : " + favNums.min)

    println("Max : " + favNums.max)

    // Sort in desending order (Use < for assending)
    val sortedNums = favNums.sortWith(_ > _)

    // Return an indexed sequence and convert it into a string with commas
    println(sortedNums.deep.mkString(", "))

    // ---------- MAPS ----------
    // Maps are collections of key value pairs

    // Create a Map that can't be changed (Immutable)
    val employees = Map("Manager" -> "Bob Smith", "Secretary" -> "Sue Brown")

    // Get value using the key after checking that it exists
    if(employees.contains("Manager"))
      printf("Manager : %s\n", employees("Manager"))

    // Create a Mutable map
    val customers = collection.mutable.Map(100 -> "Paul Smith",
      101 -> "Sally Smith")

    printf("Cust 1 : %s\n", customers(100))

    // Change a value using the key
    customers(100) = "Tom Marks"

    // Add an item
    customers(102) = "Megan Swift"

    // Output a Map
    for((k,v) <- customers)
      printf("%d : %s\n", k, v)

    // ---------- TUPLES ----------
    // Tuples can hold values of many types, but they are immutable

    var tupleMarge = (103, "Marge Simpson", 10.25)

    printf("%s owes us $%.2f\n", tupleMarge._2, tupleMarge._3)

    // Iterate through a tuple
    tupleMarge.productIterator.foreach{ i => println(i)}

    // Convert Tuple to String
    println(tupleMarge.toString())

    // ---------- CLASSES ----------
    val rover = new Animal
    rover.setName("Rover")
    rover.setSound("Woof")
    printf("%s says %s\n", rover.getName, rover.getSound)

    val whiskers = new Animal("Whiskers", "Meow")
    println(s"${whiskers.getName} with id ${whiskers.id} says ${whiskers.getSound}")

    println(whiskers.toString)

    val spike = new Dog("Spike", "Woof", "Grrrr")

    spike.setName("Spike")
    println(spike.toString)

    val fang = new Wolf("Fang")
    fang.moveSpeed = 36.0
    println(fang.move)

    // ---------- TRAITS ----------
    val superman = new Superhero("Superman")
    println(superman.fly)
    println(superman.hitByBullet)
    println(superman.ricochet(2500))

    // ---------- HIGHER ORDER FUNCTIONS ----------
    // Functions can be passed like any other variable
    // You need the _ after the function to state you meant the function
    val log10Func = log10 _

    println(log10Func(1000))

    // You can apply a function to all items of a list with map
    List(1000.0,10000.0).map(log10Func).foreach(println)

    // You can use an anonymous function with map as well
    // Receives an Int x and multiplies every x by 50
    List(1,2,3,4,5).map((x : Int) => x * 50).foreach(println)

    // Filter will pass only those values that meet a condition
    List(1,2,3,4,5,6).filter(_ % 2 == 0).foreach(println)

    // Pass different functions to a function
    def times3(num : Int) = num * 3
    def times4(num : Int) = num * 4

    // Define the function parameter type and return type
    def multIt(func : (Int) => Double, num : Int ) = {
      func(num)
    }

    printf("3 * 100 = %.1f)\n", multIt(times3, 100))

    // A closure is a function that depends on a variable declared outside
    // of the function
    val divisorVal = 5
    val divisor5 = (num : Double) => num / divisorVal
    println("5 / 5 = " + divisor5(5.0))

    // Use import scala.io.Source to read from files
    val textFromFile = Source.fromFile("test.txt", "UTF-8")

    // Iterate through each line in the file and print
    val lineIterator = textFromFile.getLines
    for(line <- lineIterator){
      println(line)
    }
    textFromFile.close()

    // ---------- EXCEPTION HANDLING ----------

    def divideNums(num1 : Int, num2 : Int) = try
    {
      (num1 / num2)
    } catch {
      case ex: java.lang.ArithmeticException => "Can't divide by zero"
    } finally {
      // Clean up after exception here
    }

    println("3 / 0 = " + divideNums(3,0))

  } // ---------- END OF MAIN ----------

  // ---------- CLASSES ----------
  // Classes are used as blueprints to create objects
  // Objects define the attributes (fields) and capabilities (methods) of an
  // object

  class Animal(var name : String, var sound : String) {
    this.setName(name)

    // Any code that follows the class name is executed each time an
    // object is created as part of the Primary Constructor

    // This function is defined in the Animal companion object below
    val id = Animal.newIdNum

    // You must initialize all fields
    // protected means the field can only be accessed directly by methods
    // defined in the class or by subclasses
    // private fields can't be accessed by subclasses of Animal
    // public fields can be accessed directly by anything

    // protected var name = "No Name"
    // protected var sound = "No Sound"

    // Getters and setters are used to protect data
    def getName() : String = name
    def getSound() : String = sound
    def setName(name : String){
      // Check if the String contains numbers and if so don't allow
      if(!(name.matches(".*\\d+.*")))

      // this allows us to refer to any object without knowing its name
        this.name = name
      else
        this.name = "No Name"
    }
    def setSound(sound : String) {
      this.sound = sound
    }

    // Subclasses can't call this constructor unlike with Java
    def this (name : String){

      // This calls the primary constructor defined on the class line
      this("No Name", "No Sound")
      this.setName(name)
    }

    def this (){
      // This calls the primary constructor defined on the class line
      this("No Name", "No Sound")
    }

    // You can override any other method
    override def toString() : String = {

      // How to format Strings
      return "%s with the id %d says %s".format(this.name, this.id, this.sound)
    }

  }

  // The companion object for a class is where you'd define static class
  // variables and functions in Java
  object Animal {
    private var idNumber = 0
    private def newIdNum = { idNumber += 1; idNumber }
  }

  // ---------- INHERITANCE ----------
  // A class that inherits from another gains all its fields and methods
  // A class declared final can't be extended
  class Dog (name : String, sound : String, growl : String) extends
    Animal(name, sound){

    def this (name : String, sound : String){
      this("No Name", sound, "No Growl")
      this.setName(name)
    }

    def this (name : String){
      this("No Name", "No Sound", "No Growl")
      this.setName(name)
    }

    def this (){
      this("No Name", "No Sound", "No Growl")
    }

    // You can override any other method
    override def toString() : String = {
      return "%s with the id %d says %s or %s".format(
        this.name, this.id, this.sound, this.growl)
    }
  }

  // ---------- ABSTRACT CLASS ----------
  // An abstract class can't be instantiated. It is made up of both abstract
  // and non-abstract methods and fields

  abstract class Mammal(val name : String){
    // An abstract field has no initial value
    var moveSpeed : Double

    // An abstract method has no body
    def move : String

  }

  class Wolf(name : String) extends Mammal(name){
    // You don't use override when defining abstract fields
    var moveSpeed = 35.0;

    def move = "The wolf %s runs %.2f mph".format(this.name, this.moveSpeed)

  }

  // ---------- TRAITS ----------
  // A trait is a like a Java interface in that a class can extend more then 1
  // Unlike Java interfaces traits can provide concrete methods and fields
  trait Flyable {
    def fly : String

  }

  trait Bulletproof {
    def hitByBullet : String

    // You can define concrete methods in traits
    def ricochet(startSpeed : Double) : String = {
      "The bullet ricochets at a speed of %.1f ft/sec".format(startSpeed * .75)
    }
  }

  // The first trait starts with extends and then with for each other
  class Superhero(val name : String) extends Flyable with Bulletproof{
    def fly = "%s flys through the air".format(this.name)

    def hitByBullet = "The bullet bounces off of %s".format(this.name)
  }

/*
val word = ArrayBuffer("d", "p", "h")
def compare[T <: String](first: T, second: T) = {
  def compare2(iteration: Int): Boolean = {
    val (left, right) = (first(iteration), second(iteration))
    if (left == right)
      compare2(iteration + 1)
    else
      left.toLower < right.toLower
  }
  compare2(0)
}
println(word.sortWith(compare))
*/
} // ---------- End of object ScalaTut ----------



//map  action on each element

//
//mapping for each no updating

//implicit value (default value)
implicit val discount = 0.1
def totalPrice (q :Int , p :Double)(implicit dis : Double): Double = {
  q * p * (1-dis)
}
println(f"Total price of stuff is ${totalPrice(2,3.5)}%2.2f")

//



//Optional callback function
import scala.util.Random
def printStuff(sendStuff: Option[() => Unit] = None) = {
  println("Stuff")
  sendStuff map (callback => callback())
}
printStuff()
printStuff(Some(() => {
  println("Finished")
}))
//

//lazy save memeory initialised when needed
// strict always initiallise
/// lazy is .withfilter, strict is .filter
lazy val randomLong = {
  Random.nextLong()
}
randomLong


//
//Composition/andThen/compose
val finCost = 10.58
val aDiscount = (amount: Double) => {
  val discount = 1.42
  amount - discount
}
val applyTax = (amount: Double) => {
  val tax = 0.2
  amount + amount * tax
}
println(f"The total after tax is ${(aDiscount andThen applyTax) (finCost)}%2.2f")


//Nested functions
def checks(names:String)={
  val list = List("one", "two", "three")
  val available = (names.nonEmpty && names.length>0)&& list.contains(names)
  available
}
checks("one")


//Higher Order function -passing a function to another function
def totalPriceH(beerType:String) (q:Int)(discount:Double=>Double)={
  println(s"q is equal to $q and type is $beerType")
  val amount = q * 2
  discount(amount)
}
val applyDiscount = (totalCost:Double)=> {
  val discount = 0.1
  totalCost-discount
}
println(f"the total price H is ${totalPriceH("Hobgoblin")(2)(applyDiscount)}%2.2f")


//
//Algebraic Data Types
val isModulus: (Int, Int) => Boolean = (i, j) => j % i == 0
val mod3 = isModulus(3, _)
val mod5 = isModulus(5, _)

val fizzBuzz: Int => String = {
  case i if mod3(i) && mod5(i) => "FizzBuzz"
  case i if mod3(i) => "Fizz"
  case i if mod5(i) => "Buzz"
  case i => i.toString
}

//enums involved Algebraic Data Types
sealed abstract class FizzBuzzADT(i: Int) {
  override def toString: String = i.toString
}

case class Fizz(i: Int) extends FizzBuzzADT(i) {
  override val toString = "Fizz"
}

case class Buzz(i: Int) extends FizzBuzzADT(i) {
  override val toString = "Buzz"
}

case class FizzBuzz(i: Int) extends FizzBuzzADT(i) {
  override val toString = "FizzBuzz"
}

case class JustInt(i: Int) extends FizzBuzzADT(i)

  def apply(i: Int): FizzBuzzADT = i {
    case _ if i % 3 == 0 && i % 5 == 0 => FizzBuzz(i)
    case _ if i % 3 == 0 => Fizz(i)
    case _ if i % 5 == 0 => Buzz(i)
    case _  => JustInt(i)
  }

Stream(1 to 15: _*).map(fizzBuzzADT(_)).foreach(println)


//Collection hierachy
//                          Traversable
//                               |
//            >>>>>>>>>>>>> Iterable <<<<<<
//            |                  |        |
//      >>> Seq <<<<<<<<<       Set      Map
//      |     |         |
//      |  LinearSeq  IndexedSqe
//      |     |         |
//  Array   List      Vector
//

//  List
//  finite immutable Sequence, Preserves order, contains duplicates,immutable
//to "mutate" an immutable you simply create a new list
val list1: List[String] = List("Thing1", "Thing2", "Everything else")
println(s"First index in the list is ${list1.head} followed by ${list1(1)} and ${list1(2)}")
val list2 = "Other" +: list1 //Append, to Prepend it's :+
//to join lists use :: this places the list inside the list and ::: concats the lists
val list3 = List.empty //creates an empty list

//List buffer is a mutable list
val buff = scala.collection.mutable.ListBuffer.empty[Int]
buff +=1; buff += 10 ; buff.toList //results in List(1,10)

//Array
//Preserves order, can contain duplicates, mutable
// scala arrays can be generic where Array[T] can be type passed, supports all Seq Ops.

val array1 : Array[String] = Array ("Thing1", "Thing2", "Thing3")
println(array1(1))
val row =2 ; val columns = 3
val array2: Array[Array[String]] = Array.ofDim[String](row,columns)
val array3: Array[Int] = (1 to 10).toArray[Int] // makes an array with 1 through 10


//ArrayBuffer
//used for appending things to a array constantly
val buff2 = scala.collection.mutable.ArrayBuffer.empty[Int]
buff2 +=1; buff2 += 10 ; buff2.toList //results in List(1,10)


//Vector
//immutable
//fast when processing the head, but cycles through each index so can take time
val vector1 = Vector(1,2,3)

*/

/*
def usingunarydecs: Unit = {
  class Rat(x: Int, y: Int) {
    require(y != 0, "must be nonzero")


    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

    private val g = gcd(x, y)

    def this(x: Int) = this(x, 1)

    def num = x / g

    def den = y / g

    def <(that: Rat) = num * that.den < that.num * den

    def max(that: Rat) = if (this < that) that else this

    def +(that: Rat): Unit =
      new Rat(
        num * that.den + that.num * den,
        den * that.den
      )

    def unary_- : Rat = new Rat(-num, den)

    def -(that: Rat) = this + -that

    override def toString = f"$num/$den"
  }
  val x = new Rat(1, 3)
  val y = new Rat(5, 7)
  val z = new Rat(3, 2)
  x.num
  x.den
  x.+(y)
  y.+(y)
}


def setPractice: Unit = {
  //Sets
  //does not preserve order, does not contain duplicates
  // used for Tests
  val set1 = Set(1, 2, 3)
  val set2 = Set(4, 5, 6)
  set1(1)
  set1 contains 2
  set1 subsetOf set2 // Tests - Boolean checks
  set1 + 4
  set1 + (5, 6, 7)
  set1 ++ set2 // Additions
  set1 - 3
  set1 - (1, 3)
  set1 -- set2 // Removals
  set1 & set2
  set1 | set2
  set1 &~ set2 // Intersect, Union and Difference

  //For mutable set import is required
  val aValue = 1
  val bool = true
  val set3 = scala.collection.mutable.Set(1, 2, 3, 4, 5, 6, 7)
  val set4 = Set(1, 3, 4) // immutable set
  set3 += 5
  set3 ++= set4 //adds to front of the lists
  set3 add 43 // add new value end of the list and returns true if it wasn't in the set already
  set3 -= 1
  set3 --= set4 //removals
  set3 remove 4 // removes value if can and returns true if it removed it
  set3 retain (aValue => aValue > 3) //removes all values below 3
  set3.clear()
  val set5 = set3.clone() // clones the mutable set
  set3.update(aValue, bool) // adds aValue if bool is true, or removess if false
}
//Maps
// key to value pairs, could be data types, functions or maps
def mappingStuff: Unit = {
  def adder(v1: Int, v2: Int): Int = v1 + v2

  val map1 = Map(1 -> "Rock", 2 -> "Paper", 3 -> "Scissors")
  val map2 = Map("Fire" -> 1, "Ice" -> 2, "Storm" -> 3)
  val map3 = Map(map1 -> adder(1, 2), map2 -> adder(3, 4))
  map1(2);
  map1.get(2);
  map2("Fire");
  map1.getOrElse(3, "Blah") //getOrElse is key or Default Value

  val colors = Map("red" -> "best", "azure" -> "notSoBlue", "yellow" -> "ok")

  val nums: Map[Int, Int] = Map()

  println("Keys in colors : " + colors.keys)
  println("Values in colors : " + colors.values)
  println("Check if colors is empty : " + colors.isEmpty)
  println("Check if nums is empty : " + nums.isEmpty)
  colors.keys.foreach(i => print(i + " is " + colors(i)))
}
//Creating classes and objects
def createclass: Unit = {
  class SingleClass(var classString: String, val classInt: Int) {
    def singleClassDef = println(s"Class String is $classString and the Class Int is  $classInt")
  }

  //to create the object of a class
  val singleObject1 = new SingleClass("Object1", 1)
  val singleObject2 = new SingleClass("Object2", 2)
  singleObject1.singleClassDef
  singleObject2.singleClassDef
  singleObject1.classString
}
//to access the values in the objects

//constructors
def constructor: Unit = {
  class ConstructorClass(var classString: String, val moreString: String, val classDouble: Double) {
    def this(classString: String) = this(classString, "", 0.0)

    def this(classString: String, moreString: String) = this(classString, moreString, 0.0)

    override def toString: String = "%s %s, age%2.2f".format(classString, moreString, classDouble)

    def printClass(): Unit =
      if (classDouble != 0)
        println(s"Class String is $classString furthermore $moreString and the Class Int is $classDouble")
      else
        println(s"Class String is $classString and $moreString")
  }

  val constructorObject1: ConstructorClass = new ConstructorClass("Only a String in this Object")
  val constructorObject2: ConstructorClass = new ConstructorClass("String and Number here", null, 2.2)
  constructorObject1.printClass()
  constructorObject2.printClass()
  constructorObject1.toString
  constructorObject2.toString
}

//Companion Objects
def CompanionObj: Unit = {
  class CompanionObjectClass(val companionObjectString: String, val companionObjectInt: Option[Int] = None) {
    def printCompanionObjectClass(): Unit = println(s"The Object name is $companionObjectString and the Object Int is ${companionObjectInt.getOrElse(0)}")
  }


  object CompanionObjectClass {
    def apply(companionObjectString: String, companionObjectInt: Int): CompanionObjectClass = {
      new CompanionObjectClass(companionObjectString)
    }
  }
  val companionObject = CompanionObjectClass("CompanionObjectString", 1)
  companionObject.printCompanionObjectClass()
  val companionObject2 = CompanionObjectClass("CompanionObjectString2", 2)
  companionObject2.printCompanionObjectClass()
}
//Companion Objects Casemapping
def companionCasemap: Unit = {
  class CompanionObjectClass(val companionObjectString: String, val companionObjectInt: Option[Int] = None) {
    def printCompanionObjectClass(): Unit = println(s"The Object name is $companionObjectString and the Object Int is ${companionObjectInt.getOrElse(0)}")
  }
  class ObjectExtended1(objectExtendedString: String) extends CompanionObjectClass("ObjectExtendedString1")
  class ObjectExtended2(objectExtendedString: String) extends CompanionObjectClass("ObjectExtendedString2")

  object CompanionObjectClass {
    def apply(companionObjectString: String): CompanionObjectClass = {
      companionObjectString match {
        case "ObjectExtended1" => new ObjectExtended1(companionObjectString)
        case "ObjectExtended2" => new ObjectExtended2(companionObjectString)
        case _ => new CompanionObjectClass(companionObjectString)
      }
    }
  }
  val objectExtended1 = CompanionObjectClass("ObjectExtended1")
  val objectExtended2 = CompanionObjectClass("ObjectExtended2")
  val objectExtended3 = CompanionObjectClass("ObjectExtended3")

}
def abstractClasses: Unit = {
  abstract class AbstractClass {
    def abstractString: String

    def abstractInt: Int

    def abstractblankdef

    def abstractdefAllToString {
      println(s"The abstractString is $abstractString and the abstractInt is $abstractInt")
    }
  }

  class ExtendedFromAbstractClass1(extendedAbstractString: String, extendedAbstractInt: Int) extends AbstractClass {
    def abstractString: String = extendedAbstractString

    def abstractInt: Int = extendedAbstractInt

    def abstractblankdef: Unit = {
      println("This has Overwritten the abstract def.")
    }
  }

  val extendedObjectFromAbstractClass1: ExtendedFromAbstractClass1 = new ExtendedFromAbstractClass1("Object1String", 1)
  extendedObjectFromAbstractClass1.abstractblankdef
  extendedObjectFromAbstractClass1.abstractdefAllToString
}

*/
def loopIfTest(): Unit = {
  var a = 0;
  val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

  numList.
  // for loop execution with multiple filters
  for (a <- numList
       if a != 3; if a < 8) {
    println("Value of a: " + a);
  }
}
loopIfTest()
println("Bop!")