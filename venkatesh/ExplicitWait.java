package venkatesh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new FirefoxDriver();
		wd.get("http://www.rediff.com/");
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    WebDriverWait wait=new WebDriverWait(wd,20);
	    wait.until(ExpectedConditions.titleIs("rediff.com"));
	    System.out.println("page is dispayed");
	    wd.findElement(By.xpath(".//*[@id='srchword']")).click();
	    Thread.sleep(3000);
	    wait.until(ExpectedConditions.alertIsPresent());
        Alert alert=wd.switchTo().alert();
        alert.accept();
        
	    
	}

}
