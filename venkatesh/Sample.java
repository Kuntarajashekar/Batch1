package venkatesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {

	public static void main(String[] args) {
		WebDriver wd=new FirefoxDriver();
		wd.get("file:///C:/Users/Dell_owner/Desktop/sample1.html");
		wd.findElement(By.id("un")).sendKeys("venki");
        wd.findElement(By.id("male")).click();
        wd.findElement(By.id("female"));
        WebElement ob=wd.findElement(By.id("city"));
        Select os=new Select(ob);
        os.selectByValue("GUNTUR");
        os.selectByValue("VIJAYAWADA");
        os.selectByValue("HYDERABAD");
        os.selectByValue("BANGLORE");
        wd.findElement(By.id("agree")).click();
        wd.findElement(By.id("btn")).click();
        wd.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
      
        
	}

	
	
}
