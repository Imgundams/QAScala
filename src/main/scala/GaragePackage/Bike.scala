package GaragePackage

/**
  * Created by Administrator on 12/06/2017.
  */
case class Bike(bikeId:Int, bikeMake: String, bikeModel: String, engineSize: Int) extends Vehicle {
  def id: Int = bikeId
  def make:String = bikeMake
  def model:String = bikeModel
  override def toString = s"Bike,$make,$model,$engineSize"
}
