package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class AddressBook {

	private static List<Contact> contactList = new ArrayList<>();

	public AddressBook() {
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");

		while (true) {
			System.out.println("--------------------------------------------------------");
			System.out.println("Choose an Operation from the following list.");
			System.out.println("1 -Add a contact");
			System.out.println("2 -Edit a contact");
			System.out.println("3 -Delete a contact");
			System.out.println("4 -Display addressBook");
			System.out.println("5 -Search a Contact(using city/state)");
			System.out.println("6 -Count of Contacts in city/state)");
			System.out.println("E -Exit");
			System.out.println("--------------------------------------------------------");

			String opertion = readInput("Operation");
			switch (opertion) {
			case "1":
				addContact();
				break;
			case "2":
				editContact();
				break;
			case "3":
				deleteContact();
				break;
			case "4":
				displayAddressBook();
				break;
			case "5":
				searchPerson();
				break;
			case "6":
				countPerson();
				break;
			case "E":
				System.exit(0);
			}
		}
	}

	private static void countPerson() {
		String cityOrStateToSearch = readInput("City/State To Search");

		int count = (int) contactList.stream()
				.filter(contact -> (contact.getCity().equalsIgnoreCase(cityOrStateToSearch)
						|| contact.getState().equalsIgnoreCase(cityOrStateToSearch)))
				.count();
		System.out.println("Number of matching Contacts:" + count);
	}

	private static void searchPerson() {
		String cityOrStateToSearch = readInput("City/State To Search");

		contactList.stream().filter(contact -> (contact.getCity().equalsIgnoreCase(cityOrStateToSearch)
				|| contact.getState().equalsIgnoreCase(cityOrStateToSearch))).forEach(System.out::println);

	}

	private static void displayAddressBook() {
		for (Contact contact : contactList) {
			System.out.println(contact);
		}

	}

	private static void deleteContact() {
		String nameToDelete = readInput("Name To Delete");

		for (Iterator<Contact> iterator = contactList.iterator(); iterator.hasNext();) {
			Contact contact = iterator.next();
			if (contact.getFirstName().equals(nameToDelete)) {
				iterator.remove();
				System.out.println("Deletion of Contact " + nameToDelete + " Successful.");
			}
		}

	}

	private static void editContact() {
		String nameToEdit = readInput("Name To Edit");
		String firstName = readInput("firstName");
		String lastName = readInput("lastName");
		String address = readInput("address");
		String city = readInput("city");
		String state = readInput("state");
		String zip = readInput("zip");
		String phone = readInput("phone");
		String email = readInput("email");

		Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phone, email);

		Consumer<Contact> editContactLambda = contact -> {

			if (contact.getFirstName().equals(nameToEdit)) {
				int itemIndex = contactList.indexOf(contact);
				if (itemIndex != -1) {
					contactList.set(itemIndex, newContact);
					System.out.println("Edit of Contact Successful." + newContact);
				}

			}
		};

		contactList.forEach(editContactLambda);

	}

	private static void addContact() {
		String firstName = readInput("firstName");
		String lastName = readInput("lastName");
		String address = readInput("address");
		String city = readInput("city");
		String state = readInput("state");
		String zip = readInput("zip");
		String phone = readInput("phone");
		String email = readInput("email");

		Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phone, email);
		boolean duplicateContact = false;

		for (Contact contact : contactList) {
			if (contact.equals(newContact)) {
				System.out.println("Contact already exists. Enter a different name.");
				duplicateContact = true;
			}
		}

		if (!duplicateContact)
			contactList.add(newContact);
	}

	private static String readInput(String term) {
		System.out.print("Enter " + term + ":");
		Scanner scan = new Scanner(System.in);
		return scan.next();
	}
}
