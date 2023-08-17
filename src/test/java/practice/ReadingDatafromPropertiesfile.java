package practice;

import java.io.FileInputStream;
 import java.io.IOException;
import java.util.Properties;

public class ReadingDatafromPropertiesfile {
	public static void main(String[] args) throws IOException  {
		
		//Step 1 : create a object for fileinputStream
		FileInputStream fis = new FileInputStream("./src/test/resources/Commondata.properties");
		
		
		// step 2: create object for propertie class
		Properties pObj= new Properties();
		
		// step 3: load the file
		pObj.load(fis);
		
		// step 4 : get the values using key
		
		String URL = pObj.getProperty("url");
		String BROWSER = pObj.getProperty("browser");
		String USERNAME = pObj.getProperty("username");
		String PASSWORD = pObj.getProperty("password");
		
		
		
		System.out.println(URL);
		System.out.println(BROWSER);
        System.out.println(USERNAME);
        System.out.println(PASSWORD);


		
	}

}
