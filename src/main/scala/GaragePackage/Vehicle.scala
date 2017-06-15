package GaragePackage

/**
  * Created by Administrator on 12/06/2017.
  */

abstract class Vehicle {
  def vehicleType: VehicleTypes.Value

  def id: Int

  def make: String

  def model: String

  def toString: String

  def parts: Parts

  var timeToFixed: Int

  def printMake() {
    println("Make is: " + make)
  }

  def printModel() {
    println("Model is: " + model)
  }
  var damaged: Int

  var repairCost:Double

  def toFormattedString: String = s"Vehicle type: $vehicleType \t$vehicleType id:$id \t$vehicleType make:$make \t$vehicleType model:$model\t" + brokenCheck(damaged)
  def toFormattedStringAfterFix: String ={
    if (damaged == 0) s"Vehicle type: $vehicleType \t$vehicleType id:$id \t$vehicleType make:$make \t$vehicleType model:$model\tTime to fix $vehicleType: $timeToFixed hours\t Repair costs: £"+f"$repairCost%1.2f"
    else
      {s"Vehicle type: $vehicleType \t$vehicleType id:$id \t$vehicleType make:$make \t$vehicleType model:$model\t is damaged please repair it"
      }
  }

  def brokenCheck(damaged: Int): String = {
    if (damaged!=0) "\t is broken and needs repairs"
    else "\tis not broken"
  }
}