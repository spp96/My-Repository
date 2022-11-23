package Question_1;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		 File f=new File("E://abc.txt");
	        f.createNewFile();
	        //System.out.println(f.exists());
	        
	        Scanner sc=new Scanner(System.in);
	        
	        FileWriter fw=new FileWriter(f);
	        
	        System.out.println("Enter EmployeeName");
	        fw.write("Name of Employee:-"+sc.next());
	        fw.write("\n");
	    
	        System.out.println("Enter EmployeeAddress");
	        fw.write("Address of Employee:-"+sc.next());
	    
	        System.out.println("Done");
	        sc.close();
	        
	        fw.flush();
	        fw.close();
	        
	}
}
