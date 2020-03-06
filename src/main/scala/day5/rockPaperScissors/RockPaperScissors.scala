package day5.rockPaperScissors

import java.awt.print.Paper

class RockPaperScissors {

  object availableOptions extends Enumeration {
    type Margin = Value
    val Rock, PaperOption, Scissors, Lizard, Spock = Value
  }

  import availableOptions._

  def determineWhoWins(firstPlayerInput: availableOptions.Value, secondPlayerInput: availableOptions.Value) = (firstPlayerInput, secondPlayerInput) match {
    case(PaperOption, Rock) => "Player1"
    case(Rock, PaperOption) => "Player2"
    case(Rock, Scissors) => "Player1"
    case(Scissors, Rock) => "Player2"
    case(Rock, Lizard) => "Player1"
    case(Lizard, Rock) => "Player2"
    case(Rock, Spock) => "Player2"
    case(Spock, Rock) => "Player1"
    case(PaperOption, Scissors) => "Player2"
    case(Scissors, PaperOption) => "Player1"
    case(PaperOption, Lizard) => "Player2"
    case(Lizard, PaperOption) => "Player1"
    case(PaperOption, Spock) => "Player1"
    case (Spock, PaperOption) => "Player2"
    case(Scissors, Lizard) => "Player1"
    case(Lizard, Scissors) => "Player2"
    case(Scissors, Spock) => "Player2"
    case(Spock, Scissors) => "Player1"
    case(Lizard, Spock) => "Player1"
    case(Spock, Lizard) => "Player2"
  }

}
