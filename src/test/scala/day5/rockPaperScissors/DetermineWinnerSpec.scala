package day5.rockPaperScissors

import org.scalatest._

class DetermineWinnerSpec extends FlatSpec {

  val testObject = new DetermineWinner

  "Creating a DetermineWinner object" should "return an instance of Determine Winner" in {
    assert(testObject.isInstanceOf[DetermineWinner])
  }

  "rockPlays" should "return 'Draw' when other player also has rock" in {
    assert(testObject.rockPlays(AvailableOptions.ROCK) == "Draw")
  }

  "rockPlays" should "return 'Player1' when other player has lizard" in {
    assert(testObject.rockPlays(AvailableOptions.LIZARD) == "Player1")
  }

  "rockPlays" should "return 'Player1' when other player has scissors" in {
    assert(testObject.rockPlays(AvailableOptions.SCISSORS) == "Player1")
  }

  "rockPlays" should "return 'Player2' when other player has spock" in {
    assert(testObject.rockPlays(AvailableOptions.SPOCK) == "Player2")
  }

  "rockPlays" should "return 'Player2' when other player has paper" in {
    assert(testObject.rockPlays(AvailableOptions.PAPER) == "Player2")
  }

  "paperPlays" should "return 'Draw' when other player also has paper" in {
    assert(testObject.paperPlays(AvailableOptions.PAPER) == "Draw")
  }

  "paperPlays" should "return 'Player1' when other player has spock" in {
    assert(testObject.paperPlays(AvailableOptions.SPOCK) == "Player1")
  }

  "paperPlays" should "return 'Player1' when other player has scissors" in {
    assert(testObject.paperPlays(AvailableOptions.SCISSORS) == "Player1")
  }

  "paperPlays" should "return 'Player2' when other player has lizard" in {
    assert(testObject.paperPlays(AvailableOptions.LIZARD) == "Player2")
  }

  "paperPlays" should "return 'Player2' when other player has rock" in {
    assert(testObject.paperPlays(AvailableOptions.ROCK) == "Player2")
  }

  "scissorsPlays" should "return 'Draw' when other player also has scissors" in {
    assert(testObject.scissorsPlays(AvailableOptions.SCISSORS) == "Draw")
  }

  "scissorsPlays" should "return 'Player1' when other player has lizard" in {
    assert(testObject.scissorsPlays(AvailableOptions.LIZARD) == "Player1")
  }

  "scissorsPlays" should "return 'Player1' when other player has paper" in {
    assert(testObject.scissorsPlays(AvailableOptions.PAPER) == "Player1")
  }

  "scissorsPlays" should "return 'Player2' when other player has spock" in {
    assert(testObject.scissorsPlays(AvailableOptions.SPOCK) == "Player2")
  }

  "scissorsPlays" should "return 'Player2' when other player has rock" in {
    assert(testObject.scissorsPlays(AvailableOptions.ROCK) == "Player2")
  }

  "lizardPlays" should "return 'Draw' when other player also has lizard" in {
    assert(testObject.lizardPlays(AvailableOptions.LIZARD) == "Draw")
  }

  "lizardPlays" should "return 'Player1' when other player has spock" in {
    assert(testObject.lizardPlays(AvailableOptions.SPOCK) == "Player1")
  }

  "lizardPlays" should "return 'Player1' when other player has paper" in {
    assert(testObject.lizardPlays(AvailableOptions.PAPER) == "Player1")
  }

  "lizardPlays" should "return 'Player2' when other player has rock" in {
    assert(testObject.lizardPlays(AvailableOptions.ROCK) == "Player2")
  }

  "lizardPlays" should "return 'Player2' when other player has scissors" in {
    assert(testObject.lizardPlays(AvailableOptions.SCISSORS) == "Player2")
  }

  "spockPlays" should "return 'Draw' when other player also has spock" in {
    assert(testObject.spockPlays(AvailableOptions.SPOCK) == "Draw")
  }

  "spockPlays" should "return 'Player1' when other player has rock" in {
    assert(testObject.spockPlays(AvailableOptions.ROCK) == "Player1")
  }

  "spockPlays" should "return 'Player1' when other player has scissors" in {
    assert(testObject.spockPlays(AvailableOptions.SCISSORS) == "Player1")
  }

  "spockPlays" should "return 'Player2' when other player has lizard" in {
    assert(testObject.spockPlays(AvailableOptions.LIZARD) == "Player2")
  }

  "spockPlays" should "return 'Player2' when other player has paper" in {
    assert(testObject.spockPlays(AvailableOptions.PAPER) == "Player2")
  }
}
