package day4.strings

import org.scalatest._

class FindLongestCommonSubsequenceSpec extends FlatSpec {

  val strings = new FindLongestCommonSubsequence

  "Creating a FindLongestCommonSubsequence object" should "return an instance of FindLongestCommonSubsequence" in {
    assert(strings.isInstanceOf[FindLongestCommonSubsequence])
  }

  "Finding the longest common subsequence of 'my very creative string' and 'stringfindingcontest' " should "return 'string'" in {
    assert(strings.longestCommonSubstring("my very creative string", "stringfinding contest") == "string")
  }

}
