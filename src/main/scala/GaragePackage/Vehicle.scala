package GaragePackage

/**
  * Created by Administrator on 12/06/2017.
  */

abstract class Vehicle {
  def vehicleType:VehicleTypes.Value
  def id: Int
  def make: String
  def model: String
  def toString: String
  def printMake(){println("Make is: "+ make)}
  def printModel(){println("Model is: "+ model)}
  def damaged:Boolean
}