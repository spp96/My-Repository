package Question_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductClass1 {
	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        	 System.out.println("Enter Product ID");
        	 int pid = sc.nextInt();
        	 
        	 System.out.println("Enter Product Name");
        	 String pname = sc.next();
        	 
        	 System.out.println("Enter Product Quantity");
        	 int qty = sc.nextInt();
        	 
        	 System.out.println("Enter Product Price");
        	 int price  = sc.nextInt();
        	 
        	 try {
     			Class.forName("com.mysql.cj.jdbc.Driver");
     		} catch (ClassNotFoundException e1) {
     			// TODO Auto-generated catch block
     			e1.printStackTrace();
     		}
        	 
        	 String url = "jdbc:mysql://localhost:3306/web19sb101db";
        	 
        	 
        	 try(Connection conn =  DriverManager.getConnection(url,"root","Patilsp@96")){
     			
        			PreparedStatement ps = conn.prepareStatement("insert into Product values(?,?,?,?)");
        			ps.setInt(1, pid);
        			ps.setString(2,pname);
        			ps.setInt(3, qty);
        			ps.setInt(4, price);
        			
        			int x = ps.executeUpdate();
        			
	        			if(x>0) {
	        				System.out.println(" record inserted");
	        			}else {
	        				System.out.println("Insertion failed");
	        			}
	        			
        			}catch(SQLException e){
        				e.printStackTrace();
        			}
     		sc.close();
         }
		
		
	}