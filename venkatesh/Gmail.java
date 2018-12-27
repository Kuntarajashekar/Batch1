package venkatesh;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Gmail {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver(); 
		driver.get("https://www.google.com/gmail");
		driver.close();
	}

}
