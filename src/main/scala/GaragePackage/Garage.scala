package GaragePackage

import com.sun.org.apache.bcel.internal.generic.RETURN

import scala.collection.mutable.{ArrayBuffer, ListBuffer}

/*
  Created by Boss on 06/06/2017.
*/
object Garage {

  def main(args: Array[String]) {
    // Adding the Vehicles
    addVehicle(VehicleTypes.Car, "Aldi", "R8", 1)
    addVehicle(VehicleTypes.Bike, "Kawasaki", "Ninja", 2)
    addVehicle(VehicleTypes.Bike, "Kawasaki", "Ninja", 3)
    addVehicle(VehicleTypes.Bike, "Kawasaki", "Ninja", 4)

    //Testing the Vehicles
    println(vehicleList.toString())
    removeVehicleById(2)
    removeVehicle(VehicleTypes.Bike)
    println(vehicleList.toString())
    addVehicle(VehicleTypes.Bike, "Kawasaki", "Ninja", 5)
    addVehicle(VehicleTypes.Bike, "Kawasaki", "Ninja", 6)
    println(vehicleList.toString())
    addVehicle(VehicleTypes.Truck, "CycleMaster", "Speedy", 7)

    //Employing the crew
    addEmployee("Smelly Small", 111111, JobTitles.Supervisor)
    addEmployee("Smally Small", 222222, JobTitles.Assistant)
    addEmployee("Smolly Small", 333333, JobTitles.Mechanic)
    addEmployee("Dave Doody", 444444, JobTitles.Cleaner)
    addEmployee("Mel Moat", 555555, JobTitles.Assistant)
    println(employeeList.toString())
    println(vehicleList.foreach(x=>println(x.toString)))
  }


  var vehicleList = new ArrayBuffer[Vehicle]()
  var fixedVehicleList = new ArrayBuffer[Vehicle]()
  var employeeList = new ArrayBuffer[Employee]()

  def addVehicle(vehicleType: VehicleTypes.Value, make: String, model: String, engineOrDoors: Int): Unit = {
    vehicleType match {
      case VehicleTypes.Car => {
        vehicleList += Car(id1.unique, make, model, engineOrDoors, damageValue.randomBoolean)

      }
      case VehicleTypes.Bike => {
        vehicleList += Bike(id1.unique, make, model, engineOrDoors, damageValue.randomBoolean)

      }
      case _ => println(s"$vehicleType,$make,$model,$engineOrDoors is not a Car or Bike, Get out of here!")
    }
  }

  def removeVehicleById(idToRemove: Int): Unit = {
   // vehicleList.foreach(vehicle => if (vehicle.id == idToRemove) vehicleList -= vehicle return)
  }

  def removeVehicle(vehicleType: VehicleTypes.Value): Unit = {
    vehicleType match {
      case VehicleTypes.Car => {
        vehicleList = vehicleList.filter(!_.isInstanceOf[Car])
      }
      case VehicleTypes.Bike => {
        vehicleList = vehicleList.filter(!_.isInstanceOf[Bike])
      }
      case _ => println(s"$vehicleType is not a Car or Bike, Get out of here!")
    }
  }

  def addEmployee(employeeFullName: String, employeeContactNumber: Int, jobTitle: JobTitles.Value): Unit = {
    jobTitle match {
      case JobTitles.Cleaner => {
        employeeList += Employee(id2.unique, employeeFullName, employeeContactNumber, jobTitle, 9000)
      }
      case JobTitles.Assistant => {
        employeeList += Employee(id2.unique, employeeFullName, employeeContactNumber, jobTitle, 12000)
      }
      case JobTitles.Mechanic => {
        employeeList += Employee(id2.unique, employeeFullName, employeeContactNumber, jobTitle, 25000)
      }
      case JobTitles.Supervisor => {
        employeeList += Employee(id2.unique, employeeFullName, employeeContactNumber, jobTitle, 39000)
      }
    }
  }
  def fixAll(): Unit = {}
  def fixVehicleall(): Unit = {
    for (vehicle <- vehicleList) {
    }
  }

  def empty(): Unit = {}

  def printall(): Unit = {}

  object id1 {
    private val clockticker = new java.util.concurrent.atomic.AtomicInteger

    def unique: Int = clockticker.getAndIncrement + 1
  }

  object id2 {
    private val clockticker = new java.util.concurrent.atomic.AtomicInteger
    def unique: Int = clockticker.getAndIncrement + 1
  }

  object damageValue {
    private val random = scala.util.Random
    def randomBoolean: Boolean = random.nextBoolean()
  }
}