package com.bridgelabz.bankaccount;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AccountTest {

	@Test
	void test1() {
		Account account1 = new Account(1000.0);
		account1.debit(400);
		assertEquals(account1.getBalance(), 600.0);
	}

	@Test
	void test2() {
		Account account2 = new Account(2000.0);
		account2.debit(3000);
		assertEquals(account2.getBalance(), account2.getBalance());
	}

	@Test
	void test3() {
		Account account3 = new Account(3000.0);
		account3.debit(500);
		assertEquals(account3.getBalance(), 2500.0);
	}
}
