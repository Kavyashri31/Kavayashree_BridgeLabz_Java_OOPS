package com.bridgelabz.linecomparison.model;

public class Point {

	public Point() {
	}

	private float x;
	private float y;

	public Point(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}

	/**
	 * @return the x
	 */
	public float getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(float x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public float getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(float y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public double getLengthFrom(Point p) {
		return Math.sqrt(Math.pow((p.getX() - this.getX()), 2) + Math.pow((p.getY() - this.getY()), 2));
	}
}
