//WorkSheet

//Basic
val True = true
val False = false

//Hello World
println("Hello World")

//Assignment
val Hey = "Hello World"
print(Hey)

//Parameters
def myHelloWorldMethod(aString: String): Unit = {
  println(aString)
}
myHelloWorldMethod("Hello World")

//Return types
def myHelloWorldReturnMethod(): String = {
  val bString = "Hello World"
  bString
}
println(myHelloWorldReturnMethod())

//Type Inference
def typeInference(anyVariable: Any) = {
  println(anyVariable)
}
typeInference(3.124)
val justAString = "I Cant Change."
typeInference(justAString)
val one = 1
typeInference(one)
val notTrue = false
typeInference(notTrue)

//Strings
def stringSelector(aString: String, aInteger: Int): String = {
  aString takeRight aInteger
}
stringSelector("Hello", 3)

//Strings 2
def stringConcat(aString: String, bString: String,
                 cString: String, dString: String): String = {
  var combinedString = aString.concat(bString)
  combinedString.replace(cString, dString)
}
stringConcat("Hall", "o", "a", "e")

//Operators
def sumOf2Numbers(aNumber: Int, bNumber: Int): Int = {
  aNumber + bNumber
}
sumOf2Numbers(40, 2)

//Conditionals
def sumElseMultiplyOf2Numbers(aNumber: Int, bNumber: Int,
                              addElseMultiply: Boolean): Int = {
  if (addElseMultiply) aNumber + bNumber
  else aNumber * bNumber
}
sumElseMultiplyOf2Numbers(40, 2, True)
sumElseMultiplyOf2Numbers(40, 2, False)

//Conditionals 2
def sumElseMultiplyOf2NumbersNoZero(aNumber: Int, bNumber: Int,
                                    addElseMultiply: Boolean): Int = {
  if (aNumber == 0 && bNumber == 0) 0
  else if (aNumber == 0) bNumber
  else if (bNumber == 0) aNumber
  else if (addElseMultiply) aNumber + bNumber
  else aNumber * bNumber
}
sumElseMultiplyOf2NumbersNoZero(40, 2, True)
sumElseMultiplyOf2NumbersNoZero(40, 2, False)
sumElseMultiplyOf2NumbersNoZero(0, 2, True)
sumElseMultiplyOf2NumbersNoZero(40, 0, False)
sumElseMultiplyOf2NumbersNoZero(0, 0, True)

//Iteration
def stringRepeater(aString: String, aInt: Int): Unit = {
  for (i <- 0 to aInt) println(aString)
}
stringRepeater("of the Best", 3)

//Iteration 2
def stringRectangle(aString: String, aInt: Int): Unit = {
  for (j <- 0 to aInt) {
    for (i <- 0 to aInt) {
      print(aString)
    }
    println()
  }
}
stringRectangle("H", 6)

//Iteration 3 - FizzBuzz
def fizzBuzz(aString: String, bString: String, aInt: Int): Unit = {
  for (i <- 0 to aInt) {
    if (i % 15 == 0) println(aString.concat(bString))
    else if (i % 5 == 0) println(bString)
    else if (i % 3 == 0) println(aString)
    else println(i)
  }
}
fizzBuzz("Fizz", "Buzz", 15)

//Iteration 4
//Recursion 1
def stringRepeaterRecursion(aString: String, aInt: Int): Unit = {
  if (aInt == 0) println(aString)
  else {
    stringRepeaterRecursion(aString, aInt - 1)
    println(aString)
  }
}
stringRepeaterRecursion("of the Best", 3)

//Recursion2
def stringRectangleRecursion(aString: String, aInt: Int, bInt: Int): Unit = {
  if (aInt == 0) println(aString * bInt)
  else {
    stringRectangleRecursion(aString, aInt - 1, bInt)
    println(aString * bInt)
  }
}

stringRectangleRecursion("H", 6, 6)

//Recursion 3 - FizzBuzz
def fizzBuzzRecursion(aString: String, bString: String, aInt: Int): Unit = {
  if (aInt == 1) println(aInt)
  else {
    fizzBuzzRecursion(aString, bString, aInt - 1)
    if (aInt % 15 == 0) println(aString.concat(bString))
    else if (aInt % 5 == 0) println(bString)
    else if (aInt % 3 == 0) println(aString)
    else println(aInt)

  }
}
fizzBuzzRecursion("Fizz", "Buzz", 15)

//Pattern Matching 1
//sum else multiply output not zero unless both are
def trueFalseSumOrMultiplier(aInt: Int, bInt: Int, sumCheck: Boolean): Int = sumCheck match {
  case true => aInt + bInt
  case false => aInt * bInt
}
trueFalseSumOrMultiplier(10, 10, False)
trueFalseSumOrMultiplier(10, 10, True)

def patternMatchingConditional(aInt: Int, bInt: Int, sumCheck: Boolean): Int = sumCheck match {
  case true => {
    if (aInt == 0 && bInt == 0) 0
    else if (aInt == 0) bInt
    else if (bInt == 0) aInt
    else aInt + bInt
  }
  case _ => {
    if (aInt == 0 && bInt == 0) 0
    else if (aInt == 0) bInt
    else if (bInt == 0) aInt
    else aInt * bInt
  }
}
patternMatchingConditional(10, 20, False)
patternMatchingConditional(10, 20, True)
patternMatchingConditional(0, 20, False)
patternMatchingConditional(10, 0, False)
patternMatchingConditional(0, 0, False)

//Pattern Matching 2

def intergerSwitcher(aInt: Int, bInt: Int){

}


//Functional 1
val time: Array[String] = java.util.TimeZone.getAvailableIDs

def timeSplitters(){
}

//Intermediate
//Blackjack
