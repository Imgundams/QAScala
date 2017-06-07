/*
   Created by Boss on 06/06/2017.
*/
object Person {
  abstract class Person(val fullName: String, val contactNumber: Int) {
    def getFullName: String = fullName
    def getContactNumber: Int = contactNumber
  }
  class Employee(fullName: String, contactNumber: Int, val jobTitle: String, val wage: Int) extends Person(fullName, contactNumber) {
    override def toString = s"Person($fullName, $contactNumber, $jobTitle, $wage)"
  }
  class Customer(fullName: String, contactNumber: Int, val customerVehicle: String) extends Person(fullName, contactNumber) {
    override def toString = s"Person($fullName, $contactNumber, $customerVehicle)"
  }
}