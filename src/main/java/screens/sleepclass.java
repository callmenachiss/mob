package screens;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class sleepclass {

	
	
	   public WebDriver driver ;
	   public sleepclass(WebDriver driver) 
	   {
	     this.driver=driver;
	   }
	
	    
	
	    public void waitimplicit()
	    {
	    	driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS) ;
	    }
	    
	   	public static void waitminimum() throws Exception
		{
			Thread.sleep(1700);
						
		}
		
		public static void waitmaximum() throws Exception
		{
			Thread.sleep(6000);
		}
		
		public static void sleepmax() throws Exception
		{
			Thread.sleep(15000);
			
		}
		
		
		public static void sleepmaxs() throws Exception
		{
			Thread.sleep(45000);
			//driver.manage().timeouts().implicitlyWait(40000, ms);
		}
		@SuppressWarnings("null")
		public static  void loops()
		{
			WebDriver driver = null;
			WebElement app1 = driver.findElement(By.id("com.android.settings:id/app1_view"));
			WebElement app2 = driver.findElement(By.id("com.android.settings:id/app2_view"));
			if(driver.findElements(By.id("com.android.settings:id/app1_view")).size()>0)
			{
				app1.click();
			}
			else
			{
				app2.click();
			}
			
			
		}
	
}
