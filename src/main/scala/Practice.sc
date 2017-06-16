/*
import scala.collection.mutable.ArrayBuffer
case class Dude(name:String,hours:Int){
  var fullName = name
  var workingHours = hours
}
case class Part(veh:String,time:Int){
  var Vehicle = veh
  var timeTakes = time
}
var p1 : Dude = Dude("Dan",12)
var p2 : Dude = Dude ("James", 12)
var p3 : Dude = Dude ("Ladon",12)
var c1 : Part = Part("Car1", 13)
var c2 : Part = Part("Car2", 5)
var c3 : Part = Part("Car3", 11)
var carTime: ArrayBuffer[Part] = ArrayBuffer(c1,c2,c3)
var mrFixIt: ArrayBuffer[Dude] = ArrayBuffer(p1, p2,p3)

def fixIt(): Unit = {

  def working(): Unit = {
    var workinghours = 12

    carTime.foreach(car=>{
      mrFixIt.foreach(dude => {
        oneHour(dude,car)
        if(dude.hours<)

      })})

    def oneHour(person:Dude, piece:Part ): Unit = {
      piece.time-= 1
      person.hours-=1
    }
  }
}
*/

import scala.util.control.Breaks._

var end: Int = 10
var breaker: Int = 0
for (i <- 0 to end; if true) {
  println(i)
  if (i == 5) breaker += 1
}
println(end)
print("Hello")


do {
  print(breaker)

  if (breaker > 5) end = 1
  else for (j <- 0 to end) {
    breaker += 1
    if (breaker ==5) end =1
    print("bleh " + breaker)
  }

} while (end != 1)
