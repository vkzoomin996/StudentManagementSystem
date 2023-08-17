package TestNgPractice;

import org.testng.annotations.Test;

import com.Sms.GenericUtility.BaseClass;

public class Parent_testcase_3 extends BaseClass{
    
	@Test(groups = "regression")
	public void mmmmmreate() {
		System.out.println("-----create5555 org-----");
	}
	@Test(groups = {"regression", "smoke"})
	public void edit() {
		System.out.println("-----edit66666 org-----");
	}
}
