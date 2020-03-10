package day1.threeNumberFunction
import org.scalatest._

class ThreeNumberSpec extends FlatSpec {

  "Taking numberFunction of 2,3 and 5" should "return 25" in {
    assert(Main.numberFunction(2,3,5) == 25)
  }

  "Taking numberFunction of 5,7 and 11" should "return 132" in {
    assert(Main.numberFunction(11,5,7) == 132)
  }

  "Taking exampleFunction of 2,3 and 5" should "return 25" in {
    assert(Main.numberFunction(5,2,3) == 25)
  }

  "Taking exampleFunction of 5,7 and 11" should "return 132" in {
    assert(Main.numberFunction(7,11,5) == 132)
  }

}
