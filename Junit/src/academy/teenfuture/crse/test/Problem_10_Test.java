package academy.teenfuture.crse.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import academy.teenfuture.crse.main.Problem_10;

public class Problem_10_Test {

	private final Problem_10 checker = new Problem_10();

	@Test
	public void testStringLength() {
		String[] string_1 = { "apple", "banana", "cat", "dog" };
		assertEquals(6, checker.lengthOfLongestString(string_1), "The longest string is \"banana\", with length 6");

		String[] string_2 = {};
		assertEquals(0, checker.lengthOfLongestString(string_2), "The longest string in an empty array is 0");

		String[] string_3 = { "", "", "", "" };
		assertEquals(0, checker.lengthOfLongestString(string_3), "The longest string in an empty string is 0");

		String[] string_4 = { "orange", "orange", "orange", "orange", "orange", "orange", "orange" };
		assertEquals(6, checker.lengthOfLongestString(string_4), "The longest string is \"orange\", with length 6");

		String[] string_5 = { "very very very long string that might just be the longest one here!", "hi" };
		assertEquals(67, checker.lengthOfLongestString(string_5), "The longest string is a sentence with length 67");
	}

}