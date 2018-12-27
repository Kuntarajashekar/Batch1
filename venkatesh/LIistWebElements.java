package venkatesh;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LIistWebElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new FirefoxDriver();
		wd.get("https://seleniumsreekanth.blogspot.in/2015/08/radio-button-example.html");
		List<WebElement> ob=wd.findElements(By.name("gender"));
		    ob.get(2).click();
		    Thread.sleep(3000);
		    ob.get(1).click();
		    Thread.sleep(3000);
		    ob.get(3).click();
		    Thread.sleep(3000);
		    ob.get(4).click();
		    
		    
		    

	}
	

}
