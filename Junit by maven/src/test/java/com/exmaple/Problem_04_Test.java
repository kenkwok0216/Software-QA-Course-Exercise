package com.exmaple;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.example.Problem_04;

public class Problem_04_Test {

	private final Problem_04 checker = new Problem_04();

	@Test
	public void testPalindrome() {
		int[] arr_1 = { 1, 2, 3, 4, 5 };
		assertTrue(checker.isAscending(arr_1), "The array is sorted");

		int[] arr_2 = null;
		assertTrue(checker.isAscending(arr_2), "Null array is sorted");

		int[] arr_3 = { 42 };
		assertFalse(checker.isAscending(arr_3), "Aarray with one element is sorted");

		int[] arr_4 = { 5, 4, 3, 2, 1 };
		assertFalse(checker.isAscending(arr_4), "The array is unsorted");

		int[] arr_5 = { -5, 0, 7, 9, 11 };
		assertTrue(checker.isAscending(arr_5), "The array is sorted");
	}

}