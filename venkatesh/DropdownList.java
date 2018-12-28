package venkatesh;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DropdownList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new FirefoxDriver();
		wd.get("https://seleniumsreekanth.blogspot.in/2015/08/dropdown-example.html");
		WebElement ob=wd.findElement(By.xpath(".//*[@id='cars']"));
        Select os=new Select(ob);
        os.selectByIndex(2);
        Thread.sleep(3000);
        os.selectByValue("Jazz");
        Thread.sleep(3000);
        os.selectByVisibleText("Audi");
        
        List<WebElement> ob1=os.getAllSelectedOptions();
        System.out.println(ob1);
        
	}

}
