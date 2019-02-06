package venkatesh;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MutiWindowHandling {
     public static String FreshWindw;
	public static void main(String[] args)  {
	
		WebDriver wd=new FirefoxDriver();
		wd.get("https://www.telugumatrimony.com/");
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wd.findElement(By.xpath(".//*[@id='close']/center/div[2]/div[1]/div[1]/div[3]/div[2]/img")).click();
	String first=wd.getWindowHandle();
       
		Set<String> s=wd.getWindowHandles();
		Iterator<String> itr=s.iterator();
		while(itr.hasNext())
		{
			FreshWindw=itr.next();
			
			
		}
	
		
		wd.switchTo().window(FreshWindw);
		
		wd.findElement(By.linkText("Forgotten account?")).click();
		System.out.println(wd.getCurrentUrl());
		
		
	
		
		
		
		s=wd.getWindowHandles();
	      itr=s.iterator();
		while(itr.hasNext())
		{
			FreshWindw=itr.next();
		}
       
		
		wd.switchTo().window(FreshWindw);
		
		wd.findElement(By.linkText("Forgotten account?")).click();
		System.out.println(wd.getCurrentUrl());
	
		
		wd.switchTo().window(first);
		System.out.println(wd.getCurrentUrl());
		}

}
