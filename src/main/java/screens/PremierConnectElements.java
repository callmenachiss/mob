package screens;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class PremierConnectElements 
{

    public WebDriver driver ;
    
	public PremierConnectElements(WebDriver driver) 
	{
	this.driver=driver;
	}
	
	
	
	public  void premier_icon()
	{
		//driver.findElement(By.id("logomark")).click();
		driver.findElement(By.xpath("//header/div[1]/div[2]/a[1]/img[1]")).click();
	}
	
	public  void premier_logo()
	{
		//driver.findElement(By.id("wordmark")).click();
		driver.findElement(By.xpath("//h2[contains(text(),'PremierConnect')]")).click();
	}
	
	public void news_header()
	{
		driver.findElement(By.xpath("//a[contains(text(),'News')]")).click();
	}
	
	public void resources_header()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Resources')]")).click();
	}
	
	public void help_header() throws Exception
	{
		String parent = driver.getWindowHandle();		
		
		driver.findElement(By.xpath("//header/div[2]/a[1]/*[1]")).click();
		
		
		Set<String> allwindows = driver.getWindowHandles();
			
		for(String child:allwindows)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				sleepclass.waitminimum();
				driver.switchTo().window(child);
				driver.close();
			}
		}
		
		sleepclass.waitminimum();
		driver.switchTo().window(parent);
	}
	

	
	
	public void privacy_policy_link() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		sleepclass.waitminimum();
		
	    String parent = driver.getWindowHandle();	
		
	    driver.findElement(By.linkText("Privacy Policy")).click();
		
		Set<String> allwindows = driver.getWindowHandles();
			
		for(String child:allwindows)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				sleepclass.waitminimum();
				driver.switchTo().window(child);
				File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("C:/eclipse-workspace/AdminPortal/screenshots/Privacy-Policy Page.png"));
				driver.close();
			}
		}
		
		sleepclass.waitminimum();
		driver.switchTo().window(parent);
	}
	
}
