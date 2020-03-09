package day4.primeNumbers1

import scala.collection.mutable.ListBuffer

class PrimeNumbersRecursive {

  def recursiveIsPrime(num: Int): Boolean = {
    var result = true
    if (num == 2 || num == 3) {
      result = true
    } else if (num % 2 == 0) {
      result = false
    } else {
      var isPrime = true
      var divisor = 3
      while (isPrime && divisor <= Math.sqrt(num).toInt) {
        if (num % divisor == 0) {
          isPrime = false
        }
        do {
          divisor += 2
        } while (!recursiveIsPrime(divisor))
      }
      result = isPrime
    }
    result
  }

  def longRecursiveIsPrime(num: Long): Boolean = {
    var result = true
    if (num == 2L || num == 3L) {
      result = true
    } else if (num % 2L == 0L) {
      result = false
    } else {
      var isPrime = true
      var divisor = 3L
      while (isPrime && divisor <= Math.sqrt(num).toLong) {
        if (num % divisor == 0L) {
          isPrime = false
        }
        do {
          divisor += 2L
        } while (!longRecursiveIsPrime(divisor))
      }
      result = isPrime
    }
    result
  }

  def findAllPrimesUpToNum(num: Long): Long = {
    var primeCounter = 1L
    for (i <- 3L to num by 2L) {
      if (longRecursiveIsPrime(i)) {
        primeCounter += 1
      }
    }
    primeCounter
  }

}
