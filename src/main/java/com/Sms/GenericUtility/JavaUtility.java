package com.Sms.GenericUtility;

 import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	/**
	 * this method id used to get random number
	 * @author Veeresha K
	 */
	public int getRandom() {
		Random ran= new Random();
		int random=ran.nextInt(500);
		return random;
	}
	/**
	 * This method is used to get system date
	 * @author Veeresha K
	 */
	public String getSystemdate()
	{
		Date d = new  Date( );
		String date=d.toString();
		
		return date;
		
	}
	/**
	 * This method is used to get system date in format
	 * @author Veeresha K
	 */
	public String getSystemDateFormat()
	{
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/mm/yyyy hh-MM-ss");
		Date date = new Date();
		String  systemDateFormat = dateformat.format(date);
		return systemDateFormat;
	}

}



















