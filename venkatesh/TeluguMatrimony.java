package venkatesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TeluguMatrimony {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new FirefoxDriver();
		wd.get("https://profile.telugumatrimony.com/search/search.php?gaact=SEARCH&gasrc=MENUSUB");
		wd.findElement(By.xpath(".//*[@id='m_gender']")).click();
		wd.findElement(By.xpath(".//*[@id='STAGE']")).sendKeys("25");
		wd.findElement(By.xpath(".//*[@id='ENDAGE']")).sendKeys("30");
		WebElement ob=wd.findElement(By.xpath(".//*[@id='RELIGION']"));
		Select os=new Select(ob);
		os.selectByVisibleText("Hindu");
		
		Thread.sleep(3000);
		
		WebElement ob1=wd.findElement(By.xpath(".//*[@id='COUNTRY_IN']"));
				
				Select os1=new Select(ob1);
	         	os1.selectByVisibleText("India");
		       
	
		wd.findElement(By.xpath(".//*[@id='PHOTO_OPT']")).click();
		wd.findElement(By.xpath(".//*[@id='HOROSCOPE_OPT']")).click();
		wd.findElement(By.xpath(".//*[@id='Form']/form/dl/dd/span/input")).click();
		

	}

}
