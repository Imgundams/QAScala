/*
   Created by Boss on 06/06/2017.
*/
abstract class Person(val fullName: String, val contactNumber: Int) {
  def getFullName: String = fullName

  def getContactNumber: Int = contactNumber
}

class Employee(fullName: String, contactNumber: Int, val jobTitle: String, val wage: Int) extends Person(fullName, contactNumber) {
  override def toString = s"Person($fullName, $contactNumber, $jobTitle, $wage)"
}

class Customer(fullName: String, contactNumber: Int, val customerVehicleReg: String) extends Person(fullName, contactNumber) {
  override def toString = s"Person($fullName, $contactNumber, $customerVehicleReg)"
}

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

