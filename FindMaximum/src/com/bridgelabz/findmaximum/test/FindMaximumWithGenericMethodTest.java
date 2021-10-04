package com.bridgelabz.findmaximum.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.bridgelabz.findmaximum.FindMaximumWithGenericMethod;

class FindMaximumWithGenericMethodTest {

	@Test
	void testFindMaximumIntegerForFirstElement() {
		Integer i1 = 400, i2 = 60, i3 = 10;
		Integer max = FindMaximumWithGenericMethod.findMaximum(i1, i2, i3);
		// assert (i1 == max);
		assertEquals(i1, max);
	}

	@Test
	void testFindMaximumIntegerForSecondElement() {
		Integer i1 = 400, i2 = 6090, i3 = 10;
		Integer max = FindMaximumWithGenericMethod.findMaximum(i1, i2, i3);
		assertEquals(i2, max);
	}

	@Test
	void testFindMaximumIntegerForThirdElement() {
		Integer i1 = 400, i2 = 6090, i3 = 10256;
		Integer max = FindMaximumWithGenericMethod.findMaximum(i1, i2, i3);
		assertEquals(i3, max);
	}

	@Test
	void testFindMaximumStringForFirstElement() {
		String s1 = "Peach", s2 = "Apple", s3 = "Banana";

		String max = FindMaximumWithGenericMethod.findMaximum(s1, s2, s3);

		assertEquals(s1, max);
	}

	@Test
	void testFindMaximumStringForSecondElement() {
		String s1 = "Apple", s2 = "Peach", s3 = "Banana";

		String max = FindMaximumWithGenericMethod.findMaximum(s1, s2, s3);

		assertEquals(s2, max);
	}

	@Test
	void testFindMaximumStringForThirdElement() {
		String s1 = "Apple", s2 = "Banana", s3 = "Peach";

		String max = FindMaximumWithGenericMethod.findMaximum(s1, s2, s3);

		assertEquals(s3, max);
	}

	@Test
	void testFindMaximumFloatForFirstElement() {
		Float f1 = 400.5f, f2 = 60.3f, f3 = 10.9f;
		Float max = FindMaximumWithGenericMethod.findMaximum(f1, f2, f3);
		assertEquals(f1, max);
	}

	@Test
	void testFindMaximumFloatForSecondElement() {
		Float f1 = 400.2f, f2 = 6090.4f, f3 = 10.3f;
		Float max = FindMaximumWithGenericMethod.findMaximum(f1, f2, f3);
		assertEquals(f2, max);
	}

	@Test
	void testFindMaximumFloatForThirdElement() {
		Float f1 = 400.2f, f2 = 6090.9f, f3 = 10256.8f;
		Float max = FindMaximumWithGenericMethod.findMaximum(f1, f2, f3);
		assertEquals(f3, max);
	}

}
