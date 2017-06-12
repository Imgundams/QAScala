package GaragePackage

/**
  * Created by Administrator on 12/06/2017.
  */
case class Customer(customerFullName: String, customerContactNumber: Int, customerVehicleReg: String) extends Person{
  def fullName = customerFullName
  def contactNumber = customerContactNumber
  override def toString = s"Customer,$fullName,$contactNumber,$customerVehicleReg"
}
