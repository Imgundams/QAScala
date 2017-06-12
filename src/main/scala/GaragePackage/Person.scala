package GaragePackage

/**
  * Created by Administrator on 12/06/2017.
  */
abstract class Person {
  def id: Int
  def fullName: String
  def contactNumber: Int
  override def toString = s"($fullName, $contactNumber"
}
