package academy.teenfuture.crse.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import academy.teenfuture.crse.main.Problem_09;

public class Problem_09_Test {

	private final Problem_09 checker = new Problem_09();

	@Test
	public void testDate() {
		int date_1 = 20231011;
		int otherdate_1 = 20231011;
		assertFalse(checker.isDateAfter(date_1, otherdate_1), "Same date should return false");

		int date_2 = 20251027;
		int otherdate_2 = 20251026;
		assertTrue(checker.isDateAfter(date_2, otherdate_2), "The result is True");

		int date_3 = 20771015;
		int otherdate_3 = 10171011;
		assertTrue(checker.isDateAfter(date_3, otherdate_3), "The result is True");

		int date_4 = 20230101;
		int otherdate_4 = 20231015;
		assertFalse(checker.isDateAfter(date_4, otherdate_4), "The result is False");

		int date_5 = 20221011;
		int otherdate_5 = 21991111;
		assertFalse(checker.isDateAfter(date_5, otherdate_5), "The result is False");
	}

}