package day4.primeNumbers2

object Main extends App {

  def findNumberOfPrimes(num: Long): Int = {
    var primeCounter = 1
    for (i <- 3L to num by 2) {
      var divisor = 3L
      var isPrime = true
      while (isPrime && divisor < Math.sqrt(i.toDouble).toLong) {
        if (i % divisor == 0L) {
          isPrime = false
        }
        divisor += 1L
      }
      if (isPrime) {
        primeCounter += 1
      }
    }
    primeCounter
  }

  def findPrimeNumbersUpToTwoBillion: Unit = {
    findNumberOfPrimes(2000000000)
  }

  println(findPrimeNumbersUpToTwoBillion)

}
