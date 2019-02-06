package venkatesh;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtable {

	public static void main(String[] args) {
		WebDriver wd=new FirefoxDriver();
		wd.get("https://www.w3schools.com/html/html_tables.asp");
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement table=wd.findElement(By.xpath(".//*[@id='customers']"));
		List<WebElement> rc=table.findElements(By.tagName("tr"));
		for(int i=1;i<rc.size();i++){
		List<WebElement> cc=rc.get(i).findElements(By.tagName("td"));
		for(int j=0;j<cc.size();j++)
		{
				String str=cc.get(j).getText();
			System.out.println(str);
		
			
		}
		
	}
	}
}