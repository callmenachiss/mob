package mobileappTestcase;

import java.net.MalformedURLException;
import java.net.URL;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import locators.BottomNavBar;
import locators.Signinpage;
import locators.TakeScreenshot;
import locators.capabilitiessetup;
import locators.sleepclass;
import screens.Loginpage;



public class UIPrivacyPolicyPremier3269 
{

    public static  AppiumDriver<WebElement> driver;
		
    private static Logger log; 
	
 

	@BeforeMethod	
	public void start() throws Exception
	{
		capabilitiessetup.platformconfig();
    	log = LogManager.getLogger(UIPrivacyPolicyPremier3269.class);
    	log.info("Start the Execution for Virtual Mobile Application - Pixel5");
		DesiredCapabilities capabilites = new DesiredCapabilities();
		capabilites.setCapability("DeviceName", "AOSP on IA Emulator");
		capabilites.setCapability("OSversion", "9");
		capabilites.setCapability("Model", "AOSP on IA Emulator");
		capabilites.setCapability("IMEI", "358240051111110");
		capabilites.setCapability("platformName", "Android");
		capabilites.setCapability("deviceUDID", "emulator-5554");
		capabilites.setCapability("appPackage", "com.mobile");
        capabilites.setCapability("appActivity", "com.mobile.MainActivity");
	    driver = new AppiumDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilites);
	    log.info("Capabilites Setup for AppiumDriver Initiation");
	    sleepclass.sleepmax();
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void UIPrivacyPolicyPremierPC3269() throws MalformedURLException, Exception
	{
		
		  Signinpage signin = new Signinpage(driver);
		  sleepclass sleep = new sleepclass(driver);
		  TakeScreenshot shot = new TakeScreenshot(driver);
		  BottomNavBar nav = new BottomNavBar(driver);
		  log.info("Splash Screen - Premier Collaboration");
		  shot.takeScreenShot("Spalshscreen");
		  sleep.waitminimum();
		  signin.splashscreenbuttonclick();
		  sleep.waitmaximum(); 
		  shot.takeScreenShot("Chrome Browser page 1");
		  signin.chromebtn1();
		  log.info("Resetting the caches & Cookies for new Build");
		  sleep.waitmaximum();
		  shot.takeScreenShot("Chrome Browser page 2");
		  signin.chromebtn2();
		  sleep.waitimplicit();		  
		  signin.usernamebtn();
		  log.info("Enter the username");
		  sleep.waitminimum();
		  shot.takeScreenShot("Username");
		  signin.nextbuttonclick();
		  sleep.waitmaximum();
		  log.info("Enter the password");
		  signin.passwordbtn();
		  sleep.waitminimum();
		  shot.takeScreenShot("Password");
		  log.info("Click on sign-in button");
		  signin.signinbtnclick();
		  sleep.waitmaximum();
		  shot.takeScreenShot("Signin");
		  sleep.waitminimum();
		  /*TouchAction action = new TouchAction(driver); 
		  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[10]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"));
          action.press(PointOption.point(115, 915)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(6)))
                .moveTo(PointOption.point(115, 150)).release().perform();
		  log.info("User is handle the screen scroll view");
		  shot.takeScreenShot("Spalshscreen");*/
		  log.info("User is done with Registration - One Time Activity");
		  sleep.waitminimum();
		  nav.profileimage();
		  sleep.waitminimum();
		  shot.takeScreenShot("Profileview");
		  sleep.waitminimum();		  
		  nav.Privacypolicypage();
		  sleep.sleepmax();
		  shot.takeScreenShot("Privacypolicypage");		  
		  sleep.waitminimum();
		  nav.previousiconclick();
		  sleep.waitminimum();		  
		  nav.termsconditionspage();
		  sleep.sleepmax();
		  shot.takeScreenShot("Terms & Conditionspage");		  
		  log.info("Close the Appium Server and Exit from the Application");
		  
	      		
	}
	
		

}



