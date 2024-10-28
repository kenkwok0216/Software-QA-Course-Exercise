package academy.teenfuture.crse.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import academy.teenfuture.crse.main.Problem_01;

public class Problem_01_Test {

	private final Problem_01 checker = new Problem_01();

	@Test
	public void testPalindrome() {
		assertTrue(checker.isPalindrome("A man, a plan, a canal, Panama"), "Should be a palindrome");
		assertTrue(checker.isPalindrome("wow"), "Should be a palindrome");
		assertTrue(checker.isPalindrome(""), "Empty string should be a palindrome");
		assertFalse(checker.isPalindrome("Hello"), "Should not be a palindrome");
		assertFalse(checker.isPalindrome("World"), "Should not be a palindrome");
	}

}