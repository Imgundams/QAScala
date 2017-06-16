package GaragePackage

/**
  * Created by Administrator on 12/06/2017.
  */
case class Employee(employeeId:Int, employeeFullName: String, employeeContactNumber: Int,  jobTitle: JobTitles.Value, wage: Int, isBusy:Boolean) extends Person{
  def id: Int = employeeId
  def fullName: String= employeeFullName
  def contactNumber: Int = employeeContactNumber
  var busy: Boolean =isBusy
  override def toString :String = s"Employee,$employeeId,\t$fullName,\t$contactNumber,\t$jobTitle,\t"+f"$wage%1.2f"
}
