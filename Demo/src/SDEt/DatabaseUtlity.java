package SDEt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseUtlity {
	private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_CONNECTION = "jdbc:oracle:thin:@localhost:1521:MKYONG";
	private static final String DB_USER = "user";
	private static final String DB_PASSWORD = "password";
	
	
	
	

	 
	 
	static Connection getDBConnection() {

		Connection dbConnection = null;

		try {

			Class.forName(DB_DRIVER);

		} catch (ClassNotFoundException e) {

			System.out.println(e.getMessage());

		}

		try {

			dbConnection = DriverManager.getConnection(
                            DB_CONNECTION, DB_USER,DB_PASSWORD);
			return dbConnection;

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

		return dbConnection;

	}
	
	
	static void insertRecordIntoTable(int amount, long timeDiff,
			String vehicleRegNo) throws SQLException {

		Connection dbConnection = null;
		PreparedStatement preparedStatement = null;

		String insertTableSQL = "INSERT INTO DBUSER"
				+ "(VEH_NUM, AMT, DURATION, ) VALUES"
				+ "(?,?,?)";

		try {
			dbConnection = getDBConnection();
			preparedStatement = dbConnection.prepareStatement(insertTableSQL);

			preparedStatement.setInt(1, amount);
			preparedStatement.setLong(2, timeDiff);
			preparedStatement.setString(3, vehicleRegNo);
		

			
			preparedStatement.executeUpdate();

			System.out.println("Record is inserted into DBUSER table!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}}

		}


	static ResultSet showDetails(
			String vehicleRegNo) throws SQLException {
		String QUERY = "SELECT ALL FROM  vehicle WHERE VEH_NUM IS"+vehicleRegNo;
		
		ResultSet rs = null;
		 try {
			 Connection dbConnection = getDBConnection();
	            Statement stmt = dbConnection.createStatement();
			 
			 
	            rs = stmt.executeQuery(QUERY);
	          
		 }catch(Exception e)
	            
		 {
		System.out.println("Error occured");
		 }
		
			return 	rs;
	}
		

		

	
}
