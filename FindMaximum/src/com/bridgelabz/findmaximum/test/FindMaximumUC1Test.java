package com.bridgelabz.findmaximum.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.bridgelabz.findmaximum.FindMaximumUC1;

class FindMaximumUC1Test {

	@Test
	void testFindMaximumForFirstElement() {
		Integer i1 = 400, i2 = 60, i3 = 10;
		Integer max = FindMaximumUC1.findMaximum(i1, i2, i3);
		// assert (i1 == max);
		assertEquals(i1, max);
	}

	@Test
	void testFindMaximumForSecondElement() {
		Integer i1 = 400, i2 = 6090, i3 = 10;
		Integer max = FindMaximumUC1.findMaximum(i1, i2, i3);
		assertEquals(i2, max);
	}

	@Test
	void testFindMaximumForThirdElement() {
		Integer i1 = 400, i2 = 6090, i3 = 10256;
		Integer max = FindMaximumUC1.findMaximum(i1, i2, i3);
		assertEquals(i3, max);
	}
}
