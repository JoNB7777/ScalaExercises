package day2.strings2

object Main extends App {
  def strings2 (string1: String, string2: String, char1: Char, char2: Char): String = {
    val myString = string1 + string2
    val result = myString.replace(char1, char2)
    result
  }

  println(strings2("Hello", "World", 'l', 'j'))

}
