package venkatesh;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable1 {
	
	
	public static void main(String[] args) {
		WebDriver wd=new FirefoxDriver();
		wd.get("https://www.w3schools.com/html/html_tables.asp");
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement table=wd.findElement(By.xpath(".//*[@id='customers']"));
		
		List<WebElement> rc=table.findElements(By.tagName("tr"));
		List<WebElement> cc=table.findElements(By.tagName("td"));
		for(int i=1;i<rc.size();i++)
		{
		for(int j=0;j<cc.size();j++)
		{
				String str=cc.get(j).getText();
			   System.out.println(str);
		
		}

}
}
}
