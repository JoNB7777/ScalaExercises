package day2.operators
import org.scalatest._

class OperatorsSpec extends FlatSpec {

  "Inputting 2 and 5 to the function" should "return 7" in {
    assert(Main.operatorsFunction(2,5) == 7)
  }

  "Inputting 7 and 11 to the function" should "return 18" in {
    assert(Main.operatorsFunction(7,11) == 18)
  }

}
