package pack1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class University {
	
	ArrayList<Student> students = new ArrayList<>();
	
	Student stu = new Student(0,null,null,0);
	
	public void newStudent() {
		int  studentId = Integer.parseInt(JOptionPane.showInputDialog("Student ID: "));
		String name = JOptionPane.showInputDialog("Name: ");
		String surname = JOptionPane.showInputDialog("Surname: ");
		int age = Integer.parseInt(JOptionPane.showInputDialog("Age: "));
		
		
	
		Student stu = new Student (studentId, name, surname, age);
		this.students.add(stu);
		stu.department = JOptionPane.showInputDialog("Department: ");
		stu.section = Integer.parseInt(JOptionPane.showInputDialog("Section: "));
		JOptionPane.showMessageDialog(null, "Student saved.");   
		
	
	}
	
	public void setAllGrades(int id, int quiz,int midterm, int Final ) {
		
		students.stream()
		                .filter( s -> s.studentId == id)
                        .findFirst()		
		                .get().setGrades(quiz, midterm, Final);
		JOptionPane.showMessageDialog(null, "Grades saved.");
		
	}
	
	public void getStudents() {
		
		for (Student s : students) {
			s.display();
		}
		
		
	}
	
	public void getStudents(int id) {
		
		students.stream()
		                .filter(s -> s.studentId == id)
		                .findFirst()
		                .get().display();		
	}
	
	public void deleteStudent(int id) {
		
		students.removeIf(s -> s.studentId == id);
		
	}
	
	
	
	

	public static void main(String[] args) {
	
		University univ = new University();
		univ.newStudent();
		univ.newStudent();
		
		univ.setAllGrades(1, 70, 60, 70);
		univ.setAllGrades(2, 80, 80, 70);
		
		univ.getStudents();
		System.out.println("*************");
		
		univ.getStudents(2);
		System.out.println("*************");
		
		univ.deleteStudent(2);
		System.out.println("*************");
		
		univ.getStudents();
		
		
		
		
		
		
		
		
	}

}
