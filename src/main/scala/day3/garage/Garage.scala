package day3.garage

import scala.collection.mutable.ListBuffer

class Garage {

  var vehicleList = new ListBuffer[Vehicle]
  var employeeList = new ListBuffer[Employee]

  def addVehicle(vehicle: Vehicle): Unit = {
    vehicleList += vehicle
  }

  def removeVehicle(vehicleId: Long): Unit = {
    vehicleList.filter(_.id != vehicleId)
  }

  def removeVehicle(ofType: String): Unit = {
    vehicleList.filter(_.vehicleType != ofType)
  }

  def registerEmployee(employee: Employee): Unit = {
    employeeList += employee
  }

  def calculateBill(vehicle: Vehicle): Int = {
    var bill = 0
    if (vehicle.damaged) {
      if (vehicle.vehicleType == "Car") {
        bill = 2000
      } else if (vehicle.vehicleType == "Bike") {
        bill = 250
      }
    } else {
      if (vehicle.vehicleType == "Car") {
        bill = 500
      } else if (vehicle.vehicleType == "Bike") {
        bill = 50
      }
    }
    bill
  }

  def repairVehicle(vehicle: Vehicle): Unit = {
    vehicle.damaged = true
    val bill = calculateBill(vehicle)
    println(s"Vehicle has been repaired. The bill is $bill" )
  }

  def outputContentsOfGarage: Unit = {
    println("The following vehicles are currently in the garage: ")
    vehicleList foreach(elem => println(elem.toString))
  }

}
