package GaragePackage

/**
  * Created by Administrator on 12/06/2017.
  */
case class Bike(bikeId:Int, bikeMake: String, bikeModel: String, engineSize: Int, broken:Boolean) extends Vehicle {
  def vehicleType: VehicleTypes.Value = VehicleTypes.Bike
  def id: Int = bikeId
  def make:String = bikeMake
  def model:String = bikeModel
  override def toString = s"$vehicleType,$bikeId,$make,$model,$engineSize"
  def damaged:Boolean = broken
}
