package com.bridgelabz.stockaccount;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StockPortfolio {

	static List<Stock> stockList = new ArrayList<>();

	private static void calculateValueOfStocks(List<Stock> stockList) {

		double totalValue = 0.0;
		for (Stock stock : stockList) {
			String stockName = stock.getName();
			int unit = stock.getUnit();
			double price = stock.getPrice();
			double value = unit * price;

			System.out.println("Stock: " + stockName);
			System.out.println("Units:" + unit);
			System.out.println("Price:" + price);
			System.out.println("Value:" + value);
			System.out.println("--------------------------------------------------");
			totalValue += value;
		}
		System.out.println("Total Invested:" + totalValue);

	}

	public static void main(String[] args) throws IOException {

		String filePath = new File("").getAbsolutePath();
		BufferedReader reader = new BufferedReader(new FileReader(filePath + "/resources/Stocks.csv"));

		String line = null;

		while ((line = reader.readLine()) != null) {

			String[] stockLine = line.split(",");

			String stockName = stockLine[0];
			int units = Integer.parseInt(stockLine[1]);
			double price = Double.parseDouble(stockLine[2]);

			Stock stockObj = new Stock(stockName, units, price);
			stockList.add(stockObj);

		}
		System.out.println(stockList);

		calculateValueOfStocks(stockList);

	}

}
