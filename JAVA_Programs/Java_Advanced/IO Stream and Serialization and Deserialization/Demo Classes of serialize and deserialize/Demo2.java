package Question_4;

import java.io.*;
import java.util.*;

public class Demo2 {
//	Deserialization
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E://studentdata.txt"));
		
		List<Student> list = (List<Student>) ois.readObject();
		list.add(new Student(4, "Raju", 340, new Address("MH","Latur",452010)));
		
		list.forEach((s)-> System.out.println("Student Name:- "+ s.getName()+","+"Student Roll:- "+s.getRoll()+","+"Student Marks:- "+s.getMarks()+","+"Student Address:- "+s.getAddress()));
		
	}

}
