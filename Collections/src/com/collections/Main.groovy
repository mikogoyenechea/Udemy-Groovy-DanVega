package com.collections

// Range

enum Days {
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}

def dayRange = Days.Sunday..Days.Saturday

for (day in dayRange) {
    println day
}

println dayRange.size()
println dayRange.contains(Days.Wednesday)
println dayRange.from
println dayRange.to

// List

def days = ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"]

println days
println days.size()
days.removeLast()
println days
days << "Saturday"
println days
println days[3]

// Map

def map = [1: 'Sunday', 2: 'Monday', 3: 'Tuesday', 4: 'Wednesday', 5: 'Thursday', 6: 'Friday', 7: 'Saturday']
println map
println map.size()
println map.getClass().getName()
println map.values()
