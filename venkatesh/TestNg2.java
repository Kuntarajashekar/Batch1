package venkatesh;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNg2 {

	

	@BeforeClass
	
	public static void login()
	{
		System.out.println("login is successful");
	}

	@AfterClass 
	public static void logOut()
	{
		System.out.println("logOut is successful");
	}
	
	@Test(priority=1)
	public void addVendor()
	{
		System.out.println("addvendor is successful");
	}
		
		
		@Test(priority=3)
		public void addProduct()
		{
			System.out.println("addproduct is successful");
		}
		
		
		@Test(priority=2)
		public void addCurrency()
		{
			System.out.println("addcurrency is successful");
		}
		
}
