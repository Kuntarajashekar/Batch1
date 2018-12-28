package venkatesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Comparing {

	public static void main(String[] args) {
		WebDriver wd=new FirefoxDriver();
		wd.get("https://www.cleartrip.com/");
		String Av=wd.findElement(By.xpath(".//*[@id='SearchForm']/nav/ul/li[3]/label")).getAttribute("title");
		String EV="Multi-city";
	   System.out.println(EV.equals(Av)? "EV AND AV ARE MATCHING":"EV AND AV ARE NOT  MATCHING");
		
		
		

	}

}
