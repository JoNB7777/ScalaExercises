package day5.rockPaperScissors

import scala.io.StdIn.readLine
import scala.util.Random
import AvailableOptions.Value


class RockPaperScissors {

  def determineWhoWins(firstPlayerInput: AvailableOptions.Value, secondPlayerInput: AvailableOptions.Value) = (firstPlayerInput, secondPlayerInput) match {
    case(AvailableOptions.PAPER, AvailableOptions.ROCK) => "Player1"
    case(AvailableOptions.ROCK, AvailableOptions.PAPER) => "Player2"
    case(AvailableOptions.ROCK, AvailableOptions.SCISSORS) => "Player1"
    case(AvailableOptions.SCISSORS, AvailableOptions.ROCK) => "Player2"
    case(AvailableOptions.ROCK, AvailableOptions.LIZARD) => "Player1"
    case(AvailableOptions.LIZARD, AvailableOptions.ROCK) => "Player2"
    case(AvailableOptions.ROCK, AvailableOptions.SPOCK) => "Player2"
    case(AvailableOptions.SPOCK, AvailableOptions.ROCK) => "Player1"
    case(AvailableOptions.PAPER, AvailableOptions.SCISSORS) => "Player2"
    case(AvailableOptions.SCISSORS, AvailableOptions.PAPER) => "Player1"
    case(AvailableOptions.PAPER, AvailableOptions.LIZARD) => "Player2"
    case(AvailableOptions.LIZARD, AvailableOptions.PAPER) => "Player1"
    case(AvailableOptions.PAPER, AvailableOptions.SPOCK) => "Player1"
    case(AvailableOptions.SPOCK, AvailableOptions.PAPER) => "Player2"
    case(AvailableOptions.SCISSORS, AvailableOptions.LIZARD) => "Player1"
    case(AvailableOptions.LIZARD, AvailableOptions.SCISSORS) => "Player2"
    case(AvailableOptions.SCISSORS, AvailableOptions.SPOCK) => "Player2"
    case(AvailableOptions.SPOCK, AvailableOptions.SCISSORS) => "Player1"
    case(AvailableOptions.LIZARD, AvailableOptions.SPOCK) => "Player1"
    case(AvailableOptions.SPOCK, AvailableOptions.LIZARD) => "Player2"
    case _ => "Draw"
  }

  def askForPlayerInput: Int = {
    readLine("Please enter 1 for rock, 2 for paper, 3 for scissors, 4 for lizard, 5 for spock\n").toInt
  }

  def takeInput(choice: Int): AvailableOptions.Value = choice match {
    case 1 => AvailableOptions.ROCK
    case 2 => AvailableOptions.PAPER
    case 3 => AvailableOptions.SCISSORS
    case 4 => AvailableOptions.LIZARD
    case 5 => AvailableOptions.SPOCK
    case _ => takeInput(askForPlayerInput)
  }

  def randomAIChoice(maxNum: Int): Int ={
    Random.between(1, maxNum)
  }

  def basicAIGame: Unit = {
    val computerInput = takeInput(randomAIChoice(6))
    val playerInput = takeInput(askForPlayerInput)
    println(s"Computer chose $computerInput and you chose $playerInput")
    val result = determineWhoWins(computerInput, playerInput)
    if (result == "Player1") {
      println("Computer wins")
    } else if(result == "Player2") {
      println("You win!")
    } else {
      println("Draw")
    }
  }

  def askIfPlayerWantsToPlayAnotherGame: Boolean = {
    val answer = readLine("Do you want to play again. Press y for yes or n for no.")
    if (answer.head == 'y') {
      true
    } else if (answer.head == 'n') {
      false
    } else {
      println("please enter y or n")
      askIfPlayerWantsToPlayAnotherGame
    }
  }

  def playBasicAIGames: Unit = {
    var playerWantsToPlay = true
    while (playerWantsToPlay) {
      basicAIGame
      playerWantsToPlay = askIfPlayerWantsToPlayAnotherGame
    }
  }

//  def keepTrackOfPlayerChoices(recordedMoves: Array[Value]): Array[Value] = {
//    val possibleReactions = new Array[Value](2 * recordedMoves.length)
//    for (i<-0 until recordedMoves.length) {
//      recordedMoves(i) match {
//        case ROCK => {
//          possibleReactions(i) = PAPER
//          possibleReactions(i + recordedMoves.length) = SPOCK
//        }
//        case SCISSORS => {
//          possibleReactions(i) = ROCK
//          possibleReactions(i + recordedMoves.length) = SPOCK
//        }
//        case PAPER => {
//          possibleReactions(i) = SCISSORS
//          possibleReactions(i + recordedMoves.length) = LIZARD
//        }
//        case LIZARD => {
//          possibleReactions(i) = ROCK
//          possibleReactions(i + recordedMoves.length) = SCISSORS
//        }
//        case SPOCK => {
//          possibleReactions(i) = LIZARD
//          possibleReactions(i + recordedMoves.length) = PAPER
//        }
//      }
//    }
//    possibleReactions
//  }
//
//  def recordMove(alreadyRecordedMoves: Array[Value], amountToRecord: Int, newMove: Value): Array[Value] = {
//    if(alreadyRecordedMoves.length < amountToRecord) {
//      val result = new Array[Value](alreadyRecordedMoves.length + 1)
//      for (i <- 0 until  alreadyRecordedMoves.length) {
//        result(i) = alreadyRecordedMoves(i)
//      }
//      result(alreadyRecordedMoves.length) = newMove
//      result
//    } else {
//      for ( i<- 0 until alreadyRecordedMoves.length - 1) {
//        alreadyRecordedMoves(i) = alreadyRecordedMoves(i + 1)
//      }
//      alreadyRecordedMoves(alreadyRecordedMoves.length - 1) = newMove
//      alreadyRecordedMoves
//    }
//  }
//
//  def createOptionsForAI(reactions: Array[Value]): Array[Value] = {
//    val result = new Array[Value](7 + reactions.length)
//    result(0) = ROCK
//    result(1) = PAPER
//    result(2) = SCISSORS
//    result(3) = LIZARD
//    result(4) = SPOCK
//    for (i <- 5 until result.length - 2 ) {
//      result(i) = reactions(i - 5)
//    }
//    result(-1) = reactions(-1)
//    result(-2) = reactions(-1)
//    result
//  }
//
//  def gameAIBasedOnUserChoices(moves: Array[Value], reactions: Array[Value], numToKeepTrackOf: Int): Unit = {
//    val computerNumber = randomAIChoice(reactions.length)
//    val computerInput = reactions(computerNumber)
//    val playerInput = takeInput(askForPlayerInput)
//    val aiOptions = createOptionsForAI(keepTrackOfPlayerChoices(recordMove(moves,numToKeepTrackOf, playerInput)))
//    println(s"Computer chose $computerInput and you chose $playerInput")
//    val result = determineWhoWins(computerInput, playerInput)
//    if (result == "Player1") {
//      println("Computer wins")
//    } else if(result == "Player2") {
//      println("You win!")
//    } else {
//      println("Draw")
//    }
//  }

}
