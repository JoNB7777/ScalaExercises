package day3.tooHot
import org.scalatest._

class TooHotSpec extends FlatSpec {

  "Too hot of 50 and true" should "return false" in {
    assert(Main.tooHot(50, true) == false)
  }

  "Too hot of 50 and false" should "return false" in {
    assert(Main.tooHot(50, false) == false)
  }

  "Too hot of 70 and true" should "return true" in {
    assert(Main.tooHot(70, true) == true)
  }

  "Too hot of 70 and false" should "return false" in {
    assert(Main.tooHot(70, false) == true)
  }

  "Too hot of 95 and true" should "return true" in {
    assert(Main.tooHot(95, true) == true)
  }

  "Too hot of 95 and false" should "return false" in {
    assert(Main.tooHot(95, false) == false)
  }

  "Too hot of 104 and true" should "return false" in {
    assert(Main.tooHot(104, true) == false)
  }

  "Too hot of 60 and false" should "return true" in {
    assert(Main.tooHot(60, false) == true)
  }

  "Too hot of 60 and true" should "return true" in {
    assert(Main.tooHot(60, true) == true)
  }

}
