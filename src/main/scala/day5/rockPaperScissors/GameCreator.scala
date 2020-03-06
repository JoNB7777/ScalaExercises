package day5.rockPaperScissors

import scala.io.StdIn.readLine

class GameCreator {

  def decideDifficulty(difficulty: Int, game: RockPaperScissors): Unit = difficulty match {
    case 1 => game.playBasicAIGames
    case 2 =>
    case 3 =>
  }

  def askForDifficulty: Int = {
    readLine("Please choose a difficulty: 1 (easy), 2 (medium) or 3 (hard): \n").toInt
  }

  def passOnDifficulty(): Int = {
    val difficulty = askForDifficulty
    if (!(Set(1, 2, 3) contains(difficulty))) {
      passOnDifficulty()
    }
    difficulty
  }

  def createGame(game: RockPaperScissors): Unit = {
    decideDifficulty(passOnDifficulty(), game)
  }



}
