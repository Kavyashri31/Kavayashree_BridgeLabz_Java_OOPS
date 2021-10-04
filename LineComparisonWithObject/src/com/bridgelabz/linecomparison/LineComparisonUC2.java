package com.bridgelabz.linecomparison;

import java.util.Scanner;

import com.bridgelabz.linecomparison.model.Point;

public class LineComparisonUC2 {

	public LineComparisonUC2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");

		float x1, y1, x2, y2, x3, y3, x4, y4;
		Scanner scan = new Scanner(System.in);

		// Point 1
		System.out.println("Enter x,y co-ordinates for Point 1");
		x1 = readXCoordinateForPoint(scan);
		y1 = readYCoordinateForPoint(scan);
		Point p1 = new Point(x1, y1);
		// Point 2
		System.out.println("Enter x,y co-ordinates for Point 2");
		x2 = readXCoordinateForPoint(scan);
		y2 = readYCoordinateForPoint(scan);
		Point p2 = new Point(x2, y2);
		// Point 3
		System.out.println("Enter x,y co-ordinates for Point 3");
		x3 = readXCoordinateForPoint(scan);
		y3 = readYCoordinateForPoint(scan);
		Point p3 = new Point(x3, y3);

		// Point 4
		System.out.println("Enter x,y co-ordinates for Point 4");
		x4 = readXCoordinateForPoint(scan);
		y4 = readYCoordinateForPoint(scan);
		Point p4 = new Point(x4, y4);

		scan.close();

		double length1 = p1.getLengthFrom(p2);
		double length2 = p3.getLengthFrom(p4);

		System.out.println("Length of first line:" + length1);
		System.out.println("Length of second line:" + length2);
		if (length1 == length2)
			System.out.println("The two lines are equal.");
		else
			System.out.println("The two lines are not equal.");

	}

	private static float readYCoordinateForPoint(Scanner scan) {
		float y1;
		System.out.print("Enter the y co-ordinate of Point:");
		y1 = scan.nextFloat();
		return y1;
	}

	private static float readXCoordinateForPoint(Scanner scan) {
		float x1;
		System.out.print("Enter the x co-ordinate of Point:");
		x1 = scan.nextFloat();
		return x1;
	}

}
