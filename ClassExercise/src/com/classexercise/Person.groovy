package com.classexercise

@groovy.transform.ToString

class Person {
    String firstName
    String lastName
    Integer currentAge

    public Person(String first, String last, Integer years) {
        firstName = first
        lastName = last
        currentAge = years
    }

    void addToAge() {
        currentAge += 1
    }
}
