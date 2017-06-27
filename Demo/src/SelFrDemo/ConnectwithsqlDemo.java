package SelFrDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectwithsqlDemo {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			// this is for registering our drivers in the system

			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/demo_mbanking",
							"root", "root");
			// this is for establishing the connection to the database

			Statement state = con.createStatement();
			// we can create statement,update Statement

			ResultSet r = state.executeQuery("SELECT * FROM wallets");
			// execute query is used when we are using static sql command
			// The SQL statements that read data from a database query, return
			// the data in a result set.

			// prepared statement is used
			while (r.next()) {
				String str = r.getString(1);
				System.out.println(str);
			}
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
