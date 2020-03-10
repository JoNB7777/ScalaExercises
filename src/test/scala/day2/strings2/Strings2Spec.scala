package day2.strings2
import org.scalatest._

class Strings2Spec extends FlatSpec {

  "Inputting 'Hello', 'World', 'l' and 'j' to strings2" should "return 'Hejjo Worjd" in {
    assert(Main.strings2("Hello", "World", 'l', 'j') == "HejjoWorjd")
  }

  "Inputting 'Hello World', ' ', ' ' and 'j' to strings2" should "return 'HellojWorldj" in {
    assert(Main.strings2("Hello World", " ", ' ', 'j') == "HellojWorldj")
  }

}
