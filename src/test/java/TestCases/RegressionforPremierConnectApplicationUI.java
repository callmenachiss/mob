/********      Framework has been created by Nachiyappan        *******/

package TestCases;

/*** Imported all the necessary packages to reduce the dependency...  ***/

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import screens.AdministrativeTools;
import screens.Loginpage;
import screens.PremierConnectElements;
import screens.TakeScreenshot;
import screens.sleepclass;

public class RegressionforPremierConnectApplicationUI 
{
	
	/*** Global Initialization for WebDriver ***/
	
    public static WebDriver driver;
 
    /*** Global variable Initialization for Logger ***/
 
	private static Logger log; 
	
	@BeforeMethod	
	public void start() throws Exception
	{
		 log = LogManager.getLogger(RegressionforPremierConnectApplicationUI.class);
		 log.info("Perform Regression Testing on Premier Connect Application...");
	}
	 
	
	@SuppressWarnings("static-access")
	@Test 
	public void Perform_RegressionTesting_PremierConnectApp() throws Exception
	{
		
		log.info("Driver Selection to perform web Automation");
		
		/***  Chrome driver Initialization ***/
		
		System.setProperty("webdriver.chrome.driver","E:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://premierconnectdevi.premierinc.com/");
		driver.manage().window().maximize();
		log.info("User selected the Chrome browser to perform web Automation");
		
		/*** Object Creation to access the non-static members ***/
		sleepclass sleep = new sleepclass(driver);
		sleep.waitminimum();		
		TakeScreenshot shot = new TakeScreenshot(driver);		
		Loginpage login = new Loginpage(driver);
		PremierConnectElements elements = new PremierConnectElements(driver);
		
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
				
		
			
		/*** Home Screen ***/		
		
		/*** Scenario - Validate the Url  ***/
		sleep.waitminimum();
		String Actual_url = driver.getCurrentUrl();
		Assert.assertEquals(Actual_url , "https://premierconnectdevi.premierinc.com/home" );
		log.info("Url" + "---" + Actual_url);
		log.info("Scenario - Validate the Url -- Passed");
		
		/*** Scenario - Validate the Title of the page  ***/		
		/*String Actual_title = driver.getTitle();
		Assert.assertEquals(Actual_title , "PremierConnect" );
		log.info("Page Title" + "---" + Actual_title);
		log.info("Scenario - Validate the Title of the page -- Passed");*/
		
		sleep.waitminimum();
		
		/*** Scenario - Verify the functionality of premier icon  ***/		
		elements.premier_icon();
		sleep.waitminimum();
		log.info("Scenario - Verify the functionality of premier icon -- Passed");
		
		/*** Scenario - Verify the functionality of premier logo  ***/		
		elements.premier_logo();
		sleep.waitminimum();
		log.info("Scenario - Verify the functionality of premier logo -- Passed");
		
		/*** Scenario - Verify the functionality of News Header  ***/		
		/*elements.news_header();
		sleep.waitminimum();
		log.info("Scenario - Verify the functionality of News Header -- Passed");
		shot.takeScreenShot("News Header Page");*/
		
		/*** Scenario - Verify the functionality of Resources Header  ***/		
		/*elements.resources_header();
		sleep.waitminimum();
		log.info("Scenario - Verify the functionality of Resources Header -- Passed");
		shot.takeScreenShot("Resources Header Page");*/
		
		/*** Scenario - Verify the functionality of Help Header  ***/		
		/*elements.help_header();
		sleep.waitminimum();
		log.info("Scenario - Verify the functionality of Help Header -- Passed");*/
		
		/*** Scenario - verify the functionality of Privacy Policy Link  ***/		
		log.info("User is handle the screen scroll view");		  
		sleep.waitminimum();  
		elements.privacy_policy_link();
		sleep.waitminimum();
		log.info("Scenario - verify the functionality of Privacy Policy Link -- Passed");
		
		
		
		
		
		
		/*** Scenario - Close the Webdriver  ***/
		sleep.waitminimum();
		driver.close();
		log.info("Close the Webdriver");
		
	}
}
