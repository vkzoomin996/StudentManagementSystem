package TestNgPractice;

import org.testng.annotations.Test;

public class Dataprovideraccess {
	@Test(dataProviderClass=DataProviderTest.class , dataProvider="data")
	public void getData(String src ,String dest, int price )
	{
		System.out.println("From----->"+src  +      "          To------>"+dest  +       "          Travelling charge------->"+price);
	}
	
	
	@Test(dataProviderClass=DataProviderTest.class , dataProvider="data1")
	public void getData1(String src ,String dest, int price )
	{
		System.out.println("From----->"+src  +       "         To------>"+dest  +      "           Travelling charge------->"+price);
	}

}
