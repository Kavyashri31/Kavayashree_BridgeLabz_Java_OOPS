package com.bridgelabz.findmaximum.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.bridgelabz.findmaximum.FindMaximumUC3;

class FindMaximumUC3Test {

	@Test
	void testFindMaximumForFirstElement() {
		String s1 = "Peach", s2 = "Apple", s3 = "Banana";

		String max = FindMaximumUC3.findMaximum(s1, s2, s3);

		assertEquals(s1, max);
	}

	@Test
	void testFindMaximumForSecondElement() {
		String s1 = "Apple", s2 = "Peach", s3 = "Banana";

		String max = FindMaximumUC3.findMaximum(s1, s2, s3);

		assertEquals(s2, max);
	}

	@Test
	void testFindMaximumForThirdElement() {
		String s1 = "Apple", s2 = "Banana", s3 = "Peach";

		String max = FindMaximumUC3.findMaximum(s1, s2, s3);

		assertEquals(s3, max);
	}
}
