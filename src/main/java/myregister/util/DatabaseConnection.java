package myregister.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

	public static Connection createConnection() {
		Connection connection = null;
		String url = "jdbc:mysql://localhost:3306/employeedetails";
		String username = "root";
		String password = "";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Loading MySQL drivers. This differs for database servers        
			connection = DriverManager.getConnection(url, username, password); // Attempting to connect to MySQL database
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

}