package Question_4;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Student>students=new LinkedHashSet<>();
        students.add(new Student(04,"Akshay",760));
        students.add(new Student(42,"Paresh",680));
        students.add(new Student(44,"Rahul",440));
        students.add(new Student(34,"Mahesh",380));
        students.add(new Student(38,"Roshan",420));
        students.add(new Student(38,"Roshan",420));
        System.out.println(students.size());
        
        Set<Student>newSetofStudents=students
        		                            .stream().filter(s->s.getMarks()<500)
        		                            .collect(Collectors.toSet());
        newSetofStudents.forEach(s-> System.out.println(s));
	}
}
