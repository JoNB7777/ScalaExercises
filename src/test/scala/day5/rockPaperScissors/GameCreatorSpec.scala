package day5.rockPaperScissors

import org.scalatest._

class GameCreatorSpec extends FlatSpec {

  val creator = new GameCreator
  val testGame = new RockPaperScissors

  "Creating a GameCreator object" should "return an instance of GameCreator" in {
    assert(creator.isInstanceOf[GameCreator])
  }

  "Passing difficulty 1 to decideDifficulty" should "create a game where computer makes random decisions" in {
//    assert(creator.decideDifficulty(1, testGame) == testGame.playBasicAIGames)
  }



}
