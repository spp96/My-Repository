package Question_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteProduct {
	public static void main(String[] args) {
		
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	       	 
	       	 String url = "jdbc:mysql://localhost:3306/web19sb101db";
	       	 
		try ( Connection  connection = DriverManager.getConnection(url, "root", "Patilsp@96")){
		
			PreparedStatement ps = connection.prepareStatement("delete from Product where quantity < 2");
		  
		    
			int x = ps.executeUpdate();
		    if(x>0)
		    	System.out.println(x + " record deleted..");
		    else
		    	System.out.println("Nothing Deleted..");
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
