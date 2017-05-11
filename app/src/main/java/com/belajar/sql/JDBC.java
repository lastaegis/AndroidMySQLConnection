package com.belajar.sql;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {
	final static String URL = "jdbc:mysql://10.0.2.2:3306/kosmikid_landing";
	final static String USER = "root"; //username
	final static String PASS = "100994"; //password
	
	public static Connection connect(){
		Connection con=null;
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection(URL, USER, PASS);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		return con;
	}

}
