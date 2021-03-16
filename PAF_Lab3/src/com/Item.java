package com;

import java.sql.DriverManager;

import com.sun.corba.se.pept.transport.Connection;

public class Item {

	public Connection connect()
	{  Connection con = null;
	try          
	{          
		Class.forName("com.mysql.jdbc.Driver");
		con= (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root", "");   
		System.out.print("Successfully connected"); 
	}
	 catch(Exception e)          
	
	{         
		 e.printStackTrace();                 
	}
	 return con; 
}}
