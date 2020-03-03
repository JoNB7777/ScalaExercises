package day2.hangman

import scala.collection.mutable.ListBuffer
import scala.util.Random

object Main extends App {

  val testWordList = List("Java", "Scala", "Python", "C", "JavaScript")

  def chooseWord(wordList: List[String]): String = {
    val listIndex = Random.between(0, wordList.length)
    wordList(listIndex)
  }

  def displayNumberOfLetters(word: String): String = {
    "_" * word.length
  }

  def findAllOccurrencesOfLetter(alreadyGuessedLetters: String, solution: String, guessedLetter: Char): List[Int] = {
    var placesLetterOccursIn = new ListBuffer[Int]
    for (i <- 0 to solution.length -  1 by 1) {
      if (letterOccursAtIndex(solution, i, guessedLetter)) {
        placesLetterOccursIn += i
      }
    }
    placesLetterOccursIn.toList
  }

  def letterOccursAtIndex(word: String, place: Int, letter: Char): Boolean = {
    word(place) == letter
  }

  def replaceAllOccurrencesOfLetter(letterOccurrences: List[Int], alreadyGuessedLetters: String, guessedLetter: Char): String = {
    var myStringBuffer = new StringBuffer()
    myStringBuffer.append(alreadyGuessedLetters)
    for (i <- 0 to alreadyGuessedLetters.length - 1) {
      if (letterOccurrences.contains(i)) {
        myStringBuffer[i].replace(guessedLetter)
      }
    }
    val result = myStringBuffer.toString
    result
  }

  def doesSolutionContainGuess(solution: String, userGuess: Char): Boolean = {
    solution.contains(userGuess)
  }

  def askUserForGuess: String = {
    scala.io.StdIn.readLine("What is your next guess?")
  }

  def turnUserGuessIntoChar(userGuess: String): Char = {
    userGuess.head
  }

  def playHangman(maxGuesses: Int): Unit = {
    val thisSolution = chooseWord(testWordList)
    var guessesUsed = 0
    var guessedSoFar = displayNumberOfLetters(thisSolution)
    println(guessedSoFar)
    var gameNotOver = true
    while (gameNotOver) {
      val nextGuess = turnUserGuessIntoChar(askUserForGuess)
      guessesUsed += 1
      val guessContained = doesSolutionContainGuess(thisSolution, nextGuess)
      if (guessContained) {
        val occurenceList = findAllOccurrencesOfLetter(guessedSoFar, thisSolution, nextGuess)
        val newGuessedSoFar = replaceAllOccurrencesOfLetter(occurenceList, guessedSoFar, nextGuess)
        guessedSoFar = newGuessedSoFar
      }
      if (guessedSoFar == thisSolution) {
        gameNotOver = false
      } else if (guessesUsed == maxGuesses) {
        gameNotOver = false
      }
    }
  }


}
