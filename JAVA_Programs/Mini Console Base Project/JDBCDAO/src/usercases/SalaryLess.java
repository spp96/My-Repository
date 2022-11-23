package usercases;

import java.util.List;
import java.util.Scanner;

import dao.EmployeeDao;
import dao.EmployeeImpl;
import model.Employee;

public class SalaryLess {
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		
		EmployeeDao dao= new EmployeeImpl();
		
		List<Employee> employee= dao.getSalaryLessThanint();
		
		employee.forEach(s -> System.out.println(s));
		
	}

}
