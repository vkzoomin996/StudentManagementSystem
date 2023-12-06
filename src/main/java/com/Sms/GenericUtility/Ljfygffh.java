package com.Sms.GenericUtility;

import java.util.Arrays;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
 public class Ljfygffh {
	@Test
	public void ffg() {
		String s="98kur7ber564";//output=564,7,98
		String sss = s.replaceAll("[^0-9]+", ",");
		System.out.println(sss);
 		String[] ss = s.split("[a-z]+");
 		System.out.println(Arrays.toString(ss));
  			for (int j = ss.length-1; j>= 0; j--) {
				System.out.print(ss[j]+",");
			}
		}
			
	
	}


