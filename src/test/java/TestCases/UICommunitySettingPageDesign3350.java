package TestCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import screens.Loginpage;
import screens.TakeScreenshot;
import screens.communitysettings;
import screens.sleepclass;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class UICommunitySettingPageDesign3350 
{
    public static WebDriver driver;
    
	private static Logger log; 
	
	@BeforeMethod	
	public void start() throws Exception
	{
		 log = LogManager.getLogger(UICommunitySettingPageDesign3350.class);
		 log.info("Execution starts");
	}
	 
	@SuppressWarnings("static-access")
	@Test 
	public void UICommunitySettingPageDesignPC3350() throws Exception
	{
		
		log.info("User is come back to Profile options page");
		System.setProperty("webdriver.chrome.driver","E:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://collaborationdevi.premierinc.com/");
		driver.manage().window().maximize();
		sleepclass sleep = new sleepclass(driver);
		sleep.waitminimum();
		TakeScreenshot shot = new TakeScreenshot(driver);
		communitysettings settings = new communitysettings(driver);
		shot.takeScreenShot("abcd");
		Loginpage login = new Loginpage(driver);		
		login.usernamefield();
		sleep.waitminimum();
		shot.takeScreenShot("abcd");
		login.nextbtnclick();
		sleep.waitminimum();
		shot.takeScreenShot("abcd");
		login.passwordfield();
		sleep.waitminimum();
		shot.takeScreenShot("abcd");
		login.sigininbutton();
		/*sleep.waitminimum();
		shot.takeScreenShot("abcd");
		sleep.waitminimum();
		settings.communitysettingsinleftslide();
		sleep.waitminimum();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1300)");
		log.info("Handle the scroll view");
		login.discussionhome();
		sleep.waitminimum();
		shot.takeScreenShot("abcd");
		settings.notificationshome();
		sleep.waitminimum();
		shot.takeScreenShot("abcd");
		log.info("User is click on Messages Features");
		settings.messageHome();
		sleep.waitminimum();
		log.info("User is click on the Enabled flag options in UI");
		settings.membersGroup();
		sleep.waitminimum();
		shot.takeScreenShot("abcd");
		settings.surveypoll();
		sleep.waitminimum();
		shot.takeScreenShot("abcd");
		settings.faq();
		sleep.waitminimum();
		shot.takeScreenShot("abcd");
		settings.enableflag1();
		sleep.waitminimum();
		settings.enableflag2();
		sleep.waitminimum();
		shot.takeScreenShot("abcd");
		settings.enableflag3();
		sleep.waitminimum();
		settings.enableflag4();
		sleep.waitminimum();
		shot.takeScreenShot("abcd");*/
		log.info("User is in end loop");		
		log.info("Execution Ends");		
        driver.close();
	}
	
	
}
