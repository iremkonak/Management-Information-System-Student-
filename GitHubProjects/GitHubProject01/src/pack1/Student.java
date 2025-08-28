package pack1;

import pack1.IAcademicID;
import pack1.IGrades;
import pack1.Person;

public class Student extends Person implements IAcademicID, IGrades {
int studentId;
	public Student(int studentId, String name, String surname, int age) {
		
		super(name, surname, age);
		
		this.studentId = studentId;

	
	}
	@Override
	public void setGrades(int quiz, int midterm, int Final) {
	this.quiz = quiz;
	this.midterm = midterm;
	this.Final =Final;
	}
	@Override
	public double calculateAverage() {
		return (this.quiz*0.1)+(this.midterm*0.3)+(this.Final*0.6);

	}
	@Override
	public void getGrades() {
		System.out.println("Quiz: "+this.quiz);
		System.out.println("Midterm: "+this.midterm);
		System.out.println("Final: "+this.Final);
		System.out.println("Average: "+this.calculateAverage());
	}
	@Override
	public void setDepartment(String department) {
		this.department = department;
		
	}
	@Override
	public void setSection(int section) {
	    this.section = section;
		
	}
	@Override
	public void getAcademicID() {
		System.out.println("Deparment: "+this.department);
		System.out.println("Section: "+this.section);
		
	}
	@Override
	public void display() {
		System.out.println("Name & Surname: "+this.name+" "+this.surname);
		System.out.println("Age: "+this.age);
		getAcademicID();
		getGrades();
		
	}
	
	
	
}