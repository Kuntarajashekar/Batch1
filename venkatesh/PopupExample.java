package venkatesh;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopupExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new FirefoxDriver();
		wd.get("http://www.rediff.com/");
		wd.findElement(By.xpath("//*[@id='queryTop']/div/input[6]")).click();
				
		 Alert a= wd.switchTo().alert();
		 Thread.sleep(3000);
		 a.accept();

	}

}
