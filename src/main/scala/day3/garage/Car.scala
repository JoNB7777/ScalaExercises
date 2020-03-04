package day3.garage

class Car(override var id: Long, override var vehicleType: String, override var damaged: Boolean) extends Vehicle {

  override def toString: String = "This is a car"

}
