package GaragePackage

/**
  * Created by Administrator on 12/06/2017.
  */
case class Customer(customerId: Int, customerFullName: String, customerContactNumber: Int, customerVehicleReg: String) extends Person{
  def id: Int= customerId
  def fullName: String = customerFullName
  def contactNumber: Int = customerContactNumber
  override def toString = s"Customer,$customerId,$fullName,$contactNumber,$customerVehicleReg"
}
