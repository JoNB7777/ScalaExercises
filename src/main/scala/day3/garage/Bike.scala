package day3.garage

class Bike(override var id: Long, override var vehicleType: String, override var damaged: Boolean) extends Vehicle {

  override def toString: String = s"This is a bike"

}
