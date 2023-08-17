package TestNgPractice;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	SoftAssert sa=new SoftAssert();

	@Test
	public void softAssertTest() {
		System.out.println("-----step-1----------");
		System.out.println("-----step-2----------");
		System.out.println("-----step-3----------");
 sa.assertEquals("a","b");
 
 System.out.println("-----step-5----------");
		System.out.println("-----step-4----------");
sa.assertAll();
		
	}
	
	@Test
	public void  sample() {
		System.out.println("-----step-6----------");
		System.out.println("-----step-7----------");
		System.out.println("-----step-8----------");
 		System.out.println("-----step-9----------");
		System.out.println("-----step-10----------");
		System.out.println("-----step-11----------");
		sa.assertAll();

	}

}
