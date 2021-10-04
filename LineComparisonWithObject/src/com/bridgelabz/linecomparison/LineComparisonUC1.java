package com.bridgelabz.linecomparison;

import java.util.Scanner;

import com.bridgelabz.linecomparison.model.Point;

public class LineComparisonUC1 {

	public LineComparisonUC1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");

		float x1, y1, x2, y2;
		Scanner scan = new Scanner(System.in);

		// Point 1
		System.out.print("Enter the x co-ordinate of Point 1:");
		x1 = scan.nextFloat();
		System.out.print("Enter the y co-ordinate of Point 1:");
		y1 = scan.nextFloat();

		Point p1 = new Point(x1, y1);

		// Point 2
		System.out.print("Enter the x co-ordinate of Point 2:");
		x2 = scan.nextFloat();
		System.out.print("Enter the y co-ordinate of Point 2:");
		y2 = scan.nextFloat();

		Point p2 = new Point(x2, y2);

		scan.close();

		double length = p1.getLengthFrom(p2);// Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

		System.out.println("Length of line between points " + p1 + " and " + p2 + " is: " + length);

	}

}
