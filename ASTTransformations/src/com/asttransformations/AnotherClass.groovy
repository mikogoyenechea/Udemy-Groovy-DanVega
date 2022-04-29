package com.asttransformations

import groovy.transform.Canonical //combines ToString, EqualsHashCode, and Tuple

@Canonical
class AnotherClass {
    def otherPropertyOne
    def otherPropertyTwo
}