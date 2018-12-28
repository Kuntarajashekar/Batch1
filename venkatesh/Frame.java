package venkatesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame {
	
	
	public static void main(String[] args)
	
	{
	          WebDriver wd=new FirefoxDriver();
			  wd.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
			  wd.switchTo().frame(2);
			  wd.findElement(By.xpath("html/body/div[3]/table/tbody[2]/tr[1]/td[1]/a")).click();
			  
	  
	          
	          
	  }
		
		
		
		
		
		
		
	}
	

