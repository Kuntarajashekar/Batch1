package venkatesh;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyboardAction {

	public static void main(String[] args) {
		WebDriver wb=new FirefoxDriver();
		wb.get("http://www.Linkedin.com/");
		wb.findElement(By.xpath("//*[@id='reg-firstname']")).sendKeys("Sravanthi");
		wb.findElement(By.xpath("//*[@id='reg-firstname']")).sendKeys(Keys.TAB);
				
	    
	    wb.findElement(By.xpath("//*[@id='reg-lastname']")).sendKeys("vaddi");
		wb.findElement(By.xpath("//*[@id='reg-lastname']")).sendKeys(Keys.TAB);
		
				
						
		wb.findElement(By.xpath("//*[@id='reg-email']")).sendKeys("samarasrav5@gmail.com");
	    wb.findElement(By.xpath("//*[@id='reg-email']")).sendKeys(Keys.TAB);
		wb.findElement(By.xpath("//*[@id='reg-password']")).sendKeys("7306878706");
		wb.findElement(By.xpath("//*[@id='reg-password']")).sendKeys(Keys.TAB);
		wb.findElement(By.xpath("//*[@id='registration-submit']")).sendKeys(Keys.ENTER);
			
		
		

	}

}
