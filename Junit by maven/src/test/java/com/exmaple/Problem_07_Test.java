package com.exmaple;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.example.Problem_07;

public class Problem_07_Test {

	private final Problem_07 checker = new Problem_07();

	@Test
	public void testPrefix() {
		String mainString_1 = null;
		String prefix_1 = null;
		assertFalse(checker.startsWithPrefix(mainString_1, prefix_1), "The result is False");

		String mainString_2 = "Test";
		String prefix_2 = "T";
		assertTrue(checker.startsWithPrefix(mainString_2, prefix_2), "The result is True");

		String mainString_3 = "Hello World!";
		String prefix_3 = "";
		assertTrue(checker.startsWithPrefix(mainString_3, prefix_3), "The result is True");

		String mainString_4 = "Hello World!";
		String prefix_4 = "world!";
		assertFalse(checker.startsWithPrefix(mainString_4, prefix_4), "The result is False");

		String mainString_5 = "HAHA";
		String prefix_5 = "haha";
		assertFalse(checker.startsWithPrefix(mainString_5, prefix_5), "The result is False");
	}

}