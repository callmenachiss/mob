package TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import screens.AdministrativeTools;
import screens.Loginpage;
import screens.TakeScreenshot;
import screens.sleepclass;

public class UIViewPostNoPostMessagestyle3734 
{
/*** Global Initialization for WebDriver ***/
	
    public static WebDriver driver;
 
    /*** Global variable Initialization for Logger ***/
 
	private static Logger log; 
	
	@BeforeMethod	
	public void start() throws Exception
	{
		 log = LogManager.getLogger(UIViewPostNoPostMessagestyle3734.class);
		 
	}
	
	@SuppressWarnings("static-access")
	@Test 
	public void UIViewPostNoPostMessagestylePC3734() throws Exception
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

		/*** Scenario - verify View Post - No Post Message style in discussion feed  ***/
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
		sleep.waitminimum();
		shot.takeScreenShot("View Post - created New Post");
		login.post_controls();
		sleep.waitminimum();
		login.deletebutton();
		sleep.waitminimum();
		shot.takeScreenShot("View Post - deleted the existing Post");
		sleep.waitminimum();
		shot.takeScreenShot("warning for deleting the existing Post");
		login.confirmbutton();		
		sleep.waitminimum();
		shot.takeScreenShot("View Post - No Post");
		
		log.info("Scenario - verify View Post - No Post Message style in discussion feed -- Passed");

		/*** Scenario - Close the Webdriver  ***/
		sleep.waitminimum();
		driver.close();
		log.info("Close the Webdriver");
		
		
	}
}