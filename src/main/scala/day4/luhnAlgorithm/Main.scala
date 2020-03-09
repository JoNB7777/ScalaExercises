package day4.luhnAlgorithm

object Main extends App {

  val example = new LuhnAlgorithm
  println(example.checkValidityOfNumber(49927398716L))
  println(example.findCheckDigitOfNum(4992739871L))
  println(example.findCheckDigitOfNum(2345L))
  println(example.checkValidityOfNumber(23457L))
}
