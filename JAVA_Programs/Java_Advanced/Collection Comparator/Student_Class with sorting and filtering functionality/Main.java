package Question_3;

import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		TreeSet<Student> studentsDetails = new TreeSet<>(new SortMarks());
		studentsDetails.add(new Student(10,"Nikku","Maharashtra",540));
		studentsDetails.add(new Student(12,"Satya","Bengal",640));
		studentsDetails.add(new Student(10,"Nikku","Maharashtra",540));
		studentsDetails.add(new Student(10,"Pankya","Delhi",440));
		studentsDetails.add(new Student(10,"Tatti","Andman",540));
		for (Student student : studentsDetails) {
			System.out.println(student);
		}
	}

}
