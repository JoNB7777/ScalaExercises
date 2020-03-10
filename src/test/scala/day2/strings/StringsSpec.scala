package day2.strings
import org.scalatest._

class StringsSpec extends FlatSpec {
  "Inputting 'Hello' and 1 to the function" should "return 'Hell' " in {
    assert(Main.stringRemoveLetters("Hello", 1) == "Hell")
  }

  "Inputting 'Shark' and 4 to the function" should "return 'S' " in {
    assert(Main.stringRemoveLetters("Shark", 4) == "S")
  }

  "Inputting 'Hello' and 6 to the function" should "return 'You are trying to remove more characters than your input has' " in {
    assert(Main.stringRemoveLetters("Hello", 6) == "You are trying to remove more characters than your input has")
  }
}
