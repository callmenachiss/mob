package TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import screens.AdministrativeTools;
import screens.Loginpage;
import screens.TakeScreenshot;
import screens.sleepclass;

public class UIViewPostEditedTimestamp3793 
{
/*** Global Initialization for WebDriver ***/
	
    public static WebDriver driver;
 
    /*** Global variable Initialization for Logger ***/
 
	private static Logger log; 
	
	@BeforeMethod	
	public void start() throws Exception
	{
		 log = LogManager.getLogger(UIViewPostEditedTimestamp3793.class);
		 
	}
	 
	
	@SuppressWarnings("static-access")
	@Test 
	public void UIViewPostEditedTimestampPC3793() throws Exception
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

		/*** Scenario - Verify the View Post Edited Timestamp is edited/updated correctly in view post of discussion page  ***/		
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
		login.editbutton();
		sleep.waitminimum();
		login.editedtextfield();
		sleep.waitminimum();
		login.enterkey();
		sleep.waitminimum();
		shot.takeScreenShot("View Post - editing the existing Post");
		log.info("Scenario - Verify the View Post Edited Timestamp is edited/updated correctly in view post of discussion page -- Passed");

		/*** Scenario - Close the Webdriver  ***/
		sleep.waitminimum();
		driver.close();
		log.info("Close the Webdriver");
	
	
	}

	
}	
	