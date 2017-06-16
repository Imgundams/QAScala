package GaragePackage

/**
  * Created by Administrator on 12/06/2017.
  */
case class Bike(bikeId: Int, bikeMake: String, bikeModel: String, engineSize: Int, components :Parts,bikeDamage:Int, timeForFix:Int,bikeRepairCost:Double ) extends Vehicle {
  def vehicleType: VehicleTypes.Value = VehicleTypes.Bike

  def id: Int = bikeId

  def make: String = bikeMake

  def model: String = bikeModel

  var damaged: Int = bikeDamage

  var parts: Parts = components

  var repairCost:Double = bikeRepairCost

  var timeToFixed : Int = timeForFix



  override def toString:String = s"$vehicleType,\t$id,\t$make,\t$model,\t"+f"$repairCost%1.2f"

  override def toFormattedString: String = s"Vehicle type: $vehicleType \tBike id:\t$id \tBike make:\t$make \tBike model:\t$model\tTime to fix required:\t$timeToFixed\t" + brokenCheck(damaged)

}
