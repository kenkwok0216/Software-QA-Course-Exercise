package com.example;

public class Problem_01 {

	public boolean isPalindrome(String str) {
		if (str == null) {
			return false;
		}
		String normalizedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		String reversedStr = new StringBuilder(normalizedStr).reverse().toString();
		return normalizedStr.equals(reversedStr);
	}
}