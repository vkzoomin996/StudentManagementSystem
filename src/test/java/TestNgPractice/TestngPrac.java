package TestNgPractice;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestngPrac
{
	@Test()
	public  void CreateTest()
	{
		System.out.println("--------create1Test------");
	}
	@Test(priority=1, invocationCount=2,dependsOnMethods="createTest")
	public  void editTest()
	{
		System.out.println("--------editTest------");
	}
	@Test(priority=2)
	public  void renameTest()
	{
		System.out.println("--------renameTest------");
	}
	@Test(priority=3)
	public  void deleteTest()
	{
		System.out.println("--------deleteTest------");
	}
	@Ignore
	public  void panTest()
	{
		System.out.println("--------panTest------");
	}
	@Test()
	public  void createTest()
	{
		System.out.println("--------create2Test------");
	}
}
