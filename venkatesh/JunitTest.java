package venkatesh;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest {
	
	
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
	
	@Test()
	public void addVendor()
	{
		System.out.println("addvendor is successful");
	}
		
		
		@Test
		public void addProduct()
		{
			System.out.println("addproduct is successful");
		}
		
		
		@Test
		public void addCurrency()
		{
			System.out.println("addcurrency is successful");
		}
		
		


	
	

}
