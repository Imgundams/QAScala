/**
  * Created by Boss on 06/06/2017.
  */
abstract class Person(){//val fullName :String, val contactNumber:Int) {
  def fullName: String
  def ContactNumber: Int
  override def toString = s"Person($fullName, $ContactNumber)"
}

class Employee(val employeeId:Int, val jobTitle:String, val wage:Int) extends Person(){
  override def fullName: String = ???
  override def ContactNumber: Int = ???
}

class Customer(val customerId:Int, val customerVehicle: String ) extends Person(){
  override def fullName: String = ???
  override def ContactNumber: Int = ???
}
