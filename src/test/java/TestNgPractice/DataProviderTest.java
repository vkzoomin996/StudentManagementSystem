package TestNgPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@DataProvider
	public Object[][] data(){

		Object[][] obj =new Object[3][3];

		obj[0][0]="banglore";
		obj[0][1]="Sandur";
		obj[0][2]=400;

		obj[1][0]="banglore";
		obj[1][1]="Hospete";
		obj[1][2]=600;

		obj[2][0]="banglore";
		obj[2][1]="Bellary";
		obj[2][2]=500;
		return obj;


	}

	@DataProvider
	public Object[][] data1(){

		Object[][] obj =new Object[3][3];

		obj[0][0]="banglore";
		obj[0][1]="Sandur";
		obj[0][2]=400;

		obj[1][0]="banglore";
		obj[1][1]="Hospete";
		obj[1][2]=600;

		obj[2][0]="banglore";
		obj[2][1]="Bellary";
		obj[2][2]=500;
		return obj;
	}
}
