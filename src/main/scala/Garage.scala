import scala.collection.mutable.{ArrayBuffer, ListBuffer}

/*
  Created by Boss on 06/06/2017.
*/
class Garage {

  import Person.Customer
  import Person.Employee
  import Vehicle._
  var vehicleList = new ListBuffer[Vehicle.Vehicle]()

  def addVehicle(vehicleType:String, make: String, model :String, engineOrDoors:Int): Any = {
    (vehicleType)match {
      case "Car" =>{
       var car = new Car(make,model,engineOrDoors)
    }
      case "Bike" =>
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