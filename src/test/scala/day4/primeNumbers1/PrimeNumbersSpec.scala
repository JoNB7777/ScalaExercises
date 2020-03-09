package day4.primeNumbers1

import org.scalatest._

class PrimeNumbersSpec extends FlatSpec {

  val primes = new PrimeNumbers

  "Creating a PrimeNumbers object" should "create an instance of PrimeNumbers" in {
    assert(primes.isInstanceOf[PrimeNumbers])
  }

  "Calculating the number of prime numbers up to 20" should "return 8" in {
    assert(primes.findNumberOfPrimes(20) == 8)
  }
}
