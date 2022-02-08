
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
import screens.TakeScreenshot;
import screens.sleepclass;

public class RegressionforCollabWebAppUI 
{
	
	/*** Global Initialization for WebDriver ***/
	
    public static WebDriver driver;
 
    /*** Global variable Initialization for Logger ***/
 
	private static Logger log; 
	
	@BeforeMethod	
	public void start() throws Exception
	{
		 log = LogManager.getLogger(RegressionforCollabWebAppUI.class);
		 log.info("Perform Regression Testing on Premier Connect Application...");
	}
	 
		
	@SuppressWarnings("static-access")
	@Test 
	public void Perform_RegressionTesting_CollabWebApp() throws Exception
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
		
		/*** Scenario - Validate the Url  ***/
		sleep.waitminimum();
		String Actual_url = driver.getCurrentUrl();
		Assert.assertEquals(Actual_url , "https://collaborationdevi.premierinc.com/" );
		log.info("User is landing in the Expected page" + "---" + Actual_url);
			
		/*** Scenario - Validate the Title of the page  ***/		
		String Actual_title = driver.getTitle();
		Assert.assertEquals(Actual_title , "Premier Collaboration" );
		log.info("Page Title" + "---" + Actual_title);
		log.info("Scenario - Validate the Title of the page -- Passed");
		
		/*** Scenario - Verify the functionality of premier icon  ***/		
		login.premier_icon();
		sleep.waitminimum();
		log.info("Scenario - Verify the functionality of premier icon -- Passed");
		
		/*** Scenario - Verify the functionality of premier logo  ***/		
		login.premier_logo();
		sleep.waitminimum();
		log.info("Scenario - Verify the functionality of premier logo -- Passed");
		
		/*** Scenario - Verify the functionality of Notifications Header  ***/		
		login.notifications_header();
		sleep.waitminimum();
		log.info("Scenario - Verify the functionality of Notifications Header -- Passed");
		shot.takeScreenShot("Notifications Header Page");
		
		/*** Scenario - Verify the functionality of Menu Header  ***/		
		login.menu_header();
		sleep.waitminimum();
		log.info("Scenario - Verify the functionality of Menu Header -- Passed");
		shot.takeScreenShot("Menu Header Page");	
		
				
		/*** Scenario - Verify whether the user has the admin rights or not  ***/
		admin.AdminTools();
		shot.takeScreenShot("AdministrativeTools");
		log.info("User have an admin access");
		log.info("Scenario - Verify whether the user has the admin rights or not -- Passed");
		
		
		/*** Scenario - Verify the View Post Edited Timestamp is edited/updated correctly in view post of discussion page  ***/		
		//login.community_sidebar();
		//sleep.waitminimum();
		//login.community_selection();
		//sleep.waitminimum();
		//shot.takeScreenShot("View Post - editing the existing Post");
		//log.info("Scenario - Verify the View Post Edited Timestamp is edited/updated correctly in view post of discussion page -- Passed");
		
			
		/*** Scenario - Verify the Footer content of Collab App in Home page  ***/	
		login.footer_content();
		sleep.waitimplicit();
		shot.takeScreenShot("Footer Page of Collab App");
		log.info("Footer Copyright content is updated as per the policy");		
		String content = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/footer[1]/div[1]")).getText();
		log.info(content);
		log.info("Scenario - Verify the Footer content of Collab App in Home page -- Passed");
		
		/*** Scenario - Verify the functionality of Message icon  ***/	
		login.messeage_icon();
		shot.takeScreenShot("Message flyover");
		log.info("Scenario - Verify the functionality of Message icon -- Passed");
		
		
		/*** Scenario - Close the Webdriver  ***/
		sleep.waitminimum();
		driver.close();
		log.info("Close the Webdriver");
		
	}
}
