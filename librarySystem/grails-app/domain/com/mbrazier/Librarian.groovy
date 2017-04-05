package com.mbrazier

class Librarian {
	String username
	String name
	String email
	String office
	String password
	String telephone
	String library

    static constraints = {
	username blank:false, nullable:false, unique:true
	name blank:false, nullable:false
	email blank:false, nullable:false, email:true
	office blank:false, nullable:false
	password blank:false, nullable:false
	telephone blank:false, nullable:false
	library blank:false, nullable:false
    }

}
