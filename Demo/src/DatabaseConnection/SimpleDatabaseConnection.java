package DatabaseConnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class SimpleDatabaseConnection {
	public static void main(String[] args) throws Exception {
		
		
		int ii=699_882;
		System.out.println(ii);

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			System.out.println("Class Not Found");
		}

		String URL = "jdbc:mysql://127.0.0.1:3306/firstdb";

		String username = "root";

		String password = "intellectual";

	
		
		Connection con = DriverManager.getConnection(URL, username, password);

		Statement stmt = con.createStatement();

	
		PreparedStatement p= con.prepareStatement("Insert into Benchmark  values(?,?,?,?)");
p.setInt(1, 11);
p.setInt(2, 10);
p.setInt(3, 10);
p.setString(4, "10 my modelllllllllllllllllllll");

int i=p.executeUpdate();  
System.out.println(i+" records inserted----------------------");  

String sql = "select * from Benchmark";

ResultSet rs = stmt.executeQuery(sql);


		while (rs.next()) {

			System.out.println(rs.getString("model"));
			// Process the records here
		}
		
		String getDBUSERByUserIdSql = "{call GetmodelBrandname11(?,?)}";

		CallableStatement cstmt=con.prepareCall(getDBUSERByUserIdSql);  
		
		
		
		cstmt.setString(1, "6610");;
		cstmt.registerOutParameter(2, java.sql.Types.VARCHAR);
		
		// execute getDBUSERByUserId store procedure
		cstmt.executeUpdate();

		String brandname = cstmt.getString(2);
		
		
		System.out.println("+++++++++++++++++   "+brandname);
		
		
		System.out.println("----------------------");  

		DatabaseMetaData dbmd=con.getMetaData();  
		String table[]={"View"};  
		ResultSet rst=dbmd.getTables(null,null,null,table);  
		  
		while(rst.next()){  
		System.out.println(rst.getString(3));  
		}  
		
		con.close();
		
	}
}
