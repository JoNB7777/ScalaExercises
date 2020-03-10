package day2.conditionals
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

}
