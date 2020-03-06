package day4.luhnAlgorithm

import scala.collection.mutable.ListBuffer

class LuhnAlgorithm {

  def checkDigitsAndNumberOfDigits(num: Long): (Int, List[Int]) = {
    var divisor = 1L
    var numberOfDigits = 0
    var digitListBuffer = new ListBuffer[Int]
    while (divisor <= num) {
      val longDigit = (num % (10L * divisor)) / divisor
      val digit = longDigit.toInt
      digitListBuffer += digit
      numberOfDigits += 1
      divisor *= 10L
    }
    (numberOfDigits, digitListBuffer.toList)
  }


  def checkValidityOfDigitList(digitList: List[Int], numOfDigits: Int): Boolean = {
    var checkResult = 0
    for (i <- 0 until numOfDigits) {
      if (i % 2 == 0) {
        checkResult += digitList(i)
      } else {
        checkResult += (digitList(i) * 2) % 10 + (digitList(i) * 2) / 10
      }
    }
    checkResult % 10 == 0
  }


  def checkValidityOfNumber(numberToCheck: Long): Boolean = {
    val (numberOfDigits, listOfDigits) = checkDigitsAndNumberOfDigits(numberToCheck)
    checkValidityOfDigitList(listOfDigits, numberOfDigits)
  }


  def findCheckDigitOfNum(num: Long): Int = {
    var checkDigit = 0L
    var checkDigitNotFound = true
    while (checkDigitNotFound) {
      val numToCheck = num * 10 + checkDigit
      if (checkValidityOfNumber(numToCheck)) {
        checkDigitNotFound = false
      } else {
        checkDigit += 1L
      }
    }
    checkDigit.toInt
  }

}
