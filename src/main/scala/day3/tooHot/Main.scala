package day3.tooHot

object Main extends App {

  def tooHot(temperature: Int, isSummer: Boolean): Boolean = isSummer match {
    case true => {
      if (60 <= temperature && temperature <= 100) {
        true
      } else {
        false
      }
    }
    case false => {
      if (60 <= temperature && temperature <= 90) {
        true
      } else {
        false
      }
    }
  }

  println(tooHot(95, false))

}
