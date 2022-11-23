package Question_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateProduct {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product quantity");
		int qty = sc.nextInt();
		
		System.out.println("Enter Product price");
		int price = sc.nextInt();
		
		System.out.println("Enter Product id to change the Price and quantity");
		int pid = sc.nextInt();
		
		
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	       	 
	       	 String url = "jdbc:mysql://localhost:3306/web19sb101db";
	       	 
		try ( Connection  connection = DriverManager.getConnection(url, "root", "Patilsp@96")){
		
			PreparedStatement ps = connection.prepareStatement("update Product set quantity = ?, price =? where pid = ?");
			ps.setInt(1, qty);
			ps.setInt(2,price);
		    ps.setInt(3, pid);
		  
		    
			int x = ps.executeUpdate();
		    if(x>0)
		    	System.out.println(x + "record Updated..");
		    else
		    	System.out.println("Insertion Failed..");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		sc.close();

	}

}
