package day4.primeNumbers2

import org.scalatest._

class PrimeNumbersLongSpec extends FlatSpec {

  val primes = new PrimeNumbersLong

  "Creating a PrimeNumbersLong object" should "create an instance of PrimeNumbersLong" in {
    assert(primes.isInstanceOf[PrimeNumbersLong])
  }

  "Finding the number of prime numbers up to 20" should "return 8" in {
    assert(primes.findNumberOfPrimes(20) == 8)
  }

}
