package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class sleepclass {

	
	
	   public static AppiumDriver<WebElement> driver ;
	   public sleepclass(AppiumDriver<WebElement> driver) 
	   {
	     this.driver=driver;
	   }
	
	    
	
	    public  void waitimplicit()
	    {
	    	driver.manage().timeouts().implicitlyWait(98,TimeUnit.SECONDS) ;
	    }
	    
	   	public static  void waitminimum() throws Exception
		{
	   		Thread.sleep(6000);
						
		}
		
		public static void waitmaximum() throws Exception
		{
			Thread.sleep(12000);
		}
		
		public static void sleepmax() throws Exception
		{
			Thread.sleep(16000);
			
		}
		
		
		public static void sleepmaxs() throws Exception
		{
			Thread.sleep(23000);
			
		}
		
	
}
