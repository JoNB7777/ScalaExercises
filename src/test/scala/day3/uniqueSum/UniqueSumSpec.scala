package day3.uniqueSum
import org.scalatest._

class UniqueSumSpec extends FlatSpec {

  "uniqueSum of 1,2,3" should "return 6" in {
    assert(Main.uniqueSum(1,2,3) == 6)
  }

  "uniqueSum of 1,2,2" should "return 1" in {
    assert(Main.uniqueSum(1,2,2) == 1)
  }

  "uniqueSum of 2,2,1" should "return 1" in {
    assert(Main.uniqueSum(2,2,1) == 1)
  }

  "uniqueSum of 2,1,2" should "return 1" in {
    assert(Main.uniqueSum(2,1,2) == 1)
  }

  "uniqueSum of 1,1,1" should "return 0" in {
    assert(Main.uniqueSum(1,1,1) == 0)
  }

}
