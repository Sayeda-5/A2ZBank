package com.masai.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBUtils {
	static final String url;
	static final String username;
	static final String password;
	
	static {
		//read credentials
		ResourceBundle b= ResourceBundle.getBundle("dbdetails");
		url= b.getString("url");
		username = b.getString("username");
		password = b.getString("password");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException ex) {
			System.err.println("Fatal err, bye");
			System.exit(1);
		}
		
	}
	static Connection connectionToDatabase() throws SQLException{
		return DriverManager.getConnection(url, username, password);
	}
	static void closeConnection(Connection conn) throws SQLException{
		if(conn!=null)
			conn.close();
	}
	public static Connection connecteToDatabase() {
		// TODO Auto-generated method stub
		return null;
	}
}