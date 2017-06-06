/**
  * Created by Boss on 06/06/2017.
  */

abstract class Vehicle() {

  def make: String

  def model: String

  def year: Int
}

class Car( numberOfDoors: Int) extends Vehicle(){
override def make: String = ???
override def model: String = ???
override def year: Int = ???
}

class Bike(engineSize: Int) extends Vehicle() {
  override def make: String = ???
  override def model: String = ???
  override def year: Int = ???
}


