package day2.fizzBuzz

object Main extends App {

  def fizzBuzz(firstString: String, secondString: String, num: Int): Unit = {
    for (i <- 1 to num by 1) {
      if (i%3 == 0 && i%5 == 0) {
        println(firstString + secondString)
      } else if (i%3 == 0) {
        println(firstString)
      } else if (i%5 == 0) {
        println(secondString)
      } else {
        println(i)
      }
    }
  }

  fizzBuzz("Hello", "World", 15)

}
