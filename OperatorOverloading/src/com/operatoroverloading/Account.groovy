package com.operatoroverloading


class Account {
	
	String type
	BigDecimal balance = 0
	

	void deposit (amount) {
		balance += amount
	}
	
	void withdraw (amount) {
		balance -= amount
	}
	
	BigDecimal addAccounts(Account account) {
		this.balance + account.balance
	}
}