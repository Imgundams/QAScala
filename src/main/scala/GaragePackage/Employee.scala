package GaragePackage

/**
  * Created by Administrator on 12/06/2017.
  */
case class Employee(employeeId:Int, employeeFullName: String, employeeContactNumber: Int,  jobTitle: JobTitles.Value, wage: Int) extends Person{
  def id: Int = employeeId
  def fullName: String= employeeFullName
  def contactNumber: Int = employeeContactNumber
  override def toString = s"Employee,$employeeId,$fullName,$contactNumber,$jobTitle,$wage"
}
