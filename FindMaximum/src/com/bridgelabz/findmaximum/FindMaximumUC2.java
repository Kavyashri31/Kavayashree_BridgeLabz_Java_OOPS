package com.bridgelabz.findmaximum;

public class FindMaximumUC2 {

	public FindMaximumUC2() {
	}

	public static void main(String[] args) {

		Float f1 = 400.5f, f2 = 60.4f, f3 = 10.9f;

		Float max = findMaximum(f1, f2, f3);

		System.out.println("max:" + max);
	}

	public static Float findMaximum(Float i1, Float i2, Float i3) {

		Float max = i1.compareTo(i2) > 0 ? i1 : i2;
		max = max.compareTo(i3) > 0 ? max : i3;
		return max;
	}
}
