package TestCases;

// Imported all the necessary packages to reduce the dependency...

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import screens.AdministrativeTools;
import screens.Loginpage;
import screens.TakeScreenshot;
import screens.driverselector;
import screens.sleepclass;

public class UIAdminToolsLoadingbasisUserPrivileges3731 
{

	// Global Initialization for WebDriver 
	
    public static WebDriver driver;
    
    // Global variable Initialization for Logger
    
	private static Logger log; 
	
	@BeforeMethod	
	public void start() throws Exception
	{
		 log = LogManager.getLogger(UIAdminToolsLoadingbasisUserPrivileges3731.class);
		 log.info("Execution starts to validate the Administrator Tools options of UI");
	}
	 
	
	@SuppressWarnings("static-access")
	@Test 
	public void UIAdminToolsLoadingbasisUserPrivilegesPC3731() throws Exception
	{
		
		log.info("Driver Selection to perform web Automation");
		
		// Chrome driver Initialization
		System.setProperty("webdriver.chrome.driver","E:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://collaborationdevi.premierinc.com/");
		driver.manage().window().maximize();
		log.info("Chrome browser selection to perform web Automation");
		sleepclass sleep = new sleepclass(driver);
		sleep.waitminimum();		
		TakeScreenshot shot = new TakeScreenshot(driver);		
		Loginpage login = new Loginpage(driver);
		AdministrativeTools admin = new AdministrativeTools(driver);
		login.usernamefield();
		sleep.waitminimum();
		shot.takeScreenShot("Username");
		log.info("Enter the Username");
		login.nextbtnclick();
		sleep.waitminimum();
		shot.takeScreenShot("Password");
		log.info("Enter the Password");
		login.passwordfield();
		sleep.waitminimum();
		shot.takeScreenShot("Sign-In");
		log.info("Click on Sign-In Button");
		login.sigininbutton();
		sleep.waitminimum();
		log.info("User Successfully login in our Application...");	
		sleep.waitminimum();
		admin.AdminTools();
		shot.takeScreenShot("AdministrativeTools");
		log.info("Click on AdministrativeTools in the sidebar");
		log.info("UIAdminToolsLoadingbasisUserPrivileges3731 Executed Successfully");
		sleep.waitminimum();
		driver.close();
		
	}
}
