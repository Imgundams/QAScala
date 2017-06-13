package GaragePackage

/**
  * Created by Administrator on 12/06/2017.
  */
case class Car(carId:Int, carMake: String, carModel: String, numberOfDoors: Int, broken:Boolean) extends Vehicle {
  def vehicleType:VehicleTypes.Value = VehicleTypes.Car
  def id: Int = carId
  def make:String = carMake
  def model: String = carModel
  override def toString = s"$vehicleType,$carId,$make,$model,$numberOfDoors"
  def damaged:Boolean = broken
}