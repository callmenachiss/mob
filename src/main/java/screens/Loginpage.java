package screens;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Loginpage 
{
	
	public WebDriver driver ;
	
		
	public Loginpage(WebDriver driver) 
	{
	this.driver=driver;
	}
	
	public void Screenshot() throws Exception
	{
	//take screenshot of the page
		
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C:/eclipse-workspace/AdminPortal/screenshots/image.png"));
	
	}
	
	
	public  void usernamefield()
	{
		driver.findElement(By.xpath("//input[@id='identifier']")).sendKeys("chope");
	}
	
	public  void nextbtnclick()
	{
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).click();
	}
	
	
	public  void passwordfield()
	{
		    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Premier1");
		    
    }

	public void sigininbutton()
	{
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).click();
        
	}
	
	
	public void discussionhome()
	{
		WebDriverWait wait = new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("discussionHome")));
		WebElement discussion = driver.findElement(By.id("discussionHome"));
		if(discussion.isDisplayed())
		{
			discussion.click();	
			
		}
		else
		{
			System.out.println("Not able to find the Elements");
		}
	   // driver.findElement(By.id("discussionHome")).click();
	   
	}
	
	public void premier_icon()
	{
		driver.findElement(By.cssSelector("image[id='logomark']")).click();
	}
	
	public void premier_logo()
	{
		driver.findElement(By.xpath("//div[contains(text(),'Collaboration')]")).click();
	}
	
	public void notifications_header()
	{
		driver.findElement(By.xpath("//header/div[2]/nav[1]/button[1]")).click();
	}
	
	public void menu_header()
	{
		driver.findElement(By.xpath("//header/div[2]/nav[2]/button[1]")).click();
	}
	
	public void community_sidebar() throws Exception
	{
		
		driver.findElement(By.xpath("//div[contains(text(),'Communities')]")).click();
		/*WebElement com = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/nav[1]/div[1]"));
		if(com.isDisplayed())
		{
			com.click();
		}
		else
		{
			Thread.sleep(4000);
			com.click();
		}*/
	}
	
	public void community_selection() throws Exception
	{
		WebElement com_sel = driver.findElement(By.xpath("//div[contains(text(),'Ab Initio Center of Excellence')]"));
		if(com_sel.isDisplayed())
		{
			com_sel.click();
		}
		else
		{
			Thread.sleep(4000);
			com_sel.click();
		}
	}
	
	public void discussion_subtab()
	{
		driver.findElement(By.xpath("//span[contains(text(),'Discussion')]")).click();
	}
	
	public void textfield()
	{
	    driver.findElement(By.tagName("textarea")).sendKeys("Welcome to our Hospital - Post created by Automation Script");                          
	
	}
	
	public void image_textfield()
	{

		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")).sendKeys("Welcome to our Hospital");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("E:\\nkaruppi\\45.jpg");
				
    }
	
	public void multipleimage() 
	{
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")).sendKeys("Welcome to our Hospital");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("E:\\nkaruppi\\1.jpg");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("E:\\nkaruppi\\45.jpg");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("E:\\nkaruppi\\123.jpg");			
	}
	
	public void https_protocol()
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("textarea")));
		driver.findElement(By.tagName("textarea")).sendKeys("https://code.premierinc.com/issues/browse/PC-3736");
	}
	
	public void http_protocol()
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("textarea")));
		driver.findElement(By.tagName("textarea")).sendKeys("http://www.umsl.edu/~siegelj/newcourse/part1");
	}
	
	public void sameurl_protocol()
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("textarea")));
		driver.findElement(By.tagName("textarea")).sendKeys("https://collaborationdevi.premierinc.com/community/f3bb4770-67f6-460b-ba5a-ed786e91193b/discussion");
	}
	
	public void text_http_protocol()
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("textarea")));
		driver.findElement(By.tagName("textarea")).sendKeys("testing the http protocol: http://www.umsl.edu/~siegelj/newcourse/part1");
	}
	
	public void text_https_protocol()
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("textarea")));
		driver.findElement(By.tagName("textarea")).sendKeys("testing the https protocol: https://code.premierinc.com/issues/browse/PC-3736");
	}
	
	public void multipleurl_protocol()
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("textarea")));
		driver.findElement(By.tagName("textarea")).sendKeys("https://www.google.com & https://www.facebook.com & https://www.rediff.com/");
	}
	
	public void text_multipleurl_protocol()
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("textarea")));
		driver.findElement(By.tagName("textarea")).sendKeys("url: https://www.google.com & https://www.facebook.com & https://www.rediff.com/");
	}
	
	public void ftp_protocol()
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("textarea")));
		driver.findElement(By.tagName("textarea")).sendKeys("ftp://internet.address.edu/file/path/file.txt");
	}
	
	public void post_controls()
	{
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]")).click();
	}
	public void postbutton() throws Exception
	{
		WebElement post =driver.findElement(By.xpath("//button[@type='submit']"));
		if(post.isDisplayed())
		{
			post.click();
		}
		else
		{
			 
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,60)", "");
			  post.click();
			  	 
		}
		
	}
	
	public void screen_scroll() throws Exception
	{
		 Thread.sleep(800);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,430)", "");
	}
	
	public void messeage_icon()
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Open Messenger']")));
		driver.findElement(By.xpath("//button[@aria-label='Open Messenger']")).click();
	}
	
	public void updatebutton()
	{
		driver.findElement(By.xpath("//span[contains(text(),'Update')]")).click();
	}
	
	public void deletebutton()
	{
		driver.findElement(By.xpath("//span[contains(text(),'Delete')]")).click();
	}
	
	public void confirmbutton()
	{
		driver.findElement(By.xpath("//span[contains(text(),'Confirm')]")).click();
	}
	
	
	public void images_button() throws Exception 
	{
		WebElement image = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/button[2]"));
		                                                
		if(image.isDisplayed())
		{
			image.click();
		}
		else
		{
			Thread.sleep(4000);
			image.click();
		}
	}
	
		
	
	
	

	public void editbutton()
	{
		driver.findElement(By.xpath("//span[contains(text(),'Edit')]")).click();
	}
	
	public void editedtextfield()
	
	{
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/textarea[1]")).sendKeys("Thank you!");
	}
	
	public void enterkey()
	{
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
	}
	
	
	public void footer_content()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,90)", "");
		
		/*WebElement policy =driver.findElement(By.linkText("Privacy Policy"));
		if(policy.isDisplayed())
		{
			
			
		}
		else
		{
			 
			  JavascriptExecutor js1 = (JavascriptExecutor) driver;
			  js1.executeScript("window.scrollBy(0,60)", "");
			  			  	 
		}*/
		
	}
	
	
	
}

