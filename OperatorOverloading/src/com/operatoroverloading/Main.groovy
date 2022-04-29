package com.operatoroverloading

Account checking = new Account(type:"Checking")
println checking.type
checking.deposit(100)
println checking.balance
checking.withdraw(50)
println checking.balance
Account savings = new Account(type: "Savings")
println savings.type
savings.deposit(100)
println savings.balance
savings.withdraw(50)
println savings.balance
println checking.addAccounts(savings)