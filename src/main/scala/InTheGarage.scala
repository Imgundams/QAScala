
/*
   Created by D on 06/06/2017.
*/
abstract class Person {
  def fullName: String
  def contactNumber: Int
  override def toString = s"($fullName, $contactNumber"
}

case class Employee(employeeFullName: String, employeeContactNumber: Int,  jobTitle: String, wage: Int) extends Person{
  def fullName = employeeFullName
  def contactNumber = employeeContactNumber
  override def toString = s"Employee,$fullName,$contactNumber,$jobTitle,$wage"
}

case class Customer(customerFullName: String, customerContactNumber: Int, customerVehicleReg: String) extends Person{
  def fullName = customerFullName
  def contactNumber = customerContactNumber
  override def toString = s"Customer,$fullName,$contactNumber,$customerVehicleReg"
}

abstract class Vehicle {
  def make: String
  def model: String
  def printAll = println(s"($make, $model")
  def printMake(){println("Make is: "+ make)}
  def printModel(){println("Model is: "+ model)}
}

case class Car(carMake: String, carModel: String, numberOfDoors: Int) extends Vehicle {
  def make:String = carMake
  def model: String = carModel
  override def toString = s"Car,$make,$model,$numberOfDoors"
}

case class Bike(bikeMake: String, bikeModel: String, engineSize: Int) extends Vehicle {
  def make:String = bikeMake
  def model:String = bikeModel
  override def toString = s"Bike,$make,$model,$engineSize"
}
