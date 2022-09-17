package Question_3;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();

        Manager manager = new Manager();

        manager.Name="Satyajit";
        manager.Address="Addeess & Address";
        manager.Age=26;
        manager.Phone_Number="55545441";
        manager.Salary=250000;

        employee.Name="Shubham";
        employee.Address="Addeess";
        employee.Age=25;
        employee.Phone_Number="4551212";
        employee.Salary=30000;


        employee.printSalary();
        manager.printSalary();


    }


}
