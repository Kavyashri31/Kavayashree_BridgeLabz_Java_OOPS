package com.bridgelabz.findmaximum.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.bridgelabz.findmaximum.FindMaximumUC2;

class FindMaximumUC2Test {

	@Test
	void testFindMaximumForFirstElement() {
		Float f1 = 400.5f, f2 = 60.3f, f3 = 10.9f;
		Float max = FindMaximumUC2.findMaximum(f1, f2, f3);
		assertEquals(f1, max);
	}

	@Test
	void testFindMaximumForSecondElement() {
		Float f1 = 400.2f, f2 = 6090.4f, f3 = 10.3f;
		Float max = FindMaximumUC2.findMaximum(f1, f2, f3);
		assertEquals(f2, max);
	}

	@Test
	void testFindMaximumForThirdElement() {
		Float f1 = 400.2f, f2 = 6090.9f, f3 = 10256.8f;
		Float max = FindMaximumUC2.findMaximum(f1, f2, f3);
		assertEquals(f3, max);
	}
}
