package com.closures

//pass closure through method then call closure

def sayHello = { name ->
	println "Hello, $name"
}

def greeting (name, closure) {
	closure(name)
}
greeting("Mike", sayHello)

//print items in list with each() method

def groceryList = ["Milk", "Eggs", "Bread"]
groceryList.each {
	println it
}

//print index and value in map

def days = [1: 'Sunday', 2: 'Monday', 3: 'Tuesday', 4: 'Wednesday', 5: 'Thursday', 6: 'Friday', 7: 'Saturday']

days.each { k,v ->
	println "$k = $v"
}

//demonstrate use of curry

def teamMembers = {String name, String team ->
	println "$team, $name"
}

teamMembers("Mike", "SGS")
def teamMemberName= teamMembers.rcurry("SGS")
teamMemberName("Joe")
