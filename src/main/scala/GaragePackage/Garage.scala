package GaragePackage

import scala.collection.mutable.ArrayBuffer

//  Created by Dani on 06/06/2017.

object Garage {

  //Runner
  def main(args: Array[String]) {
    // Adding the Vehicles
    openOrClose()
    addVehicle(VehicleTypes.Car, "Aldi", "R8", 1)
    addVehicle(VehicleTypes.Bike, "Kawasaki", "Ninja", 2)
    addVehicle(VehicleTypes.Bike, "Kawasaki", "Ninja", 3)
    addVehicle(VehicleTypes.Bike, "Kawasaki", "Ninja", 4)
    addVehicle(VehicleTypes.Bike, "Kawasaki", "Ninja", 5)
    addVehicle(VehicleTypes.Bike, "Kawasaki", "Ninja", 6)

    //Testing the Vehicles
    vehicleList.foreach(v => println(v.toFormattedString))

    // removeVehicleById(2)
    // removeVehicles(VehicleTypes.Car)
    findAndPrintById(4)
    println(vehicleList.toString())
    println()
    vehicleList.foreach(v => print(v.damaged))
    println()
    fixAllVehicle()
    vehicleList.foreach(v => print(v.damaged))
    println()

    addVehicle(VehicleTypes.Truck, "CycleMaster", "Speedy", 7)
    vehicleList.foreach(v => println(v.toFormattedStringAfterFix))

    //Employing the crew
    addEmployee("Smelly Small", 111111, JobTitles.Supervisor)
    addEmployee("Smally Small", 222222, JobTitles.Assistant)
    addEmployee("Smolly Small", 333333, JobTitles.Mechanic)
    addEmployee("Dave Doody", 444444, JobTitles.Cleaner)
    addEmployee("Mel Moat", 555555, JobTitles.Assistant)
    println(employeeList.toString())
    printall()
    vehicleList.foreach(v => v.toFormattedString)
  }

  //Code
  var vehicleList = new ArrayBuffer[Vehicle]()
  var fixedVehicleList = new ArrayBuffer[Vehicle]()
  var employeeList = new ArrayBuffer[Employee]()
  var open: Boolean = false
  var closeCheck: Boolean = false

  def addVehicle(vehicleType: VehicleTypes.Value, make: String, model: String, engineOrDoors: Int): Unit = {
    if (open) {
      vehicleType match {
        case VehicleTypes.Car => vehicleList += Car(id1.unique, make, model, engineOrDoors, damageValue.randomBoolean, 0)
        case VehicleTypes.Bike => vehicleList += Bike(id1.unique, make, model, engineOrDoors, damageValue.randomBoolean, 0)
        case _ => println(s"$vehicleType,$make,$model,$engineOrDoors is not a Car or Bike, Get out of here!")
      }
    }
    else whenClosed()
  }

  def removeVehicleById(idToRemove: Int): Unit = {
    if (open) vehicleList = vehicleList.filterNot(_.id == idToRemove)
    else whenClosed()
  }

  def removeVehicles(vehicleType: VehicleTypes.Value): Unit = {
    if (open) {
      vehicleType match {
        case VehicleTypes.Car => vehicleList = vehicleList.filter(!_.isInstanceOf[Car])
        case VehicleTypes.Bike => vehicleList = vehicleList.filter(!_.isInstanceOf[Bike])
        case _ => println(s"$vehicleType is not a Car or Bike, Get out of here!")
      }
    }
    else whenClosed()
  }

  def openOrClose(): Unit = {
    if (open) {
      println("Small Chop Shop is now closed!")
      open = false
      closeCheck = true
    } else {
      println(" ____                  _ _    ____ _                   ____  _                 ")
      println("/ ___| _ __ ___   __ _| | |  / ___| |__   ___  _ __   / ___|| |__   ___  _ __  ")
      println("\\___ \\| '_ ` _ \\ / _` | | | | |   | '_ \\ / _ \\| '_ \\  \\___ \\| '_ \\ / _ \\| '_ \\ ")
      println(" ___) | | | | | | (_| | | | | |___| | | | (_) | |_) |  ___) | | | | (_) | |_) |")
      println("|____/|_| |_| |_|\\__,_|_|_|  \\____|_| |_|\\___/| .__/  |____/|_| |_|\\___/| .__/ ")
      println("                                              |_|                       |_|      is now Open!\n")
      open = true
    }
  }

  def whenClosed(): Unit = {
    if (closeCheck) {
      println("Small Chop Shop is now closed please Go home")
      closeCheck = false
    }
    else print("")

  }

  def addEmployee(employeeFullName: String, employeeContactNumber: Int, jobTitle: JobTitles.Value): Unit = {
    if (open) {
      jobTitle match {
        case JobTitles.Cleaner =>
          employeeList += Employee(id2.unique, employeeFullName, employeeContactNumber, jobTitle, 9000)
        case JobTitles.Assistant =>
          employeeList += Employee(id2.unique, employeeFullName, employeeContactNumber, jobTitle, 12000)
        case JobTitles.Mechanic =>
          employeeList += Employee(id2.unique, employeeFullName, employeeContactNumber, jobTitle, 25000)
        case JobTitles.Supervisor =>
          employeeList += Employee(id2.unique, employeeFullName, employeeContactNumber, jobTitle, 39000)
      }
    }
    else whenClosed()
  }

  def findAndPrintById(vehicleId: Int): Unit = {
    if (open) println(vehicleList.find(vehicle => vehicleId == vehicle.id))
    else whenClosed()
  }

  def fixAllVehicle(): Unit = {
    if (open) {
      vehicleList.foreach(vehicle => {
        calculateCostFromDamage(vehicle)
        vehicle.damaged = 0
      })
      println("Hard work is done. All is right, all is fixed")
    } else whenClosed()
  }

  def fixById(vId: Int): Unit = {
    if (open) {
      vehicleList.foreach(vehicle => {
        if (vehicle.id == vId) {
          calculateCostFromDamage(vehicle)
          vehicle.damaged = 0
          println(vehicle.vehicleType + s" With the Id:$vId is fixed")
        }
      }
      )
    } else whenClosed()
  }

  def calculateCostFromDamage(vehicleToCalculate: Vehicle): Unit = {
    vehicleToCalculate match {
      case _ if vehicleToCalculate.vehicleType == VehicleTypes.Car =>
        vehicleToCalculate.repairCost = vehicleToCalculate.damaged * 5
      case _ if vehicleToCalculate.vehicleType == VehicleTypes.Bike =>
        vehicleToCalculate.repairCost = vehicleToCalculate.damaged * 2
      case _ => vehicleToCalculate.repairCost = vehicleToCalculate.damaged * 9
    }
  }

  def printall(): Unit
  = {
    if (open) {
      println("|          The Garage            |")
      println("__________________________________")
      println("|          The Vehicles          |")
      println("_Type_Id_Make___Model__eSize/door_")
      vehicleList.foreach(v => println(v.toString))
      println("__________________________________")
      println("|          The Employees         |")
      println("__________________________________")
      employeeList.foreach(e => println(e.toString))
    } else whenClosed()
  }

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

    //always Broken
    def randomBoolean: Int = random.nextInt(99) + 1
  }


}