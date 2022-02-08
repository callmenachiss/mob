package mobileappTestcase;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import locators.BottomNavBar;
import locators.Signinpage;
import locators.TakeScreenshot;
import locators.capabilitiessetup;
import locators.sleepclass;

public class Regressionformobileapp 
{
	// Global variable Initiation
	public static  AppiumDriver<WebElement> driver;	
    private static Logger log; 
    
    
    @BeforeMethod	
	public void start() throws Exception
	{
    	// Capability setup for virtual mobile device
		capabilitiessetup.platformconfig();
    	log = LogManager.getLogger(Regressionformobileapp.class);
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
	public void RegressionTestingforMobileApp() throws MalformedURLException, Exception
	{
	
    	  // Object creation for locators package
    	
		  Signinpage signin = new Signinpage(driver);
		  sleepclass sleep = new sleepclass(driver);
		  TakeScreenshot shot = new TakeScreenshot(driver);
		  BottomNavBar nav = new BottomNavBar(driver);
		  
		  // Execution starts from here ..!		
		  log.info("Splash Screen - Premier Collaboration");		  
		  shot.takeScreenShot("Sign-in page");
		  sleep.waitminimum();
		  signin.splashscreenbuttonclick();
		  sleep.waitmaximum(); 
		  
		  // Handle the chrome browser welcome message...		  
		  //shot.takeScreenShot("Chrome Browser page 1");
		  signin.chromebtn1();
		  log.info("Resetting the caches & Cookies for new Build");
		  sleep.waitmaximum();
		  //shot.takeScreenShot("Chrome Browser page 2");
		  signin.chromebtn2();
		  sleep.waitimplicit();	
		  
		  // Login in splash screen page		  
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
		  sleep.sleepmaxs();
		  shot.takeScreenShot("Signin");
		  sleep.waitminimum();
		  log.info("User is done with Registration - One Time Activity");
		  
		  // Bottom Navigation Bar page	- community tab		  
		  sleep.waitminimum();
		  shot.takeScreenShot("Bottom Nav Bar");
		  /*nav.community_icon();
		  sleep.waitminimum();
		  shot.takeScreenShot("Community tab in Bottom Nav Bar");
		  log.info("user is in Community tab of Bottom Nav Bar");*/
		  
		  nav.community_selection();
		  sleep.waitminimum();
		  shot.takeScreenShot("Community Selection");
		  log.info("user is in Discussion page of Community section tab of Bottom Nav Bar");
		  
		  nav.discussiontab_selection();
		  sleep.waitminimum();
		  shot.takeScreenShot("Discussion tab of Community section");
		  log.info("user is in Discussion tab of Community section in Bottom Nav Bar");
		  
		  /*TouchAction action = new TouchAction(driver); 
		  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView[2]"));
          action.press(PointOption.point(115, 915)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(6)))
                .moveTo(PointOption.point(115, 150)).release().perform();
		  log.info("User is handle the screen scroll view");*/
		  		  
		  
		  nav.pagestab_selection();
		  sleep.waitminimum();
		  shot.takeScreenShot("Pages tab of Community section");
		  log.info("user is in Pages tab of Community section in Bottom Nav Bar");
		  
		  nav.memberstab_selection();
		  sleep.waitminimum();
		  shot.takeScreenShot("members tab of Community section");
		  log.info("user is in members tab of Community section in Bottom Nav Bar");
		  
		  nav.surveystab_selection();
		  sleep.waitminimum();
		  shot.takeScreenShot("Surveys&Polls tab of Community section");
		  log.info("user is in Surveys&Polls tab of Community section in Bottom Nav Bar");
		  
		  nav.faqtab_selection();
		  sleep.waitminimum();
		  shot.takeScreenShot("FAQ tab of Community section");
		  log.info("user is in FAQ tab of Community section in Bottom Nav Bar");
		  
		  // notification tab
		  sleep.waitminimum();
		  //nav.notification_icon();
		  //sleep.waitminimum();
		  Actions act = new Actions(driver);
		  act.sendKeys(Keys.TAB).build().perform();
		  act.sendKeys(Keys.TAB).build().perform();
		  act.sendKeys(Keys.TAB).build().perform();
		  act.sendKeys(Keys.TAB).build().perform();
		  act.sendKeys(Keys.TAB).build().perform();
		  act.sendKeys(Keys.TAB).build().perform();
		  //sleep.waitminimum();
		  act.sendKeys(Keys.ENTER).build().perform();
		  sleep.waitmaximum();
		  shot.takeScreenShot("Notifications tab in Bottom Nav Bar");
		  log.info("user is in Notifications tab of Bottom Nav Bar");	
		  
		  // add tab
		  //nav.add_icon();
		  act.sendKeys(Keys.TAB).build().perform();
		  sleep.waitminimum();
		  act.sendKeys(Keys.ENTER).build().perform();
		  sleep.waitminimum();
		  shot.takeScreenShot("Add tab in Bottom Nav Bar");
		  log.info("user is in Add tab of Bottom Nav Bar");
		  
		  // message tab
		  //nav.message_icon();
		  act.sendKeys(Keys.TAB).build().perform();
		  sleep.waitminimum();
		  act.sendKeys(Keys.ENTER).build().perform();
		  sleep.waitminimum();
		  shot.takeScreenShot("Message tab in Bottom Nav Bar");
		  log.info("user is in Message tab of Bottom Nav Bar");
		  
		  // search tab
		  //nav.search_icon();
		  act.sendKeys(Keys.TAB).build().perform();
		  sleep.waitminimum();
		  act.sendKeys(Keys.ENTER).build().perform();
		  sleep.waitminimum();
		  shot.takeScreenShot("Search tab in Bottom Nav Bar");
		  log.info("user is in Search tab of Bottom Nav Bar");
		  
		  //profileview
		  sleep.waitminimum();		  
		  act.sendKeys(Keys.TAB).build().perform();
		  act.sendKeys(Keys.ENTER).build().perform();
		  act.sendKeys(Keys.ENTER).build().perform();
		  sleep.waitmaximum();
		  nav.profileimage();
		  sleep.waitminimum();
		  log.info("user is in Profile view page");
		  shot.takeScreenShot("Profileview");
		  sleep.waitminimum();
		  nav.editprofilepage();
		  sleep.waitminimum();
		  log.info("user is in EditProfile page");
		  sleep.sleepmaxs();
		  shot.takeScreenShot("Editprofilepage");
		  sleep.waitminimum();
		  
		  //handle the previous icon click
		  nav.previousiconclick();
		  sleep.waitminimum();
		  
		  //priacy policy page
		  nav.Privacypolicypage();
		  sleep.sleepmaxs();
		  shot.takeScreenShot("Privacypolicypage");
		  sleep.waitminimum();
		  nav.previousiconclick();
		  sleep.waitminimum();
		  
		  //Terms & Conditions page
		  nav.termsconditionspage();
		  sleep.sleepmaxs();
		  shot.takeScreenShot("Terms & Conditionspage");
		  sleep.waitminimum();
		  nav.previousiconclick();
		  sleep.waitminimum();
		  
		  //sign out feature
		  //nav.signoutclick();
		  log.info("user is in signout page");
		  //sleep.waitminimum();
		  shot.takeScreenShot("Splash screen");
		  log.info("Close the Appium Server and Exit from the Application");
		  
		  
		  
		  
	}

}
