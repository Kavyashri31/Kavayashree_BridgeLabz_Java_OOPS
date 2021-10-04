package com.bridgelabz.findmaximum;

public class FindMaximumUC1 {

	public FindMaximumUC1() {
	}

	public static void main(String[] args) {

		Integer i1 = 400, i2 = 60, i3 = 10;

		Integer max = findMaximum(i1, i2, i3);

		System.out.println("max:" + max);
	}

	public static Integer findMaximum(Integer i1, Integer i2, Integer i3) {

		Integer max = i1.compareTo(i2) > 0 ? i1 : i2;
		max = max.compareTo(i3) > 0 ? max : i3;
		return max;
	}
}
