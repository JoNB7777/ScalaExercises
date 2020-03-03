package day2.brokenKeyboard

import scala.collection.mutable.ListBuffer
import scala.io.Source

object Main extends App {

  def brokenKeyboard(workingKeys: List[Char]): String = {
    val bufferedSource = Source.fromFile("/home/qa-admin/Downloads/words.txt")
    var longestWord = ""
    for (line <- bufferedSource.getLines) {
      var wordCanBeSpelled = true
      val lettersInWord = line.toSet
      lettersInWord foreach(letter => {
        if (!workingKeys.contains(letter)) {
          wordCanBeSpelled = false
        }
      })
      if (line.length > longestWord.length && wordCanBeSpelled) {
        longestWord = line
      }
    }

    bufferedSource.close
    longestWord
  }

  val keyboards = List(List('a', 'b', 'c', 'd', 'e'), List('a', 'q', 'x', 'f', 'i'), List('y', 'o', 'u', 'p', 'g'))


  def brokenKeyBoards(numOfKeyboards: Int):  List[String] = {
    var words = new ListBuffer[String]
    for (i <- 0 to (numOfKeyboards - 1) by 1) {
      words += brokenKeyboard(keyboards(i))
    }
    val listOfWords = words.toList
    listOfWords

  }

  println(brokenKeyBoards(2))


  def brokenKeysWhereAllAvailableKeysUsed(workingKeys: List[Char]): String= {
    val bufferedSource = Source.fromFile("/home/qa-admin/Downloads/words.txt")
    var longestWord = ""
    var wordsWhereAllKeysUsed = new ListBuffer[String]
    for (line <- bufferedSource.getLines) {
      var wordCanBeSpelled = true
      val lettersInWord = line.toSet
      if (lettersInWord == workingKeys.toSet) {
        lettersInWord foreach(letter => {
          if (!workingKeys.contains(letter)) {
            wordCanBeSpelled = false
          }
        })
        if (wordCanBeSpelled) {
          wordsWhereAllKeysUsed += line
        }
        if (line.length > longestWord.length && wordCanBeSpelled) {
          longestWord = line
        }
      }
    }

    bufferedSource.close
    println(wordsWhereAllKeysUsed)
    longestWord
  }



}
