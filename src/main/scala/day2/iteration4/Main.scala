package day2.iteration4

object Main extends App {

  def fizzBuzzRecursion(firstString: String, secondString: String, num: Int): Unit = {
    if (num == 1) {
      println(num)
    }
    if (num >= 2) {
      fizzBuzzRecursion(firstString, secondString, num - 1)
      if (num % 3 == 0 && num % 5 == 0) {
        println(firstString + secondString)
      } else if (num % 3 == 0) {
        println(firstString)
      } else if (num % 5 == 0) {
        println(secondString)
      } else {
        println(num)
      }
    }
  }

  def iteration2Recursive(myString: String, num: Int): Unit = {
    var result = myString * num
    def innerRecursion(innerRecursionNum: Int): Unit = {
      if (innerRecursionNum == 1) {
        println(result)
      } else {
        innerRecursion( innerRecursionNum - 1)
        println(result)
      }
    }
    innerRecursion(num)
  }

  def iterationRecursive(myString: String, num: Int): Unit = {
    if (num == 1) {
      println(myString)
    } else {
      iterationRecursive(myString, num - 1)
      println(myString)
    }
  }

  iteration2Recursive("Hello", 4)

}
