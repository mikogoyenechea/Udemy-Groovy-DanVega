package com.runtimemetaprogramming

class myGroovyClass {

    def propOne = "prop 1"
    def propTwo = "prop 2"

    def myMethod() {
        "This is your method"
    }

    def invokeMethod(String name, Object args) {
        "Called invokeMethod $name #args"
    }

    def getProperty(String name) {
        println "getProperty() called with argument $name"
        if(metaClass.hasProperty(this,name)) {
            metaClass.getProperty(this,name) //return property value
        } else {
            println "Property not defined"
        }
    }

    void setProperty(String name, Object value) {
        this.@"$name" = "Overridden"
    }

}
