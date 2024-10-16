package com.exmaple;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.example.Problem_02;

public class Problem_02_Test {

	private final Problem_02 checker = new Problem_02();

	@Test
	public void testEven() {
		assertTrue(checker.iseven(4), "4 should be even");
		assertTrue(checker.iseven(-1024), "-1024 should be even");
		assertTrue(checker.iseven(0), "0 should also be even");
		assertFalse(checker.iseven(-7), "-7 shoud be odd");
		assertFalse(checker.iseven(991), "991 shoud be odd");
	}

}