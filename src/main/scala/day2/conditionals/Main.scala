package day2.conditionals

object Main extends App {

  def conditionalOperatorsFunction(num1: Int, num2: Int, wantToAdd: Boolean): Int = {
    var result = 0
    if (wantToAdd) {
      result = num1 + num2
    } else {
      result = num1 * num2
    }
    result
  }

}
