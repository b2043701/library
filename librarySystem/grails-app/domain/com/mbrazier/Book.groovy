package com.mbrazier

class Book {
	int student
	String title
	String subject
	String author
	String isbn
	Date dateBorrowed
	Date returnDate
	Boolean overdue

    static constraints = {
	isbn blank:false, nullable:false, unique:true
	title blank:false, nullable:false
	subject blank:false, nullable:false
	author blank:false, nullable:false
	dateBorrowed blank:false, nullable:false
	returnDate blank:false, nullable:false
	student blank:false, nullable:false
	overdue blank:false, nullable:false
    }
}
