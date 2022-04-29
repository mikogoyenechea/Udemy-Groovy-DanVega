package com.asttransformations

import groovy.transform.IndexedProperty
import groovy.transform.ToString

@ToString
class IndexedProp {
    @IndexedProperty List somelist = []
}