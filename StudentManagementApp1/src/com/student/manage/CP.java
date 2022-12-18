package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CP {
	
	 static Connection con;
	   
		public static Connection createC() throws SQLException
		{
			
			try {
				//load the drive
				Class.forName("com.mysql.jdbc.Driver");
				
				//create the coonection
				String user  = "root";
				String password = "root";
				String url = "jdbc:mysql://localhost:3306/student_manage?characterEncoding=utf8";
				
				con = (Connection) DriverManager.getConnection(url, user, password);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return con;
			
		}

}
