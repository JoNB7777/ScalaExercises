package day5.rockPaperScissors

class DetermineWinner {

  def rockPlays(otherPlayer: AvailableOptions.Value): String = otherPlayer match {
    case AvailableOptions.LIZARD => "Player1"
    case AvailableOptions.SPOCK => "Player2"
    case AvailableOptions.SCISSORS => "Player1"
    case AvailableOptions.PAPER =>  "Player2"
    case _ => "Draw"
  }

  def paperPlays(otherPlayer: AvailableOptions.Value): String = otherPlayer match {
    case AvailableOptions.LIZARD => "Player2"
    case AvailableOptions.SPOCK => "Player1"
    case AvailableOptions.SCISSORS => "Player1"
    case AvailableOptions.ROCK =>  "Player2"
    case _ => "Draw"
  }

  def scissorsPlays(otherPlayer: AvailableOptions.Value): String = otherPlayer match {
    case AvailableOptions.LIZARD => "Player1"
    case AvailableOptions.SPOCK => "Player2"
    case AvailableOptions.ROCK => "Player2"
    case AvailableOptions.PAPER =>  "Player1"
    case _ => "Draw"
  }

  def lizardPlays(otherPlayer: AvailableOptions.Value): String = otherPlayer match {
    case AvailableOptions.ROCK => "Player2"
    case AvailableOptions.SPOCK => "Player1"
    case AvailableOptions.SCISSORS => "Player2"
    case AvailableOptions.PAPER =>  "Player1"
    case _ => "Draw"
  }

  def spockPlays(otherPlayer: AvailableOptions.Value): String = otherPlayer match {
    case AvailableOptions.LIZARD => "Player2"
    case AvailableOptions.ROCK=> "Player1"
    case AvailableOptions.SCISSORS => "Player1"
    case AvailableOptions.PAPER =>  "Player2"
    case _ => "Draw"
  }

}
