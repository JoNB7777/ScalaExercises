package day4.luhnAlgorithm

object Main extends App {

  val example = new LuhnAlgorithm
  println(example.checkDigitsAndNumberOfDigits(324))
  println(example.findCheckDigitOfNum(324))
  println(example.checkValidityOfNumber(49927398716L))
//  println((10L /2))
}
