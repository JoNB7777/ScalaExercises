package day3.blackjack

object Main extends App {

 def blackjack(num1: Int, num2: Int): Int = {
   if (num1 > 21 && num2 > 21) {
     0
   } else if (num1 > 21) {
     num2
   } else if (num2 > 21) {
     num1
   } else {
     Math.max(num1, num2)
   }
 }

  println(blackjack(22, 23))

}
