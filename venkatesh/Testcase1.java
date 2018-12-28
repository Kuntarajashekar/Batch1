package venkatesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testcase1 {

	@Test
	
		public void login()
		{
		
		
		WebDriver wd=new FirefoxDriver();
		wd.get("http://orangehrm.uftselenium.com");
		
	
		
		String title=wd.getTitle();
		
		if(title.equals("OrangeHRM"))
		{
			
			System.out.println("OrangeHRM is displayed");
		}
		else
		{
			
			{
				
			}
			System.out.println("OrangeHRM is not displayed");
			
		}
		
		
		WebElement ob1=wd.findElement(By.xpath(".//*[@id='txtUsername']"));
		
		WebElement ob2=wd.findElement(By.xpath(".//*[@id='txtPassword']"));
		
		WebElement ob3=wd.findElement(By.xpath(".//*[@id='btnLogin']"));
		
		if(ob1.isDisplayed() & ob2.isDisplayed() & ob3.isDisplayed())
		{
			System.out.println("username,passwrd,login is displayed");
			
		}
		else
		{
			System.out.println("username,passwrd,login is not displayed");
			
		}
		String un="sreekanth";
		String pwd="sreekanth@2015";
		
		ob1.clear();
		ob1.sendKeys(un);
		
		ob2.clear();
		ob2.sendKeys(pwd);
		
		ob3.click();
		
		title=wd.getTitle();
		
		if(title.equals("OrangeHRM"))
		{
			
			System.out.println("OrangeHRM adminpage is displayed");
		}
		
		String weltext=wd.findElement(By.xpath(".//*[@id='welcome']")).getText();
		
		if(weltext.equals("Welcome Sreekanth"))
		{
			System.out.println("Welcome Sreekanth is displayed");
			
			
		}
		wd.findElement(By.xpath(".//*[@id='welcome']")).click();
		wd.findElement(By.linkText("Logout")).click();
		
		
		if(title.equals("OrangeHRM"))
		{
			System.out.println("logout is completed");
			System.out.println("OrangeHRM page is displayed");
		}
		
		wd.close();
		System.out.println("browseris closed");
		
		wd.quit();
		System.out.println("object is closed");
		}
}
