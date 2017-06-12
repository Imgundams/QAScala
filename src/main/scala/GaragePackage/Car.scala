package GaragePackage

/**
  * Created by Administrator on 12/06/2017.
  */
case class Car(carMake: String, carModel: String, numberOfDoors: Int) extends Vehicle {
  def make:String = carMake
  def model: String = carModel
  override def toString = s"Car,$make,$model,$numberOfDoors"
}