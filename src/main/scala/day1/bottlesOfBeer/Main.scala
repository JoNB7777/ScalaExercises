package day1.bottlesOfBeer

object Main extends App {

  def bottlesOfBeer(bottles: Int): Unit = {
    for (i <- bottles to 0 by -1) {
      var j = i -1
      if (i > 1) {
        println(s"There's $i bottles of beer on the wall. You take one down, you pass it around, there's $j bottles of beer on the wall!")
      } else if (i == 1) {
        println(s"There's $i bottle of beer on the wall. You take one down, you pass it around, there's no more beer on the wall!")
      }  else {
        println("Get more beer!")
      }
    }
  }

  bottlesOfBeer(92)

}
