package academy.teenfuture.crse.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import academy.teenfuture.crse.main.Problem_05;

public class Problem_05_Test {

	private final Problem_05 checker = new Problem_05();

	@Test
	public void testSubstring() {
		String mainString_1 = null;
		String subString_1 = null;
		assertFalse(checker.hasSubstring(mainString_1, subString_1), "The result is False");

		String mainString_2 = "Test";
		String subString_2 = "";
		assertTrue(checker.hasSubstring(mainString_2, subString_2), "The result is True");

		String mainString_3 = "Hello World!";
		String subString_3 = "Hello World!";
		assertTrue(checker.hasSubstring(mainString_3, subString_3), "The result is True");

		String mainString_4 = "Hello World!";
		String subString_4 = "world!";
		assertFalse(checker.hasSubstring(mainString_4, subString_4), "The result is False");

		String mainString_5 = "HAHA";
		String subString_5 = "haha";
		assertFalse(checker.hasSubstring(mainString_5, subString_5), "The result is False");
	}

}