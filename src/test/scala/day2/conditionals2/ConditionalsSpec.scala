package day2.conditionals2
import org.scalatest._

class ConditionalsSpec extends FlatSpec {

  "Inputting 4, 7 and true to the function" should "return 11" in {
    assert(Main.conditionalOperatorsFunction(4, 7, true) == 11)
  }

  "Inputting 4, 7 and false to the function" should "return 28" in {
    assert(Main.conditionalOperatorsFunction(4, 7, false) == 28)
  }

  "Inputting 5, 11 and true to the function" should "return 16" in {
    assert(Main.conditionalOperatorsFunction(5, 11, true) == 16)
  }

  "Inputting 5, 11 and false to the function" should "return 55" in {
    assert(Main.conditionalOperatorsFunction(5, 11, false) == 55)
  }

  "Inputting 0, 11 and true to the function" should "return 11" in {
    assert(Main.conditionalOperatorsFunction(0, 11, true) == 11)
  }

  "Inputting 11, 0 and true to the function" should "return 11" in {
    assert(Main.conditionalOperatorsFunction(11, 0, true) == 11)
  }

  "Inputting 0, 11 and false to the function" should "return 11" in {
    assert(Main.conditionalOperatorsFunction(0, 11, false) == 11)
  }

  "Inputting 11, 0 and false to the function" should "return 11" in {
    assert(Main.conditionalOperatorsFunction(11, 0, false) == 11)
  }

  "Inputting 0, 0 and true to the function" should "return 0" in {
    assert(Main.conditionalOperatorsFunction(0, 0, true) == 0)
  }

  "Inputting 0, 0 and false to the function" should "return 0" in {
    assert(Main.conditionalOperatorsFunction(0, 0, false) == 0)
  }

}
