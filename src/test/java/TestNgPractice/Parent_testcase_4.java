package TestNgPractice;

import org.testng.annotations.Test;

import com.Sms.GenericUtility.BaseClass;

public class Parent_testcase_4 extends BaseClass{
 	@Test(groups = "regression")
	public void mmmmmreate() {
		System.out.println("-----create77777 org-----");
	}
	@Test(groups = {"regression", "smoke"})
	public void edit() {
		System.out.println("-----edit88888 org-----");
	}
}
