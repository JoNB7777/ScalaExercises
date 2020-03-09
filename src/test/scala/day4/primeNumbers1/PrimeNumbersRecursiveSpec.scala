package day4.primeNumbers1

import org.scalatest._

class PrimeNumbersRecursiveSpec extends FlatSpec {

  val primes = new PrimeNumbersRecursive

  "Creating aPrimeNumbersRecursive object" should "give an instance of PrimeNumbersRecursive" in {
    assert(primes.isInstanceOf[PrimeNumbersRecursive])
  }

  "Running recursiveIsPrime for 19" should "return true" in {
    assert(primes.recursiveIsPrime(19) == true)
  }

  "Running recursiveIsPrime for 14" should "return false" in {
    assert(primes.recursiveIsPrime(20) == false)
  }

  "Creating the number of prime numbers up to 20" should "return 8" in {
    assert(primes.findAllPrimesUpToNum(20) == 8)
  }



}
