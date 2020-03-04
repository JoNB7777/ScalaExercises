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
    "_ " * word.length
  }

  def findAllOccurrencesOfLetter(alreadyGuessedLetters: String, solution: String, guessedLetter: String): List[Int] = {
    var placesLetterOccursIn = new ListBuffer[Int]
    for (i <- 0 to solution.length -  1 by 1) {
      if (letterOccursAtIndex(solution, i, guessedLetter)) {
        placesLetterOccursIn += i
      }
    }
    placesLetterOccursIn.toList
  }

  def letterOccursAtIndex(word: String, place: Int, letter: String): Boolean = {
    word(place) == letter
  }

  def replaceAllOccurrencesOfLetter(letterOccurrences: List[Int], alreadyGuessedLetters: String, guessedLetter: String): String = {
    var myStringBuffer = new StringBuffer()
    myStringBuffer.append(alreadyGuessedLetters)
    for (i <- 0 to alreadyGuessedLetters.length - 1) {
      if (letterOccurrences.contains(i)) {
        //myStringBuffer[i].replace(guessedLetter)  //this line doesn't work yet
        myStringBuffer.replace(2 *i, 2 *i+1, guessedLetter)
      }
    }
    val result = myStringBuffer.toString
    result
  }

  def doesSolutionContainGuess(solution: String, userGuess: String): Boolean = {
    //solution.contains(userGuess)
    val guess = userGuess.toLowerCase
    val lowercaseSolution = solution.toLowerCase
    lowercaseSolution.contains(guess)
  }

  def askUserForGuess: String = {
    scala.io.StdIn.readLine("What is your next guess?")
  }

//  def turnUserGuessIntoChar(userGuess: String): Char = {
//    userGuess.head
//  }

  def playHangman(maxGuesses: Int): Unit = {
    val thisSolution = chooseWord(testWordList).toLowerCase
    var guessesUsed = 0
    var playerHasWon = false
    var playerHasLost = false
    var guessedSoFar = displayNumberOfLetters(thisSolution)
    println(guessedSoFar)
    var gameNotOver = true
    while (gameNotOver) {
//      val nextGuess = turnUserGuessIntoChar(askUserForGuess)
      val nextGuess = askUserForGuess
      val guessContained = doesSolutionContainGuess(thisSolution, nextGuess)
      if (guessContained) {
        val occurenceList = findAllOccurrencesOfLetter(guessedSoFar, thisSolution, nextGuess)
        val newGuessedSoFar = replaceAllOccurrencesOfLetter(occurenceList, guessedSoFar, nextGuess)
        guessedSoFar = newGuessedSoFar
      } else {
        guessesUsed += 1
        println("Incorrect guess")
      }
      if (guessedSoFar == thisSolution) {
        gameNotOver = false
        playerHasWon = true
      } else if (guessesUsed == maxGuesses) {
        gameNotOver = false
        playerHasLost = true
      }
    }
    if (playerHasWon) {
      println("Congratulations you have won!")
    } else if (playerHasLost) {
      println("You have lost! Better luck next time.")
      println(s"The solution was $thisSolution")
    }
  }


  playHangman(10)


}
