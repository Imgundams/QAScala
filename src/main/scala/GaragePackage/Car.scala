package GaragePackage

/**
  * Created by Administrator on 12/06/2017.
  */
case class Car(carId:Int, carMake: String, carModel: String, numberOfDoors: Int) extends Vehicle {
  def id: Int = carId
  def make:String = carMake
  def model: String = carModel
  override def toString = s"Car,$carId,$make,$model,$numberOfDoors"
}