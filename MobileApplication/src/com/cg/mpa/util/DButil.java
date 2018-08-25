package com.cg.mpa.util;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DButil {
	static String driver=null;
	static String url=null;
	static String unm=null;
	static String pwd=null;
	
public static Connection getConn() throws SQLException, IOException
{
	Properties myprops=loadDbInfo();
	driver=myprops.getProperty("dbDriver");
	url=myprops.getProperty("dbUrl");
	unm=myprops.getProperty("dbUser");
	pwd=myprops.getProperty("dbPassword");
	Connection con=null;
	if(con==null) {
		con=DriverManager.getConnection(url,unm,pwd);
		return con;
	}
	else
		return con;
}
public static Properties loadDbInfo() throws IOException
{
	FileReader fr=new FileReader("D:\\Harshi's workspace\\MobileApplication\\src\\databaseInfo.properties");
	Properties dbProps=new Properties();
	dbProps.load(fr);
	return dbProps;
	
}
}
