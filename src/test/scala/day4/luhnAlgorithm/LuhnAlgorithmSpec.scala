package day4.luhnAlgorithm
import org.scalatest._

class LuhnAlgorithmSpec extends FlatSpec {

  val luhn = new LuhnAlgorithm
  val testList1 = List(1,2,3,4)
  val testList2 = List(5,4,3,2)
  val testTuple = (4, List(1,2,3,4))

  "Creating a LuhnAlgorithm object" should "give you an instance of Luhn Algorithm" in {
    assert(luhn.isInstanceOf[LuhnAlgorithm])
  }

  "checkDigitsAndNumberOfDigits of a long" should "return a tuple of the number of digits and a list of the digits as integersof that long" in {
    assert(luhn.checkDigitsAndNumberOfDigits(4321L) == testTuple)
  }

  "checkValidityOfIntegerList of a list for number 1234" should "return true if the sum of the products of every second number and two and all  other numbers is divisble by ten, false otherwise" in {
    assert(luhn.checkValidityOfDigitList(testList1, 4) == false)
  }

  "checkValidityOfIntegerList of a list for number 5432" should "return true if the sum of the products of every second digit and two and all  other digits is divisble by ten, false otherwise" in {
    assert(luhn.checkValidityOfDigitList(testList2, 4) == true)
  }

  "checkValidityOfNumber of 4321L" should "return false" in {
    assert(luhn.checkValidityOfNumber(4321L) == false)
  }

  "checkValidityOfNumber of 2345L" should "return true" in {
    assert(luhn.checkValidityOfNumber(2345L) == true)
  }

  "findCheckDigitOfNum of 2345L" should "return 7" in {
    assert(luhn.findCheckDigitOfNum(2345L) == 7)
  }

  "findCheckDigitOfNum of 4321L" should "return 6" in {
    assert(luhn.findCheckDigitOfNum(4321L) == 6)
  }

}
