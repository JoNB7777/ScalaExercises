package day2.iteration2

object Main extends App {

  def iteration2(myString: String, num: Int): Unit = {
    val result = myString * num
    for (i <- num to 1 by -1) {
      println(result)
    }
  }

  iteration2("Hello", 4)

}
