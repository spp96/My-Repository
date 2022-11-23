package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.RowId;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Employee;
import utility.DButil;

public class EmployeeImpl implements EmployeeDao {

	public String insertEmployee(Employee emp) {

		String message= "Not Inserted...";
		
		try (Connection conn= DButil.provideConnection()){ 
			
			PreparedStatement ps= conn.prepareStatement("insert into Employee values(?,?,?,?)");
			
			ps.setInt(1, emp.getEid());
			ps.setString(2, emp.getName());
			ps.setString(3, emp.getAddress());
			ps.setInt(4, emp.getSalary());
			
			int x= ps.executeUpdate();
			
			if(x>0)
				message= "Record Inserted Succefully....";

		} catch (SQLException e) {
			// TODO: handle exception
			message=e.getMessage();
		}

		return message;

	}

	public int getSalaryByID(int eid) {
		
		int salary=-1;
		
		try (Connection conn= DButil.provideConnection()){ 
			
			PreparedStatement ps= conn.prepareStatement("select salary from employee where eid=?");
			
			ps.setInt(1,eid);
			
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next())
				
				salary=rs.getInt("salary");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		return salary;

	}

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee> employee= new ArrayList<>();
		
		try(Connection conn= DButil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("select * from employee");
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				
				int r= rs.getInt("eid");
				String n=rs.getString("name");
				String a=rs.getString("address");
				int s= rs.getInt("salary");
				
				Employee emp= new Employee(r, n, a, s);
				employee.add(emp);

			}
			
			  
		} catch (SQLException e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
		
		
		
		
		return employee;
	}

	@Override
	public Employee getEmployeeByID(int eid) {
		// TODO Auto-generated method stub
Employee emp =null;
		
		try(Connection conn= DButil.provideConnection()){
			
		PreparedStatement ps=conn.prepareStatement("select * from employee where eid=?");
			
		ps.setInt(1, eid);
		ResultSet rs= ps.executeQuery();
		
		if(rs.next()) {
			   
			int e=rs.getInt("eid");
			
			String n=rs.getString("name"); 
			String a=rs.getString("address");
			int s=rs.getInt("salary");
			
			emp= new Employee(e, n, a, s);
			
		}
		
		} catch (SQLException e) {
			// TODO: handle exception
		}
			
		return emp;
	}

	@Override
	public List<Employee> getSalaryLessThanint() {
		// TODO Auto-generated method stub
List<Employee> employee= new ArrayList<>();
		
		try(Connection conn= DButil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("select * from employee where salary<80000");
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				
				int r= rs.getInt("eid");
				String n=rs.getString("name");
				String a=rs.getString("address");
				int s= rs.getInt("salary");
				
				Employee emp= new Employee(r, n, a, s);
				employee.add(emp);

			}
			
			  
		} catch (SQLException e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
			
		return employee;
	}

}