package day2.patternMatching1
import org.scalatest._

class PatternMatchingSpec extends FlatSpec {

  "Inputting 2,3 and true to the operatorsPatternMatching function" should "return 5" in {
    assert(Main.operatorsPatternMatching(2,3,true) == 5)
  }

  "Inputting 2,3 and false to the operatorsPatternMatching function" should "return 6" in {
    assert(Main.operatorsPatternMatching(2,3,false) == 6)
  }

  "Inputting 4,7 and true to the operatorsPatternMatching function" should "return 11" in {
    assert(Main.operatorsPatternMatching(2,3,true) == 5)
  }

  "Inputting 4,7 and false to the operatorsPatternMatching function" should "return 28" in {
    assert(Main.operatorsPatternMatching(2,3,true) == 5)
  }

  "Inputting 0, 1 and true to the extendedOperatorsPatternMatching function" should "return 0" in {
    assert(Main.extendedOperatorsPatternMatching(0, 1, true) == 0)
  }

  "Inputting 5, 0 and true to the extendedOperatorsPatternMatching function" should "return 0" in {
    assert(Main.extendedOperatorsPatternMatching(5, 0, true) == 0)
  }

  "Inputting 0, 1 and false to the extendedOperatorsPatternMatching function" should "return 0" in {
    assert(Main.extendedOperatorsPatternMatching(0, 1, false) == 0)
  }

  "Inputting 5, 0 and false to the extendedOperatorsPatternMatching function" should "return 0" in {
    assert(Main.extendedOperatorsPatternMatching(5, 0, false) == 0)
  }

  "Inputting 7, 4 and true to the extendedOperatorsPatternMatching function" should "return 11" in {
    assert(Main.extendedOperatorsPatternMatching(7, 4, true) == 11)
  }

  "Inputting 7, 4 and false to the extendedOperatorsPatternMatching function" should "return 28" in {
    assert(Main.extendedOperatorsPatternMatching(7, 4, false) == 28)
  }

  "Inputting 4, 1 and true to the extendedOperatorsPatternMatching function" should "return 5" in {
    assert(Main.extendedOperatorsPatternMatching(4, 1, true) == 5)
  }

  "Inputting 4, 1 and false to the extendedOperatorsPatternMatching function" should "return 4" in {
    assert(Main.extendedOperatorsPatternMatching(4, 1, false) == 4)
  }

}
