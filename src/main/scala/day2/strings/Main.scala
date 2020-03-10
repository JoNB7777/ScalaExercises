package day2.strings

object Main extends App {

  def stringRemoveLetters(inputString: String, num: Int): String = {
    var result = ""
    if (num <= inputString.length) {
      result = inputString.substring(0, inputString.length - num)
    }
    else {
      result = "You are trying to remove more characters than your input has"
    }
    result
  }

  println(stringRemoveLetters("Hello", 6))

}
