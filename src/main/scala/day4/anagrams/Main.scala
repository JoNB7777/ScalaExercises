package day4.anagrams

import scala.collection.mutable.ListBuffer
import scala.io.Source

object Main extends App {

  val file = "/home/qa-admin/Documents/exampleFile.txt"

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

  def findNumberOfAnagrams(myString: String, myFile: String): Int = {
    val wordArray = readFile(myFile)
    var anagramCounter = -1
    for (i <- 0 until wordArray.length) {
      if (checkIfAnagram(myString, wordArray(i))) {
        anagramCounter += 1
      }
    }
    anagramCounter
  }

  def checkIfAnagram(str1: String, str2: String): Boolean = {
    sortStringAlphabetically(str1) == sortStringAlphabetically(str2)
  }

//  def findWordWithMostAnagrams(filename: String): (List[String], Int) = {
//    var solutionList = new ListBuffer[String]
//    var numberOfAnagrams = 0
//    var words = readFile(filename)
//    words foreach(word => {
//      if (findNumberOfAnagrams(word, filename) > numberOfAnagrams || (findNumberOfAnagrams(word, filename) == numberOfAnagrams && word.length > solutionList(0))) {
//        solutionList.clear()
//        solutionList += word
//      } else if (findNumberOfAnagrams(word, filename) == numberOfAnagrams && word.length == solutionList(0)) {
//        solutionList += word
//      }
//    })
//    (solutionList.toList, numberOfAnagrams)
//
//  }

}
