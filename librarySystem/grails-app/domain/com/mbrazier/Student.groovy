package com.mbrazier

class Student {
	String name
	String email
	String username
	String password
	int studentId
	String course

    static constraints = {
	name blank:false, nullable:false
	email blank:false, nullable:false, email:true
	username blank:false, nullable:false
	password blank:false, nullable:false
	studentId blank:false, nullable:false, unique:true
	course blank:false, nullable:false
    }
}
