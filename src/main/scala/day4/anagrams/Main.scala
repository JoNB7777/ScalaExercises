package day4.anagrams

import scala.io.Source

object Main extends App {

  val file = "/home/qa-admin/Downloads/words.txt"

  def readFile(filename: String): Array[String] = {
    val bufferedSource = Source.fromFile(filename)
    val lineArray = new Array[String](bufferedSource.getLines().length)
    var lineNumber = 0
    for (line <- bufferedSource.getLines()) {
      lineArray(lineNumber) = line
      lineNumber += 1
    }
    lineArray
  }

  def sortStringAlphabetically(inputString: String): String = {
    var charArray = new Array[Char](inputString.length)
    for (i <- 0 until inputString.length) {
      charArray(i) = inputString.charAt(i)
    }
    charArray = charArray.sorted
    var result = new String
    for (i <- 0 until inputString.length) {
      result += charArray(i).toString
    }
    result.toString
  }

}
