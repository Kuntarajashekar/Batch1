package venkatesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNg5 {
	
	public static WebDriver wd;
	@BeforeClass
	
	public void launchBrowser()
	{
		 wd=new FirefoxDriver();
		
	}
	
	@Test(priority=3)
	
	public void verifyTitle()
	{
		wd.get("https://www.google.co.in");
		String s=wd.getTitle();
		if(s.equals("Google"))
		{
			System.out.println("passed");
		}
		
	}
	
	
	@AfterClass
	
	public void closeBrowser()
	{
		
		wd.close();
	}
	
	
	@Test(priority=2)
	
	public void verifyGmailTitle()
	{
		wd.get("http://www.gmail.com");
		
		String s=wd.getTitle();
		if(s.equals("Gmail"))
		{
			System.out.println("passed");
		}
	}
		
		
		@Test(priority=4)
		
		public void verifyYahooTitle()
		{
			wd.get("https://in.yahoo.com/");
			String s=wd.getTitle();
			
			if(s.equals("Yahoo"))
			{
				System.out.println("passed");
			}
			
			
		}
	
	
}
