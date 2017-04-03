package com.mbrazier

class BookReview {
	String book
	Date dateCreated
	int student
	String review

    static constraints = {
	book blank:false, nullable:false
	dateCreated blank:false, nullable:false
	student blank:false, nullable:false
	review blank:false, nullable:false
    }
}
