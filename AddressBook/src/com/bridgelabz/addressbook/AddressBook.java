package com.bridgelabz.addressbook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddressBook {

	static List<Contact> contactList = new ArrayList<>();

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
			System.out.println("7 -Read contact(s) from the file)");
			System.out.println("8 -Write contact(s) to the file)");
			System.out.println("E -Exit");
			System.out.println("--------------------------------------------------------");

			String opertion = readInput("Operation");
			AddressBook addressBook = new AddressBook();
			switch (opertion) {
			case "1":
				addressBook.addContact();
				break;
			case "2":
				addressBook.editContact();
				break;
			case "3":
				addressBook.deleteContact();
				break;
			case "4":
				addressBook.displayAddressBook();
				break;
			case "5":
				addressBook.searchPerson();
				break;
			case "6":
				addressBook.countPerson();
				break;

			case "7":
				addressBook.addContactFromFile();
				break;

			case "8":
				addressBook.writeContactToFile();
				break;

			case "E":
				System.exit(0);
			}
		}
	}

	void writeContactToFile() {
		try {

			List<String[]> dataLines = new ArrayList<>();

			for (Contact c : contactList) {
				String[] contact = new String[8];
				contact[0] = c.getFirstName();
				contact[1] = c.getLastName();
				contact[2] = c.getAddress();
				contact[3] = c.getCity();
				contact[4] = c.getState();
				contact[5] = c.getZip();
				contact[6] = c.getPhone();
				contact[7] = c.getEmail();
				dataLines.add(contact);
			}
			File csvOutputFile = new File("C:\\Users\\kavya\\OneDrive\\Desktop\\ContactsOutput.csv");
			try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
				dataLines.stream().map(this::convertToCSV).forEach(pw::println);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	String convertToCSV(String[] data) {
		return Stream.of(data).map(this::escapeSpecialCharacters).collect(Collectors.joining(","));
	}

	String escapeSpecialCharacters(String data) {
		String escapedData = data.replaceAll("\\R", " ");
		if (data.contains(",") || data.contains("\"") || data.contains("'")) {
			data = data.replace("\"", "\"\"");
			escapedData = "\"" + data + "\"";
		}
		return escapedData;
	}

	void addContactFromFile() {
		Class clazz = AddressBook.class;
		InputStream inputStream = clazz.getResourceAsStream("/ContactsInput.csv");
		String data = null;
		try {
			data = readFromInputStream(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}

		String[] fields = data.toLowerCase().split(",");
		System.out.print("Data from the file: ");
		int i = 0;
		for (int line = 0; line < fields.length / 8; line++) {
			String firstName = fields[i];
			String lastName = fields[i + 1];
			String address = fields[i + 2];
			String city = fields[i + 3];
			String state = fields[i + 4];
			String zip = fields[i + 5];
			String phone = fields[i + 6];
			String email = fields[i + 7];

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
			i += 8;
		}

	}

	static String readFromInputStream(InputStream inputStream) throws IOException {
		StringBuilder resultStringBuilder = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
			String line;
			while ((line = br.readLine()) != null) {
				resultStringBuilder.append(line).append("\n");
			}
		}
		return resultStringBuilder.toString();
	}

	void countPerson() {
		String cityOrStateToSearch = readInput("City/State To Search");

		int count = (int) contactList.stream()
				.filter(contact -> (contact.getCity().equalsIgnoreCase(cityOrStateToSearch)
						|| contact.getState().equalsIgnoreCase(cityOrStateToSearch)))
				.count();
		System.out.println("Number of matching Contacts:" + count);
	}

	void searchPerson() {
		String cityOrStateToSearch = readInput("City/State To Search");

		contactList.stream().filter(contact -> (contact.getCity().equalsIgnoreCase(cityOrStateToSearch)
				|| contact.getState().equalsIgnoreCase(cityOrStateToSearch))).forEach(System.out::println);

	}

	void displayAddressBook() {
		for (Contact contact : contactList) {
			System.out.println(contact);
		}

	}

	void deleteContact() {
		String nameToDelete = readInput("Name To Delete");

		for (Iterator<Contact> iterator = contactList.iterator(); iterator.hasNext();) {
			Contact contact = iterator.next();
			if (contact.getFirstName().equals(nameToDelete)) {
				iterator.remove();
				System.out.println("Deletion of Contact " + nameToDelete + " Successful.");
			}
		}

	}

	void editContact() {
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

	void addContact() {
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

	static String readInput(String term) {
		System.out.print("Enter " + term + ":");
		Scanner scan = new Scanner(System.in);
		return scan.next();
	}
}
