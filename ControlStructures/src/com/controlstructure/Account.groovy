package com.controlstructure

class Account {
	
	BigDecimal balance = 0
	
		BigDecimal deposit (amount) {
			if( amount < 0 ) {
				throw new Exception("Deposit amount must be greater than 0")
			}
			balance += amount
		}
	
		def deposit (List amounts) {
			for(amount in amounts)  {
				if( amount < 0 ) {
					throw new Exception("There is an invalid value")
				}
				deposit(amount)
			}
		}
}
