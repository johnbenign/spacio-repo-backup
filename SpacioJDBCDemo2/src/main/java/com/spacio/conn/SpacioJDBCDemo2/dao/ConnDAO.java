package com.spacio.conn.SpacioJDBCDemo2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class ConnDAO
{
	public Connection getConn() throws Exception 
	{
		Class.forName("oracle.jdbc.OracleDriver");  
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "spaciodba", "crmpass433");
		
		return conn;
	}
	
	public boolean createUser(String username, String password)
	{
		boolean result = false;
		
		try
		{ 
			Connection connect = getConn();
			
			Statement statement = connect.createStatement();
			
//			String sql1 = "alter session set \"_ORACLE_SCRIPT\"=true;";
//			
//			statement.execute(sql1);
			
			//System.out.println(" --- executed !!! --- ");
			
			//String sql2 = "select * from USER_PRIVILEGE_MAP";
			
			String sql2 = "CREATE user benign2432 IDENTIFIED BY crmpass433;";
			
			//jdbc.execute(sql2);
			statement.execute(sql2);
			
			result = true;
			
			System.out.println(" --- user created --- ");
			
		}
		catch(Exception e)
		{
			System.out.println("the error: " + e.getMessage() + e);
			
			System.out.println(" --- user not created --- ");
		}
		
		return result;
	}
}
