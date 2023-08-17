package com.Sms.GenericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DatabaseUtility {
	Connection con= null;
	/**
	 * this method is create register the database
	 *@author Veeresha K 
	 * @throws SQLException 
	 */
	public void connectionToDB() throws SQLException {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		con=DriverManager.getConnection(IPathConstants.dbURL, IPathConstants.dbUsername, IPathConstants.dbPassword);
		
	}
	/**
	 * This method is used to excutequery
	 * @author Veeresha K
	 * @throws SQLException 
	 */
public String executeQueryAndGetData(String query,String columNo,String ExpData) throws SQLException
{
	
	ResultSet result= con.createStatement().executeQuery(query);
	boolean flag=false;
	while(result.next())
	{
	
	String data = result.getString(columNo);
	
	if(data.equalsIgnoreCase(ExpData))
	{
		flag=true;
		break;
		
	}
	
	} if(flag)
		
	{
		System.out.println("------data is varified");
		return ExpData;
	}
	else 
	{
		System.out.println("------data is not  varified");
return "";
	}
}
/**
 * This method id used  to close datebase connection 
 * @throws SQLException 
 */
public void closeDB() throws SQLException
{
	con.close();
}
}



















