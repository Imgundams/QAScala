package GaragePackage

/**
  * Created by Administrator on 12/06/2017.
  */
case class Bike(bikeId: Int, bikeMake: String, bikeModel: String, engineSize: Int, broken: Int, costsToRepair:Double) extends Vehicle {
  def vehicleType: VehicleTypes.Value = VehicleTypes.Bike

  def id: Int = bikeId

  def make: String = bikeMake

  def model: String = bikeModel

  var damaged: Int = broken
  var repairCost:Double=costsToRepair

  override def toString = s"$vehicleType,$id,$make,$model,$engineSize,$damaged"

  override def toFormattedString: String = s"Vehicle type: $vehicleType \tBike id:$id \tBike make:$make \tBike model:$model\tEngine size:$engineSize\t" + brokenCheck(damaged)

}
