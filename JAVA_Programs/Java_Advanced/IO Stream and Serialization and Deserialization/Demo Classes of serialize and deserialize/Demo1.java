package Question_4;

import java.io.*;
import java.util.*;

public class Demo1 {
	
//	Serialization
	public static void main(String[] args) throws FileNotFoundException, IOException {
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(24, "Ramu", 580, new Address("Maharashtra", "Pune", 44100)));
		list.add(new Student(26, "Ganu", 680, new Address("West Bengal", "Kolkata", 40100)));
		list.add(new Student(42, "Dhanu", 460, new Address("Karnatak", "Bengaluru", 42100)));
		list.add(new Student(32, "Shyamu", 640, new Address("TL", "Chennai", 35100)));
		list.add(new Student(40, "Ramesh", 540, new Address("Goa", "Panaji", 41100)));
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E://studentdata.txt"));
		
		oos.writeObject(list);
		oos.flush();
		oos.close();
		
		System.out.println("Serialization is done");
	}

}
