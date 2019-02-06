package venkatesh;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LogjExample {
	private static Logger log=Logger.getLogger(LogjExample.class.getName());
	public static void main(String[] args){
		DOMConfigurator.configure("log4j.xml");
		WebDriver wd=new FirefoxDriver();
		
		
		log.info("firefoxbrowseris open");
		System.out.println("firefoxbrowseris open");
		
		wd.get("http://www.gmail.com");
	    
		log.info("opengmailapp");
		System.out.println("opengmailapp");
	
	      log.info("-------------------");
	      System.out.println("-------------------");
	
}
	
}
