package day2.conditionals2

object Main extends App {

  def conditionalOperatorsFunction(num1: Int, num2: Int, wantToAdd: Boolean): Int = {
    val isOneNumberZero = (num1 == 0 || num2 == 0)
    var result = 0
    if (isOneNumberZero) {
      if (num1 != 0) {
        result = num1
      } else if (num2 != 0) {
        result = num2
      }
    } else {
      if (wantToAdd) {
        result = num1 + num2
      } else {
        result = num1 * num2
      }
    }
    result
  }

  println(conditionalOperatorsFunction(1,7, false))

}
