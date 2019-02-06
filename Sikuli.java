import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli 
{
	public static void main(String[] args) throws InterruptedException, FindFailed 
	{
		
       Screen s=new Screen();
       
       Pattern image1=new Pattern("D:\\Pictures\\email.PNG");
       
       Pattern image2=new Pattern("‪D:\\Pictures\\password.PNG");
       
       Pattern image3=new Pattern("‪D:\\Pictures\\login.PNG");
       
      WebDriver driver=new FirefoxDriver();
      
      driver.get("https://www.facebook.com/");
      
      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      s.wait(image1, 3);
      
      s.type(image1,"venki.jujjuru@gmail.com");
      
      s.type(image2, "9949492342");
      
      s.click(image3);
	}


}
