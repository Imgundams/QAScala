package GaragePackage

/**
  * Created by Administrator on 12/06/2017.
  */
case class Car(carId: Int, carMake: String, carModel: String, numberOfDoors: Int, components :Parts,carDamage:Int, timeForFix:Int,carRepairCost:Double) extends Vehicle {
  def vehicleType: VehicleTypes.Value = VehicleTypes.Car

  def id: Int = carId

  def make: String = carMake

  def model: String = carModel

  var parts: Parts = components

  var damaged: Int = carDamage

  var repairCost:Double = carRepairCost

  var timeToFixed :Int = timeForFix

  override def toString :String = s"$vehicleType,\t$carId,\t$make,\t$model,\t"+f"$repairCost%1.2f"

  override def toFormattedString: String = s"Vehicle type: $vehicleType \tCar id:\t$id \tCar make:\t$make \tCar model:\t$model\tNumber of Doors:\t$numberOfDoors" + brokenCheck(damaged)

}