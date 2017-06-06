/**
  * Created by Boss on 06/06/2017.
  */
class Garage {


  import java.util

  var vehiclesList = new util.ArrayList[Vehicle]

  def addVehicle(v: Vehicle): Unit = {
    vehiclesList.add(v)
  }

  def removeVehicleIndex(v: Vehicle): Unit = {
    vehiclesList.remove(v)
  }

  def removeAllByType(s: String): Unit = {
    val iter = vehiclesList.listIterator
    while ( {
      iter.hasNext
    }) {
      val slot = iter.next
      if (s == "Car") if (slot.isInstanceOf[Car]) iter.remove
      else if (s == "Bike") if (slot.isInstanceOf[Nothing]) iter.remove
    }
    println("Vehicle type removed")
  }
/*
  def removeVehicleById(id: Int): Unit = {
    val vehicleIterator = vehiclesList.iterator
    while ( {
      vehicleIterator.hasNext
    }) {
      val v = vehicleIterator.next
      if (v == id) vehicleIterator.remove
    }
  }
*/
  def empty(): Unit = {
    vehiclesList.clear()
    println("Garage is now empty.")
  }

  def printall(): Unit = {
    println("Column info\tid\twheels\tdoors\tseats\tcolour\tmake")
      for (j <- vehiclesList) {
      println(j)
    }
  }


/*
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
*/
}