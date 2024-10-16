package com.exmaple;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.example.Problem_06;

public class Problem_06_Test {

	private final Problem_06 checker = new Problem_06();

	@Test
	public void testElement() {
		int[] array_1 = { 1, 2, 3, 4, 5 };
		int element_1 = 9;
		assertFalse(checker.hasElement(array_1, element_1), "The result is False");

		int[] array_2 = { 1, 2, 3, 4, 5 };
		int element_2 = 3;
		assertTrue(checker.hasElement(array_2, element_2), "The result is True");

		int[] array_3 = {};
		int element_3 = 1;
		assertFalse(checker.hasElement(array_3, element_3), "The result is False");

		int[] array_4 = null;
		int element_4 = 3;
		assertFalse(checker.hasElement(array_4, element_4), "The result is False");

		int[] array_5 = { 1, 2, -3, 4, 5 };
		int element_5 = -3;
		assertTrue(checker.hasElement(array_5, element_5), "The result is False");
	}

}