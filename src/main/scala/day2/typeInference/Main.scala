package day2.typeInference

object Main extends App {

  def typeInference(par: Any): Unit = par match {
    case _ => println(par)
  }

  typeInference(true)

}
