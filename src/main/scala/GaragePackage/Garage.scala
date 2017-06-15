package GaragePackage

import scala.collection.mutable.ArrayBuffer

//  Created by Dani on 06/06/2017.

object Garage {
  //Runner
  def main(args: Array[String]) {
    // Adding the Vehicles
    openOrClose()
    addVehicle(VehicleTypes.Car, "Audi", "R8", 2)
    addVehicle(VehicleTypes.Car, "Audi", "S3", 4)
    addVehicle(VehicleTypes.Car, "Mazda", "Mazda2", 4)
    addVehicle(VehicleTypes.Car, "Volvo", "V40", 4)
    addVehicle(VehicleTypes.Car, "Volvo", "XC60", 4)
    addVehicle(VehicleTypes.Car, "Jaguar", "F-TYPE", 2)
    addVehicle(VehicleTypes.Car, "Fiat", "Panda", 4)
    addVehicle(VehicleTypes.Bike, "Triumph", "X-75", 740)
    addVehicle(VehicleTypes.Bike, "Honda", "CBR125", 125)
    addVehicle(VehicleTypes.Bike, "Honda", "CBR600R", 600)
    addVehicle(VehicleTypes.Bike, "Honda", "Vison 110", 108)
    addVehicle(VehicleTypes.Bike, "Yamaha", "YZF-R1M", 998)
    addVehicle(VehicleTypes.Bike, "Yamaha", "YS125", 125)
    addVehicle(VehicleTypes.Bike, "Suzuki", "GSF750", 748)

    //Incorrect type added check
    addVehicle(VehicleTypes.Truck, "CycleMaster", "Speedy", 7)

    //Testing the Vehicles
    calculateDamageAndTimeToFix()
    printGarageContentFormatted()

    // removeVehicleById(2)
    // removeVehicles(VehicleTypes.Car)

    findAndPrintById(1)
    println()
    fixAllVehicle()
    println()

    vehicleList.foreach(v => println(v.toFormattedStringAfterFix))

    //Employing the crew
    addEmployee("Smelly Small", 111111, JobTitles.Supervisor)
    addEmployee("Smally Small", 222222, JobTitles.Mechanic)
    addEmployee("Smolly Small", 333333, JobTitles.Mechanic)
    addEmployee("Dave Doodeeooh", 444444, JobTitles.Mechanic)
    addEmployee("Mel Moatanoona", 555555, JobTitles.Assistant)
    println()
    printAll()
    vehicleList.foreach(v => v.toFormattedString)
  }

  //Code
  var vehicleList = new ArrayBuffer[Vehicle]()
  var fixedVehicleList = new ArrayBuffer[Vehicle]()
  var employeeList = new ArrayBuffer[Employee]()
  var open: Boolean = false
  var closeCheck: Boolean = false

  def printAll(): Unit = {
    if (open) {
      println("__________________________________")
      println("|          The Garage            |")
      println("__________________________________")
      println("|          The Vehicles          |")
      println("_Type_Id_Make___Model__RepairCost_")
      vehicleList.foreach(v => println(v.toString))
      println("__________________________________")
      println("|          The Employees         |")
      println("__________________________________")
      employeeList.foreach(e => println(e.toString))
    } else whenClosed()
  }

  def printGarageContentFormatted():Unit ={
    vehicleList.foreach(vehicle => {println(vehicle.toFormattedString)})
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

  def addVehicle(vehicleType: VehicleTypes.Value, make: String, model: String, engineOrDoors: Int): Unit = {
    if (open) {
      vehicleType match {
        case VehicleTypes.Car => vehicleList += Car(idGenerator.unique, make, model, engineOrDoors, randomPartDamage(), 0, 0, 0)
        case VehicleTypes.Bike => vehicleList += Bike(idGenerator.unique, make, model, engineOrDoors, randomPartDamage(), 0, 0, 0)
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

  def addEmployee(employeeFullName: String, employeeContactNumber: Int, jobTitle: JobTitles.Value): Unit = {
    if (open) {
      jobTitle match {
        case JobTitles.Assistant =>
          employeeList += Employee(idGenerator.unique2, employeeFullName, employeeContactNumber, jobTitle, 12000)
        case JobTitles.Mechanic =>
          employeeList += Employee(idGenerator.unique2, employeeFullName, employeeContactNumber, jobTitle, 25000)
        case JobTitles.Supervisor =>
          employeeList += Employee(idGenerator.unique2, employeeFullName, employeeContactNumber, jobTitle, 39000)
      }
    }
    else whenClosed()
  }

  def findAndPrintById(vehicleId: Int): Unit = {
    if (open) vehicleList.foreach(vehicle => {
      if (vehicle.id == vehicleId) println(vehicle.toFormattedString)
    })
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

  def calculateDamageAndTimeToFix(): Unit = {
    vehicleList.foreach(vehicle => {
      vehicle.damaged = damageCalcPiecesToDamage(vehicle.parts)
      vehicle match {
        case _: Car => vehicle.timeToFixed = piecesToTimeToFix(vehicle.parts)
        case _: Bike => vehicle.timeToFixed = piecesToTimeToFix(vehicle.parts) / 2
        case _ => vehicle.timeToFixed = piecesToTimeToFix(vehicle.parts)
      }

    })
  }

  def randomPartDamage(): Parts = {
    Parts(randomValue.randomBoolean, randomValue.randomBoolean, randomValue.randomBoolean, randomValue.randomBoolean, randomValue.randomBoolean, randomValue.randomBoolean, randomValue.randomBoolean, randomValue.randomBoolean, randomValue.randomBoolean, randomValue.randomBoolean, randomValue.randomBoolean)
  }

  def calculateCostFromDamage(vehicleToCalculate: Vehicle): Unit = {
    vehicleToCalculate match {
      case _ if vehicleToCalculate.vehicleType == VehicleTypes.Car =>
        vehicleToCalculate.repairCost = vehicleToCalculate.damaged * 29.5
      case _ if vehicleToCalculate.vehicleType == VehicleTypes.Bike =>
        vehicleToCalculate.repairCost = vehicleToCalculate.damaged * 9.3
      case _ => vehicleToCalculate.repairCost = vehicleToCalculate.damaged * 19
    }
  }

  def damageCalcPiecesToDamage(pieces: Parts): Int = {
    var totalDamaged: Int = 0
    if (pieces.alternatorBroken) totalDamaged += 13
    if (pieces.batteryBroken) totalDamaged += 2
    if (pieces.breakesBroken) totalDamaged += 11
    if (pieces.engineBroken) totalDamaged += 20
    if (pieces.lightsBroken) totalDamaged += 1
    if (pieces.radiatorBroken) totalDamaged += 9
    if (pieces.seatsBroken) totalDamaged += 13
    if (pieces.shockAbsorberBroken) totalDamaged += 5
    if (pieces.transmissionBroken) totalDamaged += 14
    if (pieces.wheelsBroken) totalDamaged += 8
    if (pieces.windowsBroken) totalDamaged += 4
    totalDamaged
  }

  def piecesToTimeToFix(pieces: Parts): Int = {
    var totalHours: Int = 0
    if (pieces.alternatorBroken) totalHours += 2
    if (pieces.batteryBroken) totalHours += 1
    if (pieces.breakesBroken) totalHours += 2
    if (pieces.engineBroken) totalHours += 5
    if (pieces.lightsBroken) totalHours += 1
    if (pieces.radiatorBroken) totalHours += 2
    if (pieces.seatsBroken) totalHours += 2
    if (pieces.shockAbsorberBroken) totalHours += 2
    if (pieces.transmissionBroken) totalHours += 6
    if (pieces.wheelsBroken) totalHours += 2
    if (pieces.windowsBroken) totalHours += 4
    totalHours
  }

  object idGenerator {
    private val clockticker = new java.util.concurrent.atomic.AtomicInteger
    private val clockticker2 = new java.util.concurrent.atomic.AtomicInteger

    def unique: Int = clockticker.getAndIncrement + 1

    def unique2: Int = clockticker2.getAndIncrement + 1
  }

  object randomValue {
    private val random = scala.util.Random

    //always Broken
    def randomBoolean: Boolean = random.nextBoolean()

    def randomInt: Int = random.nextInt(99) + 1
  }

}