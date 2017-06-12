package GaragePackage

/**
  * Created by Administrator on 12/06/2017.
  */

abstract class Vehicle {
  def make: String
  def model: String
  def printAll = println(s"($make, $model")
  def printMake(){println("Make is: "+ make)}
  def printModel(){println("Model is: "+ model)}
}