package venkatesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

	public static void main(String[] args)  {
	System.setProperty("webdriver.ie.driver","D:\\Downloads\\IEDriverServer_x64_3.4.0_2\\IEDriverServer.exe");
	WebDriver driver=new InternetExplorerDriver();
	driver.get("http://gmail.com");
	
	driver.close();     		
	}
}
