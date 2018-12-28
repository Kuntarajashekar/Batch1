package venkatesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new FirefoxDriver();
		wd.get("https://seleniumsreekanth.blogspot.in/2015/08/listbox-example.html");
		WebElement ob=wd.findElement(By.id("selenium_CMD"));
		 Select os=new Select(ob);
	       os.selectByIndex(0);
	        Thread.sleep(3000);
	        os.selectByIndex(2);
	        Thread.sleep(3000);
	        os.selectByIndex(3);
	        Thread.sleep(3000);
	        os.selectByIndex(1);
	        Thread.sleep(3000);
	        os.deselectByIndex(2);
	        
	      System.out.println(os.getAllSelectedOptions()); 
	        
	  	
	}
}
