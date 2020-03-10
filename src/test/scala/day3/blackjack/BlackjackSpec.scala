package day3.blackjack
import org.scalatest._

class BlackjackSpec extends FlatSpec {

  "blackjack of 7 and 15" should "return 15" in {
    assert(Main.blackjack(7,15) == 15)
  }

  "blackjack of 15 and 7" should "return 15" in {
    assert(Main.blackjack(15,7) == 15)
  }

  "blackjack of 22 and 14" should "return 14" in {
    assert(Main.blackjack(22,14) == 14)
  }

  "blackjack of 14 and 22" should "return 14" in {
    assert(Main.blackjack(14,22) == 14)
  }

  "blackjack of 23 and 25" should "return 0" in {
    assert(Main.blackjack(23,25) == 0)
  }

  "blackjack of 25 and 23" should "return 0" in {
    assert(Main.blackjack(25,23) == 0)
  }

}
