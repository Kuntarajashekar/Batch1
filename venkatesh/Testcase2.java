package venkatesh;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

  public class Testcase2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
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
				System.out.println("OrangeHRM is not displayed");
				
			}
			
			
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
		//move mouse mover action on PIM
		
		
		Thread.sleep(5000);
		WebElement objpim=wd.findElement(By.xpath(".//*[@id='menu_pim_viewPimModule']"));
		
		Actions a=new Actions(wd);
		a.moveToElement(objpim).perform();
		wd.findElement(By.linkText("Add Employee")).click();
		
		String addemptext=wd.findElement(By.xpath(".//*[@id='content']/div/div[1]/h1")).getText();
		if(addemptext.equals("Add Employee"))
		{
			
			System.out.println("ADD EMPLOYEE is displayed");
		}
		
		String fn="venkatesh";
		String ln="jujjuru";
		wd.findElement(By.xpath(".//*[@id='firstName']")).sendKeys(fn);
		wd.findElement(By.xpath(".//*[@id='lastName']")).sendKeys(ln);
		wd.findElement(By.xpath(".//*[@id='photofile']")).click();
		
		Runtime.getRuntime().exec("D:\\Downloads\\AutoIT\\imageupload.exe");
		Thread.sleep(5000);
		
		wd.findElement(By.xpath(".//*[@id='btnSave']")).click();
		Thread.sleep(5000);
		
		objpim=wd.findElement(By.xpath(".//*[@id='menu_pim_viewPimModule']/b"));
		a.moveToElement(objpim).perform();
		Thread.sleep(5000);
		//click employee list
		wd.findElement(By.linkText("Employee List")).click();
		//employee list table
		
	
		WebElement table=wd.findElement(By.xpath(".//*[@id='resultTable']"));
		 List<WebElement> rc=table.findElements(By.tagName("tr"));
		 
		for(int i=1;i<rc.size();i++)
		{
	     String actval=wd.findElement(By.xpath(".//*[@id='resultTable']/thead/tr["+i+"]/th[4]/a")).getText();
	     
	     if(actval.equals(ln))
	     {
	    	 System.out.println(ln+ "is displayed at" +i+ "row");
	    	 break;
	    	 
	     }
			
		}
		
		wd.findElement(By.xpath(".//*[@id='welcome']")).click();
		
		wd.findElement(By.linkText("Logout")).click();
		title=wd.getTitle();
		
		

		if(title.equals("OrangeHRM"))
		{
			System.out.println("logout is completed");
			System.out.println("OrangeHRM homepage is displayed");
		}
		wd.close();
		System.out.println("browser is closed");
		
		wd.quit();
		System.out.println("object is closed");
		
	}

}
