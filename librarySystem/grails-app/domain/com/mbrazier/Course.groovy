package com.mbrazier

class Course {
	String title
	int code
	String leader
	String department
	String description
	String studyModule
	

    static constraints = {
	title blank:false, nullable:false
	code blank:false, nullable:false, unique:true
	leader blank:false, nullable:false
	department blank:false, nullable:false
	description blank:false, nullable:false
	studyModule blank:false, nullable:false
    }
}
