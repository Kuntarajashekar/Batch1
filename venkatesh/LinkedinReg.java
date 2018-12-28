package venkatesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkedinReg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new FirefoxDriver();
		wd.get("https://www.linkedin.com/");
		Thread.sleep(3000);
		WebDriver.Options ob=wd.manage();
		 WebDriver.Window ob1=ob.window();
		 ob1.maximize();
		wd.findElement(By.xpath("//*[@id='reg-firstname']")).sendKeys("jujjuru");
		wd.findElement(By.name("lastName")).sendKeys("venkatesh");
		wd.findElement(By.id("reg-email")).sendKeys("venki.jujjuru29@gmail.com");
		wd.findElement(By.className("reg-password")).sendKeys("venki333");
		wd.findElement(By.xpath("//*[@id='registration-submit']")).click();
	}

}
