package com.bridgelabz.findmaximum;

public class FindMaximumWithGenericMethod {

	public FindMaximumWithGenericMethod() {
	}

	public static void main(String[] args) {

		Integer i1 = 400, i2 = 60, i3 = 10;

		Integer maxInt = findMaximum(i1, i2, i3);

		System.out.println("maxInt:" + maxInt);

		Float f1 = 400.5f, f2 = 60.4f, f3 = 10.9f;

		Float maxFloat = findMaximum(f1, f2, f3);

		System.out.println("maxFloat:" + maxFloat);

		String s1 = "Apple", s2 = "Peach", s3 = "Banana";

		String maxString = findMaximum(s1, s2, s3);

		System.out.println("maxString:" + maxString);
	}

	public static <T extends Comparable> T findMaximum(T i1, T i2, T i3) {

		T max = i1.compareTo(i2) > 0 ? i1 : i2;
		max = max.compareTo(i3) > 0 ? max : i3;
		return max;
	}
}
