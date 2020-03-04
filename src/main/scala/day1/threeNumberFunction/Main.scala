package day1.threeNumberFunction

object Main extends App {

  def numberFunction(num1: Int, num2: Int, num3: Int): Int = {
    var maxNumber = math.max(num1, math.max(num2, num3))
    var result = 0
    val parList = List(num1, num2, num3)
    for (num <- parList) {
      if (num != maxNumber) {
        result += num
      }
    }
    result *= maxNumber
    result
  }

  def exampleSolution(num1: Int, num2: Int, num3: Int) ={
    val nums = List(num1, num2, num3).sorted
    (nums(0) + nums(1)) * nums(2)
  }

}
