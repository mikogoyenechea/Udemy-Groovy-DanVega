package com.builders

//cannot be resolved in Eclipse
import groovy.xml.MarkupBuilder


FileWriter writer = new FileWriter("html/groovybooks.html")
MarkupBuilder builder = new MarkupBuilder(writer)

/*
Exercise:
	1. Use MarkupBuilder to generate XML
	2. Build an HTML page that lists the data
*/

/* 1.
builder.books {
	book(isbn:"978-1935182443") {
		title "Groovy in Action 2nd Edition"
		author "Dierk Koenig"
		price 50.58
	}
	book(isbn:"978-1935182948") {
		title "Making Java Groovy"
		author "Ken Kousen"
		price 33.96
	}
	book(isbn:"978-1937785307") {
		title "Programming Groovy 2: Dynamic Productivity for the Java Developer"
		author "Venkat Subramaniam"
		price 28.92
	}
}
*/

List books = [
		[isbn: "978-1935182443", title: "Groovy in Action 2nd Edition", author: "Dierk Koenig", price: 50.58],
		[isbn: "978-1935182948", title: "Making Java Groovy", author: "Ken Kousen", price: 33.96],
		[isbn: "978-1937785307", title: "Programming Groovy 2: Dynamic Productivity for the Java Developer", author: "Venkat Subramaniam", price: 28.92]
]

builder.html {
	head {
		title "Groovy Learning Materials"
	}
	body {
		section {
			h1 "Books"
			table {
				tr {
					th "ISBN"
					th "Title"
					th "Author"
					th "Price"
				}
			}
			books.each { course ->
				tr{
					td books.isbn
					td books.title
					td books.author
					td books.price
				}
			}
		}
	}
}