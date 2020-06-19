package SelFrDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbcdemo {
	public static void main(String args[]){  
		try{  
			// load the driver.
		Class.forName("com.mysql.jdbc.Driver");  
		  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/demo_mbanking","root","root");  
		  
		//here demo_mbanking is database name, root is username and password  
		  
		Statement stmt=con.createStatement();  
		  
		ResultSet rs=stmt.executeQuery("select * from wallets");  
		  
		while(rs.next())  
		System.out.println(rs.getString(2));  
		  
		con.close();  
		  
		}catch(Exception e){ System.out.println(e);}  
		  
		}  
}
