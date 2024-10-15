package com.exmaple;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.example.Problem_01;

public class Problem_01_Checker {

	private final Problem_01 checker = new Problem_01();

	@Test
	public void testPalindrome() {
		assertTrue(checker.isPalindrome("A man, a plan, a canal, Panama"), "Should be a palindrome");
		assertTrue(checker.isPalindrome("racecar"), "Should be a palindrome");
		assertTrue(checker.isPalindrome(""), "Empty string should be a palindrome");
		assertFalse(checker.isPalindrome("Hello"), "Should not be a palindrome");
		assertFalse(checker.isPalindrome("World"), "Should not be a palindrome");
	}

	@Test
	public void testNullInput() {
		assertFalse(checker.isPalindrome(null), "Null input should not be a palindrome");
	}
}