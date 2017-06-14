package GaragePackage

/**
  * Created by Administrator on 12/06/2017.
  */
case class Car(carId: Int, carMake: String, carModel: String, numberOfDoors: Int, broken: Int, costsToRepair:Double) extends Vehicle {
  def vehicleType: VehicleTypes.Value = VehicleTypes.Car

  def id: Int = carId

  def make: String = carMake

  def model: String = carModel

  var damaged: Int = broken
  var repairCost:Double =costsToRepair

  override def toString = s"$vehicleType,$carId,$make,$model,$numberOfDoors,$damaged"

  override def toFormattedString: String = s"Vehicle type: $vehicleType \tCar id:$id \tCar make:$make \tCar model:$model\tNumber of Doors:$numberOfDoors\t" + brokenCheck(damaged)

}