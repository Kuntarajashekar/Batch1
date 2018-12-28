package venkatesh;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Seleniumgrid 

{        
	
	@Test
	public void test() throws MalformedURLException
	{
		DesiredCapabilities cap=DesiredCapabilities.firefox();
		cap.setPlatform(Platform.WINDOWS);
		 
		URL url=new URL(" http://192.168.1.103:4444/wd/hub");
		
		WebDriver driver=new RemoteWebDriver(url, cap);
		driver.get("http://orangehrm.uftselenium.com");
		System.out.println("title is"+driver.getTitle());
		driver.quit();
		
	}
		
}
