package GaragePackage

/**
  * Created by Administrator on 12/06/2017.
  */
case class Employee(employeeFullName: String, employeeContactNumber: Int,  jobTitle: String, wage: Int) extends Person{
  def fullName = employeeFullName
  def contactNumber = employeeContactNumber
  override def toString = s"Employee,$fullName,$contactNumber,$jobTitle,$wage"
}
