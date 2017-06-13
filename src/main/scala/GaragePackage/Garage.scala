package GaragePackage

/**
  * Created by Administrator on 12/06/2017.
  */
import sun.misc.Cleaner

import scala.collection.mutable.{ArrayBuffer, ListBuffer}

/*
  Created by Boss on 06/06/2017.
*/
object Garage {

  def main(args: Array[String]) {
    // Adding the Vehicles
    addVehicle("Car", "Aldi", "R8", 4)
    addVehicle("Bike", "Kawasaki", "Ninja", 250)
    addVehicle("Bike", "Kawasaki", "Ninja", 350)
    addVehicle("Bike", "Kawasaki", "Ninja", 1000)

    //Testing the Vehicles
    println(vehicleList.toString())
    removeVehicleById(2)
    println(vehicleList.toString())
    addVehicle("Bike", "Kawasaki", "Ninja", 5000)
    addVehicle("Bike", "Kawasaki", "Ninja", 8000)
    println(vehicleList.toString())
    addVehicle("Bicycle", "CycleMaster", "Speedy", 2000)

    //Employing the crew
    addEmployee("Smelly Small", 111111, JobTitles.Supervisor)
    addEmployee("Smally Small", 222222, JobTitles.Assistant)
    addEmployee("Smolly Small", 333333, JobTitles.Mechanic)
    addEmployee("Dave Doody",444444,JobTitles.Cleaner)
    addEmployee("Mel Moat", 555555, JobTitles.Assistant)
    println(employeeList.toString())
  }


  var vehicleList = new ListBuffer[Vehicle]()
  var employeeList = new ListBuffer[Employee]()

  def addVehicle(vehicleType: String, make: String, model: String, engineOrDoors: Int): Unit = {
    vehicleType match {
      case "Car" => {
        vehicleList += Car(id1.unique, make, model, engineOrDoors,damageValue.randomInt)

      }
      case "Bike" => {
        vehicleList += Bike(id1.unique, make, model, engineOrDoors,damageValue.randomInt)

      }
      case _ => println(s"Vehicle $vehicleType,$make,$model,$engineOrDoors is not a Car or Bike, Get out of here!")
    }
  }

  def removeVehicleById(idToRemove: Int): Unit = {
    for (vehicle <- vehicleList)
      if (vehicle.id == idToRemove) vehicleList -= vehicle
  }

  def addEmployee(employeeFullName: String, employeeContactNumber: Int,  jobTitle: JobTitles.Value): Unit ={
    jobTitle match {
      case JobTitles.Cleaner =>{employeeList += Employee(id2.unique,employeeFullName,employeeContactNumber,jobTitle,9000)}
      case JobTitles.Assistant =>{employeeList += Employee(id2.unique,employeeFullName,employeeContactNumber,jobTitle,12000)}
      case JobTitles.Mechanic =>{employeeList += Employee(id2.unique,employeeFullName,employeeContactNumber,jobTitle,25000)}
      case JobTitles.Supervisor =>{employeeList += Employee(id2.unique,employeeFullName,employeeContactNumber,jobTitle,39000)}
    }
  }

  def fixVehicleall(): Unit ={
    for (vehicle <- vehicleList)
      if(vehicle.damage != 0) vehicleList.patch(2,Seq(Int),1)
  }

  def empty(): Unit = {}

  def printall(): Unit = {}

  object id1 {
    private val clockticker = new java.util.concurrent.atomic.AtomicInteger
    def unique:Int = clockticker.getAndIncrement
  }
  object id2 {
    private val clockticker = new java.util.concurrent.atomic.AtomicInteger
    def unique:Int = clockticker.getAndIncrement
  }
  object damageValue{
    private val random = scala.util.Random
    def randomInt:Int = random.nextInt(100)
  }

}