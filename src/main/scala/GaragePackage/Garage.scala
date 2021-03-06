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
    calculateCostFromDamage()
    printGarageContentFormatted()

    // removeVehicleById(2)
    // removeVehicles(VehicleTypes.Car)

    findAndPrintById(1)
    println()
    garageWork()
    // fixAllVehicle()
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

  def printGarageContentFormatted(): Unit = {
    vehicleList.foreach(vehicle => {
      println(vehicle.toFormattedString)
    })
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
          employeeList += Employee(idGenerator.unique2, employeeFullName, employeeContactNumber, jobTitle, 12000, isBusy = false)
        case JobTitles.Mechanic =>
          employeeList += Employee(idGenerator.unique2, employeeFullName, employeeContactNumber, jobTitle, 25000, isBusy = false)
        case JobTitles.Supervisor =>
          employeeList += Employee(idGenerator.unique2, employeeFullName, employeeContactNumber, jobTitle, 39000, isBusy = false)
      }
    }
    else whenClosed()
  }

  def findEmployeeNameById(eId: Int): String = {
    var nametoSend: String = ""
    employeeList.foreach(employee => if (employee.id == eId) nametoSend = employee.fullName)
    nametoSend
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
        vehicle.damaged = 0
      })
      println("Hard work is done. All is right, all is fixed")
    } else whenClosed()
  }

  def fixById(vId: Int): Unit = {
    if (open) {
      vehicleList.foreach(vehicle => {
        if (vehicle.id == vId) {
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

  def partsFix(vehicle: Vehicle): Unit = {
    vehicle.parts.windows = false
    vehicle.parts.battery = false
    vehicle.parts.alternator = false
    vehicle.parts.breakes = false
    vehicle.parts.engine = false
    vehicle.parts.lights = false
    vehicle.parts.radiator = false
    vehicle.parts.seats = false
    vehicle.parts.shockAbsorber = false
    vehicle.parts.transmission = false
    vehicle.parts.wheels = false
  }

  def calculateCostFromDamage(): Unit = {
    vehicleList.foreach {
      case vehicleToCalculate if vehicleToCalculate.vehicleType == VehicleTypes.Car =>
        vehicleToCalculate.repairCost = vehicleToCalculate.damaged * 29.5
      case vehicleToCalculate if vehicleToCalculate.vehicleType == VehicleTypes.Bike =>
        vehicleToCalculate.repairCost = vehicleToCalculate.damaged * 9.3
      case vehicleToCalculate => vehicleToCalculate.repairCost = vehicleToCalculate.damaged * 19
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

  def garageWork(): Unit = {
    val hoursInAShiftPer: Int = 8
    var shiftCount: Int = 1
    var hoursWorked: Int = 0
    var dailyRepairCost: Double = 0
    var dayCount = 1

    println(s"\nDay $dayCount summary")

    vehicleList.foreach(v => {
      var timeToWork = v.timeToFixed
      //  if (shiftCount < 2 && timeToWork == v.timeToFixed)
      if ((shiftCount > 5 && timeToWork == v.timeToFixed)||v.id == vehicleList.length) {
        // run out of employees and ve
        shiftCount = 1
        println(f"Today's total earnings of the garage through repair fees: £$dailyRepairCost%1.2f")
        dailyRepairCost = 0
        dayCount = dayCount + 1
        println(s"\nDay $dayCount summary")
      } // max hours of all employees in one working day
      if (v.damaged == 0) {
        println(s"Vehicle id " + v.id + " is Fixed. fixing next vehicle")
      } //if Fixed get next car -- shouldn't appear
      else {


        while (employeeList.length > shiftCount || timeToWork > 0) {
          //while no damage or shift count

          for (i <- 0 to hoursInAShiftPer; if v.damaged > 0 || hoursWorked < hoursInAShiftPer) {
            if (timeToWork < 1) {
              //VehicleFixed
              partsFix(v)
              v.damaged = 0
            }
            else {//keepworking
              timeToWork = timeToWork - 1
              hoursWorked = hoursWorked + 1


            }
          }

          if (v.damaged > 0) {//vehicle still broken after 8 hours
            hoursWorked = 0
            println("Employee id " + shiftCount + " worked on vehicle id " + v.id + " today and is still broken. " + timeToWork + " hours left till done")
            shiftCount = shiftCount + 1 //next employee
          }

          else if (hoursWorked > hoursInAShiftPer) { //could not finished after shift
            println("Employee id " + shiftCount + " worked on vehicle id " + v.id + " today and is still broken. " + timeToWork + " hours left till done")
            hoursWorked = 0
            shiftCount += 1

          }
          else if (v.damaged == 0) {
            //fixed after or during 8 hours
            dailyRepairCost += v.repairCost
            // print("" + employeeList.foreach(e => if (e.employeeId == shiftCount) e.employeeFullName))
            println("Employee id " + shiftCount + " worked on vehicle id " + v.id + " today and fixed it, with " + (hoursInAShiftPer - hoursWorked) + " hours left to work.")
          }

          else {
            println("this line shouldn't appear. Fix the for loop")
          }
        }
      }
    }

    )
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