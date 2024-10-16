package com.example;

public class Problem_01 {

	// a palindrome meaning same backwards as forwards
	public boolean isPalindrome(String str) {

		String normalizedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		String reversedStr = new StringBuilder(normalizedStr).reverse().toString();
		return normalizedStr.equals(reversedStr);
	}
}