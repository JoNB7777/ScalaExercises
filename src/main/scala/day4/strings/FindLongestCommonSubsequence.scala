package day4.strings

class FindLongestCommonSubsequence {

  def getAllSubstrings(str: String): Set[String] = {
    str.inits.flatMap(_.tails).toSet
  }
  def longestCommonSubstring(str1: String, str2: String): String = {
    val str1Substrings = getAllSubstrings(str1)
    val str2Substrings = getAllSubstrings(str2)

    str1Substrings.intersect(str2Substrings).maxBy(_.length)
  }

}
