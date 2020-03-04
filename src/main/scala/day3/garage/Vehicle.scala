package day3.garage

abstract class Vehicle(var id: Long, var vehicleType: String, var damaged: Boolean) {

  override def toString: String = s"This is a vehicle of type $vehicleType"

}
