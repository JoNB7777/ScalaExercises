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
    val inputSorted = sortStringAlphabetically(myString)
    var anagramCounter = -1
    for (i <- 0 until wordArray.length) {
      if (sortStringAlphabetically(wordArray(i)) == inputSorted) {
        anagramCounter += 1
      }
    }
    anagramCounter
  }

//  def findWordWithMostAnagrams(filename: String): List[Tuple] = {
//    val words = readFile(filename)
//    var wordWithMostAnagrams = ""
//    var numberOfAnagrams = 0
//    var solutionTuple = (wordWithMostAnagrams, numberOfAnagrams)
//    var solutionList = new ListBuffer[Tuple]
//    solutionList += solutionTuple
//    words foreach(word => {
//      if (findNumberOfAnagrams(word, filename)[1] > numberOfAnagrams) {
//        wordWithMostAnagrams = word
//        numberOfAnagrams = findNumberOfAnagrams(word, filename)[1]
//        solutionTuple = (wordWithMostAnagrams, numberOfAnagrams)
//        solutionList.clear()
//        solutionList += solutionTuple
//      } else if (findNumberOfAnagrams(word, filename)[1] == numberOfAnagrams && word.length > wordWithMostAnagrams.length) {
//        wordWithMostAnagrams = word
//        numberOfAnagrams = findNumberOfAnagrams(word, filename)[1]
//        solutionTuple = (wordWithMostAnagrams, numberOfAnagrams)
//        solutionList.clear()
//        solutionList += solutionTuple
//      } else if (findNumberOfAnagrams(word, filename)[1] == numberOfAnagrams && word.length == wordWithMostAnagrams.length) {
//        wordWithMostAnagrams = word
//        numberOfAnagrams = findNumberOfAnagrams(word, filename)[1]
//        solutionTuple = (wordWithMostAnagrams, numberOfAnagrams)
//        solutionList += solutionTuple
//      }
//    })
//    solutionList.toList
//  }
//
//  println(findWordWithMostAnagrams(file))

}
