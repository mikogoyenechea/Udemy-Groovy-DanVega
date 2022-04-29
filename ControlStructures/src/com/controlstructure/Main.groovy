package com.controlstructure

Account accountOne = new Account()

accountOne.deposit(500)
println accountOne.getBalance()
//accountOne.deposit(-100)
def deposits = [100,-200]
accountOne.deposit(deposits)
println accountOne.getBalance()