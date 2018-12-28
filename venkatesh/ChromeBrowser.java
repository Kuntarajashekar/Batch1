package venkatesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ChromeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
				driver.get("http://www.gmail.com");
				
		
		

	}

}
