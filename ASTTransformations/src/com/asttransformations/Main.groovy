package com.asttransformations

//ToString and Tuple Example
MyClass firstObject = new MyClass(1, "property")
MyClass secondObject = new MyClass(1, "property")
println firstObject
assert firstObject == secondObject //EqualsAndHashCode Example

//Canonical Example
AnotherClass otherObjectOne = new AnotherClass(1, "property")
AnotherClass otherObjectTwo = new AnotherClass(1, "property")

println otherObjectOne
println otherObjectTwo
assert otherObjectOne == otherObjectTwo

//Singleton Example
// running this code will result in an exception: AnotherClass cannotBe = new AnotherClass()

//Sortable Example

SortableObject objectOne = new SortableObject("A", "1")
SortableObject objectTwo = new SortableObject("A", "2")
SortableObject objectThree = new SortableObject("B", "1")

def sortableObjects = [objectOne, objectTwo, objectThree]
println sortableObjects.toSorted() //switch properties for different result

//Immutable Example

CantBeChanged immutable = new CantBeChanged(property: "example")
println immutable
// running this code will result in an exception: immutable.property = "not possible"


//Builder Example
BuilderExample exampleBuilder = BuilderExample
	.builder()
	.propertyOne("first")
	.propertyTwo("second")
	.propertyThree("Three")
	.build()
println exampleBuilder

//Exercise: Find and use another AST transformation (IndexedProperty)
IndexedProp someobject = new IndexedProp()
someobject.setSomelist(0, "itemone")
someobject.setSomelist(1, "itemtwo")
println someobject
