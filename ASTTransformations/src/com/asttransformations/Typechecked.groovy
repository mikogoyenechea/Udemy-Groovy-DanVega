package com.asttransformations

import groovy.transform.TypeChecked

//@CompileStatic typechecks all methods in class. Can skip a method with @CompileStatic(TypeCheckingMode.SKIP)
@TypeChecked
class Typechecked {

    String thisProperty

    String getThisProperty() {
        //compiling this will result in exception $thisProperty
    }
}