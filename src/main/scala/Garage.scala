/**
  * Created by Boss on 06/06/2017.
  */
class Garage {


  abstract class Vehicle {

    def make: String

    def model: String

    def year: Int
  }

  case class Car(make: String, model: String, year: Int, numberOfDoors: Int) extends Vehicle()

  case class Bike(make: String, model: String, year: Int, engineSize: Int) extends Vehicle()

  case class Truck(make: String, model: String, year: Int, cargoCapacity: Int) extends Vehicle()


  abstract class Person {

    def fullName: String

    def contactNumber: Int
  }

  case class Employee(fullName: String, contactNumber: Int, employeeId: Int, jobTitle: String, wage: Int) extends Person()

  case class Customer(fullName: String, contactNumber: Int, customerId: Int, customerVehicle: String) extends Person()

}