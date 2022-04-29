package com.runtimemetaprogramming

/*
 Groovy Object - implement the following:
 - invokeMethod
 - getProperty
 - setProperty
*/

//invokeMethod
def myFirstGroovyObject = new myGroovyClass()
myFirstGroovyObject.notMyMethod()

//getProperty
println myFirstGroovyObject.propOne
println myFirstGroovyObject.propTwo
println myFirstGroovyObject.propThree

//setProperty
myFirstGroovyObject.propOne = "different property"
println myFirstGroovyObject.propOne

/*
 - Create an Expando class
 - Add properties and methods
 - Create metaclass and add properties and methods
*/

//Create an Expando class
//Add properties and methods
Expando myExpando = new Expando()
myExpando.name = "Mike's Expando"
myExpando.method = {
 println "Mike's expando got a method"
}
println myExpando.name
println myExpando.method()

//Create metaclass, add properties and methods
myMetaclass mikeMetaclass = new myMetaclass()
mikeMetaclass.metaClass.name = "Mike's metaclass"
mikeMetaclass.metaClass.method = {
 println "Mike's metaclass has a method"
}
println mikeMetaclass.name
mikeMetaclass.method()

/*
 Category class
 https://groovy-lang.org/metaprogramming.html#xform-Category
 https://docs.groovy-lang.org/latest/html/api/groovy/lang/Category.html
*/

use(IntegerCategory) {
 println 4.timesTwo()
}