package com.bridgelabz.stockaccount;

public class Stock {

	private String name;
	private int unit;
	private double price;

	public Stock() {
		super();
	}

	public Stock(String name, int unit, double price) {
		super();
		this.name = name;
		this.unit = unit;
		this.price = price;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the unit
	 */
	public int getUnit() {
		return unit;
	}

	/**
	 * @param unit the unit to set
	 */
	public void setUnit(int unit) {
		this.unit = unit;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Stock [name=" + name + ", unit=" + unit + ", price=" + price + "]";
	}

}
