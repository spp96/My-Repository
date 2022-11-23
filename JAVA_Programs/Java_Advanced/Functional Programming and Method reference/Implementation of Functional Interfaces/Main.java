package Question_2;

import java.util.*;
import java.util.function.*;

public class Main {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(24,"Ramesh",480));
		students.add(new Student(20,"Suresh",380));
		students.add(new Student(26,"Ramu",680));
		students.add(new Student(32,"Shyamu",280));
		students.add(new Student(18,"Nidhi",510));
		
		System.out.println("Marks of Student Using Predicate");
		System.out.println("====================");
		students.stream().filter(a -> a.getMarks() < 500).forEach(System.out::println);
		System.out.println("***********List Ended***************");
		
		
		System.out.println("All Details of Students Using Consumer");
		System.out.println("====================");
		students.forEach(a -> System.out.println(a));
		System.out.println("***********List Ended***************");
		
		System.out.println("All Details of Students Using Supplier");
		System.out.println("====================");
		Supplier<Student> st = ()-> new Student(44,"Rakesh",500);
		System.out.println(st.get());
		System.out.println("***********List Ended***************");
		
		System.out.println("converting number from string to integar using Function");
		System.out.println("====================");
		Function<String, Integer> fun = x -> Integer.parseInt(x);
		System.out.println(fun.apply("14"));
		System.out.println("***********Ended***************");
		
	}

}
