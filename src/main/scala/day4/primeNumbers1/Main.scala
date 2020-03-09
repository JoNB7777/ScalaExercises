package day4.primeNumbers1

object Main extends App {

  val example = new PrimeNumbers
  val example2 = new PrimeNumbersRecursive

  println(example.findNumberOfPrimes(20))

//  println(example.findPrimeNumbersUpToThreeMillion)
//  println(example2.recursiveIsPrime(95))
  println(example2.longRecursiveIsPrime(2000000000L))
  println(example2.findAllPrimesUpToNum(200000000L))

}
