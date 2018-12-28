package venkatesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavCmds {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new FirefoxDriver();
		wd.get("https://in.linkedin.com/");
		wd.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(3000);
		
		wd.navigate().back();
		Thread.sleep(3000);
		wd.navigate().forward();
		Thread.sleep(3000);
		wd.navigate().refresh();
		
	
	}

}
