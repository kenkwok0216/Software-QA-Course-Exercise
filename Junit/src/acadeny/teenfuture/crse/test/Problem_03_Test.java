package acadeny.teenfuture.crse.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import acadeny.teenfuture.crse.main.Problem_03;

public class Problem_03_Test {

	private final Problem_03 checker = new Problem_03();

	@Test
	public void testPrime() {
		assertFalse(checker.isPrime(-1), "0 is not prime");
		assertFalse(checker.isPrime(0), "-1 is not prime");
		assertFalse(checker.isPrime(1), "0 is not prime");
		assertFalse(checker.isPrime(-117), "-117 is not prime");
		assertTrue(checker.isPrime(2), "2  is prime");
		assertTrue(checker.isPrime(7), "7  is prime");
		assertTrue(checker.isPrime(-11), "11  is prime");
	}

}