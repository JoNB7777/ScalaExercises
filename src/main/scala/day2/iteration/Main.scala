package day2.iteration

object Main extends App {

  def iterationPrintString(myString: String, numOfIterations: Int): Unit = {
    for (i <- numOfIterations to 1 by -1) {
      println(myString)
    }
  }

  iterationPrintString("Hello", 4)

}
