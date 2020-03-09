package day4.strings2

import scala.collection.mutable.ListBuffer

class TurnStringIntoOtherString {

  var charDeletions = new ListBuffer[Char]
  var charInsertions = new ListBuffer[Char]

  def removeCharsFromString(string1: String, string2: String): (String, String) = {
    val newString1 = sortStringAlphabetically(string1)
    val newString2 = sortStringAlphabetically(string2)
    var stringArray1 = new Array[String](string1.length)
    var stringArray2 = new Array[String](string2.length)
    for (i <- 0 until stringArray1.length) {
      if (!(newString2.contains(newString1.charAt(i)))) {
        charDeletions += newString1.charAt(i)
        newString1.replace(newString1.charAt(i).toString, "")
      }
    }
    (newString1, newString2)
  }

  def insertCharacter(string1: String, string2: String): String = {
    var newString1 = string1
    while (newString1 != string2) {
      for (i <- 0 to string1.length) {
        var lettersDifferent = newString1.charAt(i) != string2.charAt(i)
        while (lettersDifferent) {
          newString1 = newString1.substring(0, i) + string2.charAt(i).toString + newString1.substring(i, string1.length)
          charInsertions += string2.charAt(i)
          lettersDifferent = newString1.charAt(i) != string2.charAt(i)
        }
        //      if (newString1.charAt(i)!= string2.charAt(i)) {
        //       newString1 = newString1.substring(0, i) + string2.charAt(i).toString + newString1.substring(i, string1.length)
        //        charInsertions += string2.charAt(i)
        //      }
      }
    }
    newString1
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

//  def turnFirstStringIntoSecondString(str1: String, str2: String): Unit = {
//    var stringTuple = ("", "")
//    stringTuple = removeCharsFromString(str1, str2)
//    removeCharsFromString(str1, str2)
//    insertCharacter(stringTuple._1, stringTuple._2)
//    println(s"The following characters were deleted: $charDeletions")
//    println(s"The following characters were inserted: $charInsertions")
//  }

}
