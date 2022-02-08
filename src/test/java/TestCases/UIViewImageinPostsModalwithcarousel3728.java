/********      Framework has been created by Nachiyappan        *******/

package TestCases;

/*** Imported all the necessary packages to reduce the dependency...  ***/

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import screens.AdministrativeTools;
import screens.Loginpage;
import screens.TakeScreenshot;
import screens.sleepclass;

public class UIViewImageinPostsModalwithcarousel3728 
{
	
	/*** Global Initialization for WebDriver ***/
	
    public static WebDriver driver;
 
    /*** Global variable Initialization for Logger ***/
 
	private static Logger log; 
	
	@BeforeMethod	
	public void start() throws Exception
	{
		 log = LogManager.getLogger(UIViewImageinPostsModalwithcarousel3728.class);
		 
	}
	 
	
	@SuppressWarnings("static-access")
	@Test 
	public void UIViewImageinPostsModalwithcarouselPC3728() throws Exception
	{
		
		log.info("Driver Selection to perform web Automation");
		
		/***  Chrome driver Initialization ***/
		
		System.setProperty("webdriver.chrome.driver","E:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://collaborationdevi.premierinc.com/");
		driver.manage().window().maximize();
		log.info("User selected the Chrome browser to perform web Automation");
		
		/*** Object Creation to access the non-static members ***/
		sleepclass sleep = new sleepclass(driver);
		sleep.waitminimum();		
		TakeScreenshot shot = new TakeScreenshot(driver);		
		Loginpage login = new Loginpage(driver);
		AdministrativeTools admin = new AdministrativeTools(driver);
		
		
		/*** User login in App using Valid Credentials ***/
		
		/*** Login Screen ***/
		
		/*** Username ***/
		
		login.usernamefield();
		sleep.waitminimum();
		shot.takeScreenShot("Username");
		log.info("Enter the Username");
		login.nextbtnclick();
		sleep.waitminimum();
		
		/*** Password ***/
		
		log.info("Enter the Password");
		login.passwordfield();
		sleep.waitminimum();
		shot.takeScreenShot("Password");
		
		/*** Sign-in  ***/
		
		log.info("Click on Sign-In Button");
		login.sigininbutton();
		sleep.waitminimum();
		shot.takeScreenShot("Sign-In");
		log.info("User Successfully login in our Application...");	
		
		/*** Scenario - verify View image in posts model with carousel  ***/	
		sleep.waitminimum();
		login.community_sidebar();
		sleep.waitminimum();
		login.community_selection();
		sleep.waitminimum();
		login.discussion_subtab();
		sleep.waitminimum();
		shot.takeScreenShot("View Post - No Post");
		sleep.waitminimum();		
		login.textfield();
		sleep.waitminimum();
		login.postbutton();	
		driver.navigate().refresh();		
		sleep.waitminimum();
		shot.takeScreenShot("View image in single post model");	
		sleep.waitminimum();
	    login.multipleimage(); 
		sleep.waitminimum();
		login.textfield();
		sleep.waitminimum();
		login.postbutton();	
		driver.navigate().refresh();
		sleep.waitminimum();
		login.screen_scroll();
		shot.takeScreenShot("View image in multiple post model");
		log.info("Scenario - verify View image in posts modal with carousel -- Passed");
		
		
		/*** Scenario - Close the Webdriver  ***/
		sleep.waitminimum();
		driver.close();
		log.info("Close the Webdriver");
		
	}
}
