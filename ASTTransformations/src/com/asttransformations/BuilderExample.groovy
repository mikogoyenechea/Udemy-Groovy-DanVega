package com.asttransformations

import groovy.transform.ToString
import groovy.transform.builder.Builder

@Builder
@ToString(includeNames = true)
class BuilderExample {
    String propertyOne
    String propertyTwo
    String propertyThree
}
