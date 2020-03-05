package day4.battleships

import scala.collection.mutable.ListBuffer

class BattleShips {

  def createGrid(size: Int): Array[Array[Int]] = {
    val xCoordinates = new Array[Int](size)
    val yCoordinates = new Array[Int](size)
    for (i <- 0 to size - 1) {
      xCoordinates(i) = i + 1
      yCoordinates(i) = i + 1
    }
    val grid = new Array[Array[Int]](2)
    grid(0) = xCoordinates
    grid(1) = yCoordinates
//    grid foreach (elem => {
//      elem foreach(num => println(num))
//    })
    grid
  }

//  def placeShip(shipSize: Int, coordinates: List[Array[Int]], gridsize: Int): List[Array[Int]] = {
//    var result = coordinates
//    var validCoordinates = true
//    coordinates foreach(elem => {
//      if (!checkIfValidCoordinate(elem[0], elem[1], gridsize)) {
//        validCoordinates = false
//      }
//    })
//    if (!validCoordinates) {
//      result = new ListBuffer[Int].toList
//    } else {
//      result
//    }
//  }

  def checkIfValidCoordinate(coordinateX: Int, coordinateY: Int, gridsize: Int): Boolean = {
    coordinateX <= gridsize && coordinateY <= gridsize
  }

}
