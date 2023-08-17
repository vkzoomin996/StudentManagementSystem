package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SelectQueryTest {
	public static void main(String[] args) throws SQLException  {
		 
	
		//register the database
		Driver driver= new Driver();
		DriverManager.registerDriver(driver);
		
		
		//get connection for the database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdett01","root","root");

		
		// Create statement
		Statement state = con.createStatement();
		String query = "select * from veeresh;";
		
		//excute query
		ResultSet result = state.executeQuery(query);
		 while(result.next())
		 {
			 System.out.println(result.getString(1)+"   "+result.getString(2)+"    "+result.getString(3));
		 }
		 
			//close database connection
			con.close();
		
		
		
	} 

}
