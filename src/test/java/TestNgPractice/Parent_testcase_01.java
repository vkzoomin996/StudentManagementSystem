package TestNgPractice;

import org.testng.annotations.Test;

import com.Sms.GenericUtility.BaseClass;

public class Parent_testcase_01 extends BaseClass
{
    
	@Test(groups = "smoke")
	public void rename() {
		System.out.println("-----rename111111 org-----");
	}
	@Test(groups = "update")
	public void update() {
		System.out.println("-----update007 org-----");
	}
	@Test(groups = "regression")
	public void delete() {
		System.out.println("-----delete 222222org-----");
	}
}
