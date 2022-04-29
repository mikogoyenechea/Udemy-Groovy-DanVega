package com.asttransformations

import groovy.transform.Canonical
import groovy.transform.Sortable

@Canonical
@Sortable(includes = ["type", "category"]) //to organize which order to sort
class SortableObject {
    String category
    String type
}