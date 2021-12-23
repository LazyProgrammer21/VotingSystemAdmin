package com.votingsystem.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class db {

	
	//create a connection for mysql data base using jdbc driver
		public static Connection getConnection() {
			
			try {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					System.out.println("Driver not Found");
					
				}
				return DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem","root","Sub@sh9841");
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, e);
				e.printStackTrace();
			}
			return null;
		
		}

	
}
