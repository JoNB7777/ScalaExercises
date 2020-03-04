package day3.uniqueSum

object Main extends App {

  def uniqueSum(num1: Int, num2: Int, num3: Int): Int = {
    val numSet = Set(num1, num2, num3)
    var result = 0
    numSet foreach(num => result += num)
    result
  }

  println(uniqueSum(1,1,3))

}
