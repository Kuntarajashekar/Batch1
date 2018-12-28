package venkatesh;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNGSampe {
	@Test
	public void verifyTitle()
	{
		WebDriver wd=new FirefoxDriver();
		
		wd.get("https://www.google.co.in");
		
		Assert.assertEquals(wd.getTitle(), "Google");
		
		wd.close();
		
	

	}

}
