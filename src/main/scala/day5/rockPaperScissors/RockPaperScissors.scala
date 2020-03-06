package day5.rockPaperScissors

import scala.io.StdIn.readLine


class RockPaperScissors {

  object availableOptions extends Enumeration {
    type Margin = Value
    val ROCK, PAPER, SCISSORS, LIZARD, SPOCK = Value
  }

  import availableOptions._

  def determineWhoWins(firstPlayerInput: Value, secondPlayerInput: Value) = (firstPlayerInput, secondPlayerInput) match {
    case(PAPER, ROCK) => "Player1"
    case(ROCK, PAPER) => "Player2"
    case(ROCK, SCISSORS) => "Player1"
    case(SCISSORS, ROCK) => "Player2"
    case(ROCK, LIZARD) => "Player1"
    case(LIZARD, ROCK) => "Player2"
    case(ROCK, SPOCK) => "Player2"
    case(SPOCK, ROCK) => "Player1"
    case(PAPER, SCISSORS) => "Player2"
    case(SCISSORS, PAPER) => "Player1"
    case(PAPER, LIZARD) => "Player2"
    case(LIZARD, PAPER) => "Player1"
    case(PAPER, SPOCK) => "Player1"
    case (SPOCK, PAPER) => "Player2"
    case(SCISSORS, LIZARD) => "Player1"
    case(LIZARD, SCISSORS) => "Player2"
    case(SCISSORS, SPOCK) => "Player2"
    case(SPOCK, SCISSORS) => "Player1"
    case(LIZARD, SPOCK) => "Player1"
    case(SPOCK, LIZARD) => "Player2"
  }

  def askForPlayerInput: Int = {
    readLine("Please enter 1 for rock, 2 for paper, 3 for scissors, 4 for lizard, 5 for spock").toInt
  }

  def takePlayerInput(playerChoice: Int): Value = playerChoice match {
    case 1 => availableOptions.ROCK
    case 2 => availableOptions.PAPER
    case 3 => availableOptions.SCISSORS
    case 4 => availableOptions.LIZARD
    case 5 => availableOptions.SPOCK
    case _ => takePlayerInput(askForPlayerInput)
  }

}
