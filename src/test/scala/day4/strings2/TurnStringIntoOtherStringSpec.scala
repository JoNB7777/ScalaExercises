package day4.strings2

import org.scalatest._

class TurnStringIntoOtherStringSpec extends FlatSpec {

  val strings = new TurnStringIntoOtherString

  "Creating a TurnStringIntoOtherString object" should "create an instance of TurnStringIntoOtherString" in {
    assert(strings.isInstanceOf[TurnStringIntoOtherString])
  }

  "Sorting 'parrot' alphabetically" should "return aoprrt" in {
    assert(strings.sortStringAlphabetically("parrot") == "aoprrt")
  }

//  "Remove characters not contained in 'appear' from 'parrot' " should "return 'apr' " in {
//    assert(strings.removeCharsFromString("parrot", "appear") == "apr")
//  }
//
//  "Turning 'apr' into 'appear' " should "return 'apr' " in {
//    assert(strings.insertCharacter("apr", "appear") == "appear")
//  }

}
