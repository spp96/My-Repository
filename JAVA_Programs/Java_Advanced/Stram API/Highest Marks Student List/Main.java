package Question_2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> studentList= new ArrayList<>();
		
		studentList.add(new Student(12, "Ramesh", 750));
		studentList.add(new Student(22, "Suresh", 480));
		studentList.add(new Student(26, "Eshwar", 660));
		studentList.add(new Student(30, "Ganu", 820));
		studentList.add(new Student(36, "Ramu", 340));
		
		
		Optional<Student>highestMarksst= studentList
				                                   .stream().max((o1, o2) -> o1.getMarks()-o2.getMarks() );
		Student maxMarks= highestMarksst.get();
		System.out.println(maxMarks);

	}
}
