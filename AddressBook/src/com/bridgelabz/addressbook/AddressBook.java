package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

	private static List<Contact> contactPersonList = new ArrayList<>();

	public AddressBook() {
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");

		String firstName = readInput("firstName");
		String lastName = readInput("lastName");
		String address = readInput("address");
		String city = readInput("city");
		String zip = readInput("zip");
		String phone = readInput("phone");
		String email = readInput("email");

		Contact contactPerson1 = new Contact(firstName, lastName, address, city, zip, phone, email);
		contactPersonList.add(contactPerson1);

		for (Contact contactPerson : contactPersonList) {
			System.out.println(contactPerson);
		}
	}

	private static String readInput(String term) {
		System.out.print("Enter " + term + ":");
		Scanner scan = new Scanner(System.in);
		return scan.next();
	}
}
