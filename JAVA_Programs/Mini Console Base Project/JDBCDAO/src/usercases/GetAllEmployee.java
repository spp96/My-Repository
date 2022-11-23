package usercases;

import java.util.List;

import dao.EmployeeDao;
import dao.EmployeeImpl;
import exceptions.EmployeeException;
import model.Employee;

public class GetAllEmployee {
public static void main(String[] args) {
		
		
		EmployeeDao dao = new EmployeeImpl();
		
		
		List<Employee> employee = dao.getAllEmployee();
		employee.forEach(s -> System.out.println(s));
		
		
	}
}
