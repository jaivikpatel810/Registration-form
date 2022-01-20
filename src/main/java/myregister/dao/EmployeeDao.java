package myregister.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import myregister.bean.Employee;
import myregister.util.DatabaseConnection;

public class EmployeeDao {

	public void registerEmployee(Employee employee) throws Exception {
		Connection connection;
		PreparedStatement preparedStatement = null;
		try {
			connection = DatabaseConnection.createConnection();
			try {
				String insertQuery = "INSERT INTO details" 
				+ " (first_name, last_name, user_name, password, address, contact) VALUES " 
				+ " (?, ?, ?, ?, ?, ?);";
				preparedStatement = connection.prepareStatement(insertQuery);
				preparedStatement.setString(1, employee.getFirstName());
				preparedStatement.setString(2, employee.getLastName());
				preparedStatement.setString(3, employee.getUserName());
				preparedStatement.setString(4, employee.getPassword());
				preparedStatement.setString(5, employee.getAddress());
				preparedStatement.setString(6, employee.getContactNo());
				preparedStatement.executeUpdate(); // Execute the query or update query
			} catch (Exception e) { // Process exception
				System.out.print(e);
			}
		} catch (Exception e) { // Process exception
			System.out.print(e);
		}
	}

}