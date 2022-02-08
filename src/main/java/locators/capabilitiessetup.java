package locators;

import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;




/*******  
 * 
 * 
 * 
 * 
 * set of codes written to setup the platform and desired capabilities in virtual machine *
 * 
 * 
 * *****/

public class capabilitiessetup 
{
	
	private static Logger log; 
	public static WebDriver driver;
	
	public static void platformconfig() throws Exception
	{
		
		log = LogManager.getLogger(capabilitiessetup.class);
		DesiredCapabilities capabilites = new DesiredCapabilities();
		capabilites.setCapability("DeviceName", "AOSP on IA Emulator");
		capabilites.setCapability("OSversion", "9");
		capabilites.setCapability("Model", "AOSP on IA Emulator");
		capabilites.setCapability("IMEI", "358240051111110");
		capabilites.setCapability("platformName", "Android");
		capabilites.setCapability("deviceUDID", "emulator-5554");
		capabilites.setCapability("appPackage", "com.android.settings");
	    capabilites.setCapability("appActivity", "com.android.settings.Settings");	    
	    sleepclass.waitmaximum();
	    log.info("Started Appium Server");
		AppiumDriver<WebElement> driver = new AppiumDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilites);
		sleepclass.waitmaximum();
		log.info("open the browser settings");
	    driver.findElement(By.xpath("//android.widget.TextView[@text='Apps & notifications']")).click();
	    sleepclass.waitmaximum();  
	    
	    driver.findElement(By.xpath("//android.widget.TextView[@text='Chrome'and @index='0']")).click();
	    sleepclass.waitmaximum();
	    
	    driver.findElement(By.xpath("//android.widget.TextView[@text='Storage']")).click();
	    sleepclass.waitmaximum(); 
	    
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout[2]/android.widget.Button")).click();
	    sleepclass.waitminimum();
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.Button")).click();
	    sleepclass.waitmaximum();
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[3]")).click();
	    sleepclass.waitmaximum();
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/rz/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")).click();
	    sleepclass.waitminimum();	    
	    /*driver.findElement(By.id("com.android.settings:id/app1_view")).click();
	    sleep.waitmaximum();
	    log.info("open the app in settings");
	    sleep.waitminimum(); 
	    driver.findElement(By.xpath("//android.widget.TextView[@text='Chrome'and @index='1']")).click();
	    sleep.waitmaximum();
	    log.info("click on cookies icon");  
	    driver.findElement(By.xpath("//android.widget.TextView[@text='Storage & cache']")).click();
	    sleep.waitmaximum();
	    driver.findElement(By.id("com.android.settings:id/button2")).click();
	    sleep.waitmaximum();
	    log.info("clear the cache & cookies");
	    driver.findElement(By.id("com.android.settings:id/button1")).click(); 
	    sleep.waitminimum();
	    driver.findElement(By.id("com.android.chrome:id/clear_all_data")).click();
	    sleep.waitminimum();
	    driver.findElement(By.id("android:id/button1")).click();
	    sleep.waitminimum(); */
	    log.info("Storage & cache has been deleted in this virtual Mobile Application");
	
	    
	}
	

}
