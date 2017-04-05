package librarysystem
import com.mbrazier.Course
import com.mbrazier.Library
import com.mbrazier.Librarian
import com.mbrazier.Book
import com.mbrazier.Student
import com.mbrazier.BookReview

class BootStrap {


    def init = { servletContext ->
    
    def library1=new Library(
	name:'library1',
	address:'library1 address',
	openingHours:'24h',
	location:'campus',
	studySpaces:100).save()

    def library2=new Library(
	name:'library2',
	address:'library2 address',
	openingHours:'24h',
	location:'campus2',
	studySpaces:60).save()


    def librarian1=new Librarian(
	username:'librarian01',
	name:'Jill',
	email:'jill@library.com',
	office:'office1',
	password:'alpine',
	telephone:'01010101010',
	library:'library1').save()

    def librarian2=new Librarian(
	username:'librarian02',
	name:'Jane',
	email:'jane@library.com',
	office:'office1',
	password:'alpine',
	telephone:'01010101010',
	library:'library2').save()


    def book1=new Book(
	student:1,
	title:'booktitle01',
	subject:'booksubject',
	author:'author01',
	isbn:'1010101',
	dateBorrowed:new Date('10/10/2000'),
	returnDate:new Date('20/10/2000'),
	overdue:true).save()

    def book2=new Book(
	student:2,
	title:'booktitle02',
	subject:'booksubject',
	author:'author02',
	isbn:'2020202',
	dateBorrowed:new Date('10/10/2000'),
	returnDate:new Date('20/10/2000'),
	overdue:true).save()


    def student1=new Student(
	name:'Jim',
	email:'jim@school.com',
	username:'jim2005',
	password:'alpine',
	studentId:1,
	course:'Computing').save()

    def student2=new Student(
	name:'James',
	email:'james@school.com',
	username:'james2005',
	password:'alpine',
	studentId:2,
	course:'Computing').save()

    def course1=new Course(
	title:'Computing',	
	leader:'dave',
	department:'aces',
	description:'computing course',
	studyModule:'01',
	code:1).save()

    def course2=new Course(
	title:'Software Engineering',
	leader:'dave',
	department:'aces',
	description:'computing course',
	studyModule:'02',
	code:2).save()


    def review1=new BookReview(
	book:'Book1',
	dateCreated:new Date('10/10/2000'),
	review:'this is a book').save()

    def review2=new BookReview(
	book:'Book2',
	dateCreated:new Date('11/10/2000'),
	review:'this is another book').save()

    }

    def destroy = {
    }




}
