import scala.collection.mutable.{ArrayBuffer, ListBuffer}

/*
  Created by Boss on 06/06/2017.
*/
class Garage {

  var vehicleList = new ListBuffer[Vehicle]()

  def addVehicle(vehicleType:String, make: String, model :String, engineOrDoors:Int): Any = {
    (vehicleType)match {
      case "Car" =>{
       var car = new Car(make,model,engineOrDoors)
        vehicleList += car
    }
      case "Bike" =>{
        var bike = new Bike(make,model,engineOrDoors)
        vehicleList += bike
      }
      case _ => "Spaceship"
    }
  }

  def removeVehicleIndex(): Unit = {}

  def removeAllBy[Type](vehicleType: Type): Unit = {}

  def removeVehicleById(id: Int): Unit = {
  }

  def empty(): Unit = {}

  def printall(): Unit = {}
}