package day4.primeNumbers1

class PrimeNumbers {

  def findNumberOfPrimes(num: Int): Int = {
    var primeCounter = 1
    for (i <- 3 to num by 2) {
      var divisor = 3
      var isPrime = true
      while (isPrime && divisor < Math.sqrt(i.toDouble).toInt) {
        if (i % divisor == 0) {
          isPrime = false
        }
        divisor += 1
      }
      if (isPrime) {
        primeCounter += 1
      }
    }
    primeCounter
  }

  def findPrimeNumbersUpToThreeMillion: Int = {
    findNumberOfPrimes(2999999)
  }

}
