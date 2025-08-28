package pack1;

public abstract class Person {

	String name,surname,department;
	int age, section, quiz, midterm, Final;
	
	public Person(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	public abstract void display();
	
	
}
