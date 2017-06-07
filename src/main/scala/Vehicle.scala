/*
   Created by Boss on 06/06/2017.
*/
abstract class Vehicle(var make: String, var model: String) {
  def getMake: String = make

  def getModel: String = model
}

class Car(make: String, model: String, val numberOfDoors: Int) extends Vehicle(make, model) {
  override def toString = s"Vehicle($make, $model, $numberOfDoors)"
}

class Bike(make: String, model: String, val engineSize: Int) extends Vehicle(make, model) {
  override def toString = s"Vehicle($make, $model, $engineSize)"
}
