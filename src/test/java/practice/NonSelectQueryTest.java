package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class NonSelectQueryTest {
	public static void main(String[] args) throws SQLException {
		
		 
		//register the database
		Driver driver= new Driver();
		DriverManager.registerDriver(driver);
		
		//get connection for database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdett01","root","root");
		
		//create statement 
		Statement state = con.createStatement();
		
		String query = "insert into veeresh values(59005,'Avik','PO',20001);";
		
		//Update query
		int result = state.executeUpdate(query);
		
		 
		
		if(result>0)
		{
			System.out.println("Data Updated succesfully");
		}else {
			System.out.println("data not inserted");
		}
		
		con.close();
	}
	
}
