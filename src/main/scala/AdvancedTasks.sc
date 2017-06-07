import scala.collection.mutable.{ArrayBuffer, ListBuffer}

abstract class Vehicle(var make: String, var model :String) {
  def getMake: String = make
  def getModel: String = model
}
class Car(make: String, model: String, val numberOfDoors: Int) extends Vehicle(make, model) {
  override def toString = s"Vehicle($make, $model, $numberOfDoors)"
}


var buffa = ListBuffer[Any]()


val car1 = new Car("Fiat","Panda", 4)
val car2 = new Car("Ferrari","Enzo",2)
val car


buffa += car1
buffa += car2

buffa.remove(0)


println(buffa.size)