package Questino_5.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Employee {
	@Id
	private int empid;
	private String name;
	private String gender;
	private String address;
	private int salary;
	
	public Employee() {
		
	}

	public Employee(String name, String gender, String address, int salary) {
		super();
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", gender=" + gender + ", address=" + address
				+ ", salary=" + salary + "]";
	}

	

}
