package venkatesh;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNg1 {
	
	public static WebDriver wd;
	@Test(priority=1)
	
	public void launchBrowser()
	{
		 wd=new FirefoxDriver();
		
	}
	
	@Test(priority=3)
	
	public void verifyTitle()
	{
		wd.get("https://www.google.co.in");
		Assert.assertEquals(wd.getTitle(), "Google");
		
	}
	
	
	@Test(priority=5)
	
	public void closeBrowser()
	{
		
		wd.close();
	}
	
	
	@Test(priority=2)
	
	public void verifyGmailTitle()
	{
		wd.get("http://www.gmail.com");
		
		Assert.assertEquals("Gmail", wd.getTitle());
	}
		
		
		@Test(priority=4)
		
		public void verifyYahooTitle()
		{
			wd.get("https://in.yahoo.com/");
			Assert.assertEquals("Yahoo", wd.getTitle());
			
			
		}
}
		
		
	

