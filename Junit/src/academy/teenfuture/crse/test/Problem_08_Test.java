package academy.teenfuture.crse.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import academy.teenfuture.crse.main.Problem_08;

public class Problem_08_Test {

	private final Problem_08 checker = new Problem_08();

	@Test
	public void testSuffix() {
		String mainString_1 = null;
		String suffix_1 = null;
		assertFalse(checker.startsWithPrefix(mainString_1, suffix_1), "The result is False");

		String mainString_2 = "Test";
		String suffix_2 = "t";
		assertTrue(checker.startsWithPrefix(mainString_2, suffix_2), "The result is True");

		String mainString_3 = "Hello World!";
		String suffix_3 = "";
		assertTrue(checker.startsWithPrefix(mainString_3, suffix_3), "Empty String should return true");

		String mainString_4 = "Hello World!";
		String suffix_4 = "Hello World!";
		assertTrue(checker.startsWithPrefix(mainString_4, suffix_4), "Same String should return true");

		String mainString_5 = "HAHA";
		String suffix_5 = "haha";
		assertFalse(checker.startsWithPrefix(mainString_5, suffix_5), "The result is False");
	}

}