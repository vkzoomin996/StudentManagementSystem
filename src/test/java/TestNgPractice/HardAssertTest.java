package TestNgPractice;

import  static org.testng.Assert.*;
import org.testng.annotations.Test;

public class HardAssertTest {
	@Test
	public void hardAssertTest() {
		System.out.println("-----step-1----------");
		System.out.println("-----step-2----------");
		System.out.println("-----step-3----------");
		 assertEquals("A", "B", "value is mismatched");
   		System.out.println("-----step-5----------");
		System.out.println("-----step-4----------");



	}

  		
	}


