package Question_4;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner employee_Collection = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.println("...Welcome to Employee Management System....");
        System.out.println("Do you want to Enter the detail of Employee: ? (Y/N)");
        String yes = employee_Collection.next();

        int count = 1;
        while (yes.equals("Y")){
            System.out.println("Enter the Employee Details: " +count);
            System.out.println("-----------------------------");
            System.out.println("Enter the Employee Id:");
            int eId = employee_Collection.nextInt();
            System.out.println("Enter the Employee Name:");
            String eName = employee_Collection.next();
            System.out.println("Enter the Employee Salary:");
            double eSalary = employee_Collection.nextDouble();
            System.out.println("Enter the Department Id:");
            int deptId = employee_Collection.nextInt();
            System.out.println("Enter the Department Name:");
            String deptName = employee_Collection.next();
            count++;
            Employee employee = new Employee(eId,eName,eSalary,new Department(deptId,deptName));
            employees.add(employee);
            System.out.println("Employee Details added successfully..");
            System.out.println("Do you want to Enter the detail of Employee: ? (Y/N)");
            yes = employee_Collection.next();

        }
        if(yes.equals("N")){
            System.out.println("Thank you---");
            for (Employee employeeDetails: employees){
                System.out.println(employeeDetails);
            }

        }
    }
}
