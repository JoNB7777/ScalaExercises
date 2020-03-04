package day2.patternMatching1

object Main extends App {

  def operatorsPatternMatching(num1: Int, num2: Int, wantToAdd: Boolean): Int = wantToAdd match {
    case true => num1 + num2
    case false => num1 * num2

  }

  def extendedOperatorsPatternMatching(num1: Int, num2: Int, wantToAdd: Boolean) = (num1, num2, wantToAdd) match {
    case (0, num2, wantToAdd) => 0
    case (num1, 0, wantToAdd) => 0
    case (num1, num2, true) => num1 + num2
    case (num1, num2, false) => num1 * num2
  }

  println(extendedOperatorsPatternMatching(2, 5, false))

}
