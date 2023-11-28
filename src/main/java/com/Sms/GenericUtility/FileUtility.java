package com.Sms.GenericUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
	/**
	 * this method is used to read the data fronm properties file
	 * @author Veeresha K
	 * @param key 
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String readDataFromPropertyFile(String  key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(IPathConstants.Filepath);
		Properties pobj =new Properties();
		pobj.load(fis);
 		
		String value=pobj.getProperty(key);
 		return value;
		
	}

}
