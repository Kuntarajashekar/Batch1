package venkatesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogin {

public static void main(String[] args) {
	WebDriver wb=new FirefoxDriver();
	wb.get("http://facebook.com");
	wb.findElement(By.xpath(".//input[@name='email']")).sendKeys("venki.jujjuru@gmail.com");
	//wb.findElement(By.xpath("//*[@id='email']")).sendKeys("venki.jujjuru@gmail.com");
	wb.findElement(By.id("pass")).sendKeys("9949492342");
    wb.findElement(By.xpath("//*[@id='loginbutton']")).click();
    wb.close();		
}

}
