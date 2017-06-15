package GaragePackage

/**
  * Created by Administrator on 14/06/2017.
  * False is parts is in the car
  * True is parts is missing or broken
  */
case class Parts(windowsBroken:Boolean, seatsBroken:Boolean,lightsBroken:Boolean,wheelsBroken:Boolean,transmissionBroken:Boolean,breakesBroken:Boolean,alternatorBroken:Boolean,radiatorBroken:Boolean,batteryBroken:Boolean,engineBroken:Boolean,shockAbsorberBroken:Boolean) {
  var windows: Boolean = windowsBroken
  var seats: Boolean = seatsBroken
  var lights: Boolean = lightsBroken
  var wheels: Boolean = wheelsBroken
  var transmission: Boolean = transmissionBroken
  var breakes: Boolean = breakesBroken
  var alternator: Boolean = alternatorBroken
  var radiator: Boolean = radiatorBroken
  var battery: Boolean = batteryBroken
  var engine: Boolean = engineBroken
  var shockAbsorber: Boolean = shockAbsorberBroken
}


