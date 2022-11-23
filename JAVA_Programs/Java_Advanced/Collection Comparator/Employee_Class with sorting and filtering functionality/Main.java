package Question_2;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner edetails = new Scanner(System.in);
		System.out.println("===========Enter Number for Details You Want===========");
		int n = edetails.nextInt();
		if (n==1) {
			TreeSet<Employee> ts= new TreeSet<>(new SortEmpId());
			
			ts.add(new Employee(10,"Sai","Maharashtra",22000));
			ts.add(new Employee(12,"Ram","Banglore",8000));
			ts.add(new Employee(7,"Shyam","Banglore",32000));
			ts.add(new Employee(5,"Gana","Tamil Nadu",29000));
			ts.add(new Employee(13,"Ramesh","Madhya Pradesh",18000));
			ts.add(new Employee(14,"Suresh","Madhya Pradesh",32000));
		
			System.out.println(ts);
			}
			else if (n==2) {
				TreeSet<Employee> ts= new TreeSet<>(new SortAdd());
				
				ts.add(new Employee(10,"Sai","Maharashtra",22000));
				ts.add(new Employee(12,"Ram","Banglore",8000));
				ts.add(new Employee(7,"Shyam","Banglore",32000));
				ts.add(new Employee(5,"Gana","Tamil Nadu",29000));
				ts.add(new Employee(13,"Ramesh","Madhya Pradesh",18000));
				ts.add(new Employee(14,"Suresh","Madhya Pradesh",32000));
			
				System.out.println(ts);
			}
			else if (n==3) {
				TreeSet<Employee> ts= new TreeSet<>(new SalaryComp());
				
				ts.add(new Employee(10,"Sai","Maharashtra",22000));
				ts.add(new Employee(12,"Ram","Banglore",8000));
				ts.add(new Employee(7,"Shyam","Banglore",32000));
				ts.add(new Employee(5,"Gana","Tamil Nadu",29000));
				ts.add(new Employee(13,"Ramesh","Madhya Pradesh",18000));
				ts.add(new Employee(14,"Suresh","Madhya Pradesh",32000));
			
				System.out.println(ts);
			}
			else {
				System.out.println("No Details Found");
			}
		 edetails.close();
	}

}
