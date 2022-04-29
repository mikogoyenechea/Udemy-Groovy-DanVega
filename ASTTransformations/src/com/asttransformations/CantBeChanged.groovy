package com.asttransformations

import groovy.transform.Immutable
import groovy.transform.ToString

@ToString
@Immutable
class CantBeChanged {
    String property
}
