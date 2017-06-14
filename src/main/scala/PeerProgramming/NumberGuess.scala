package PeerProgramming

import scala.util.control.Breaks

/**
  * Created by Administrator on 13/06/2017.
  */
object NumberGuess extends App {
  def playGame(myNumber: Int) {
    val random = new scala.util.Random
    val loop = new Breaks
    var inputting = true
    var computerGuess:Int  = random.nextInt(1000)
    var multiplier = 1.0
    var multEffect = 0
    var tempEffect = 0.0
    var counter = 0
    loop breakable {
      while (true) {
        counter += 1
        computerGuess = (computerGuess * multiplier).toInt
        multiplier = 1
        inputting = true
        while(inputting) {
          if(computerGuess == myNumber) {println(s"Your number is $myNumber Total number of turns = $counter."); loop.break}
          try {
          var highLow = scala.io.StdIn.readLine(s"Turn number $counter. Is your number higher or lower than $computerGuess" +"?")
          highLow match {
            case _ if (highLow == "higher") => multEffect = 1
            case _ if (highLow == "lower") => multEffect = -1
          }
          var temperature = scala.io.StdIn.readLine("Your options are: boiling - super warm - warm - cold - super cold - freezing")
          temperature match {
            case _ if (temperature == "boiling") => {tempEffect = 0.02 * multEffect; multiplier = multiplier + tempEffect; inputting = false}
            case _ if (temperature == "super warm") => {tempEffect = 0.2 * multEffect; multiplier = multiplier + tempEffect; inputting = false}
            case _ if (temperature == "warm") => {tempEffect = 0.4 * multEffect; multiplier = multiplier + tempEffect; inputting = false}
            case _ if (temperature == "cold") => {tempEffect = 0.6 * multEffect; multiplier = multiplier + tempEffect; inputting = false}
            case _ if (temperature == "super cold") => {tempEffect = 0.8 * multEffect; multiplier = multiplier + tempEffect; inputting = false}
            case _ if (temperature == "freezing") => {tempEffect = 0.95 * multEffect; multiplier = multiplier + tempEffect; inputting = false}
            case _ => throw new MatchError()
          }
          }
          catch {
            case e : MatchError => println("Try again")
          }
        }
      }
    }
  }
  // User number
  playGame(175)
}
