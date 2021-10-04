package com.bridgelabz.findmaximum;

public class FindMaximumUC3 {

	public FindMaximumUC3() {
	}

	public static void main(String[] args) {

		String s1 = "Apple", s2 = "Peach", s3 = "Banana";

		String max = findMaximum(s1, s2, s3);

		System.out.println("max:" + max);
	}

	public static String findMaximum(String s1, String s2, String s3) {

		String max = s1.compareTo(s2) > 0 ? s1 : s2;
		max = max.compareTo(s3) > 0 ? max : s3;
		return max;
	}
}
