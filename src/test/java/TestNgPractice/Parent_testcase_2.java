package TestNgPractice;

import org.testng.annotations.Test;

import com.Sms.GenericUtility.BaseClass;

public class Parent_testcase_2 extends BaseClass{
    
	@Test(groups = "regression")
	public void create() {
		System.out.println("-----create3333 org-----");
	}
	@Test(groups = {"smoke","regression"})
	public void edit() {
		System.out.println("-----edit 44444org-----");
	}
}
