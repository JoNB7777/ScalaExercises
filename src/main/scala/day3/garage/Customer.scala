package day3.garage

class Customer(override var name: String, var customerId: Long) extends Person {

  override def toString: String = s"This is a customer $name with customer id $customerId"

}
