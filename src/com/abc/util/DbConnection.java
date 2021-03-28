package com.abc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {

	public static void main(String[] args) throws SQLException {
		String host = "localhost";
		String port = "3306";
		Connection con= DriverManager.getConnection("jdbc:mysql://"+host+ ":" +port+"/qadbt","root","root");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from Employeeinfo where name = 'amar'");
		while (rs.next()) {
			System.out.println(rs.getString("id"));
			System.out.println(rs.getString("location"));
			
		}

	}
	

}
