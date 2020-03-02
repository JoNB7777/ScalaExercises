package day1.bottlesOfBeer

object BottlesOfBeer extends App {

  def bottlesOfBeer(bottles: Int): Unit = {
    for (i <- bottles to 0 by -1) {
      if (i > 1) {
        println(s"There's $i bottles of beer on the wall.")
      } else if (i == 1) {
        println(s"There's $i bottle of beer on the wall.")
      }else {
        println("Get more beer!")
      }
    }
  }

  bottlesOfBeer(92)

}
