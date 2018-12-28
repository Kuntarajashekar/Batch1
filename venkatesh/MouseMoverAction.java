package venkatesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMoverAction {

	public static void main(String[] args) {
	WebDriver wd=new FirefoxDriver();
	wd.get("https://www.flipkart.com/");
	WebElement ob=wd.findElement(By.xpath("//*[@id='container']/div/header/div[2]/div/ul/li[3]/a/span"));
	Actions a =new  Actions(wd);
	a.moveToElement(ob).perform();
	

	}

}
