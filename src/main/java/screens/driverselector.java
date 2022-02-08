package screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class driverselector 
{
	     
		public static WebDriver driver;	
		      
	 
		// Chrome driver Initialization
		
		public void chromedriver()
		{	     
	     System.setProperty("webdriver.chrome.driver","E:/chromedriver_win32/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://collaborationdevi.premierinc.com/");
		 driver.manage().window().maximize();
         } 

}
		    
