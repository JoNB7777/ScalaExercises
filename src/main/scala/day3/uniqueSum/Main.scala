package day3.uniqueSum

object Main extends App {

  def uniqueSum(num1: Int, num2: Int, num3: Int): Int = (num1 == num2, num1 == num3) match {
    case (true, true) => 0
    case (true, false) => num3
    case (false, true) => num2
    case (false, false) => {
      if (num2 == num3) {
        num1
      } else {
        num1 + num2 + num3
      }
    }
  }

  println(uniqueSum(2,3,4))

}
