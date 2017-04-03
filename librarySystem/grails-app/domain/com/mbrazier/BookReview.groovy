package com.mbrazier

class BookReview {
<<<<<<< HEAD

    static constraints = {
=======
	String book
	Date dateCreated
	int student
	String review

    static constraints = {
	book blank:false, nullable:false
	dateCreated blank:false, nullable:false
	student blank:false, nullable:false
	review blank:false, nullable:false
>>>>>>> develop
    }
}
