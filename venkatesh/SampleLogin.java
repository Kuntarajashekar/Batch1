package venkatesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleLogin {

	public static void main(String[] args) {
		WebDriver wd=new FirefoxDriver();
		wd.get("file:///C:/Users/Dell_owner/Desktop/sample%20login.html");
		wd.findElement(By.id("un")).sendKeys("venkatesh");
		wd.findElement(By.id("psw")).sendKeys("9949492342");
		wd.findElement(By.id("login")).click();
		wd.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		
		
	}

}
