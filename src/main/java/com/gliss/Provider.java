package com.gliss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Provider {
	static {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://os-mysql:3306/sampledb";
		String username = "username";
		String password = "password";
		Connection con = DriverManager.getConnection(url, username, password);
		return con;
	}
}
