package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class communitysettings 
{
public WebDriver driver ;
	
	
	public communitysettings(WebDriver driver) 
	{
	this.driver=driver;
	}
	
	public  void communitysettingsinleftslide()
	{
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/a[2]")).click();
	}
	
	public void  notificationshome()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.id("notificationHome"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Element.click();
	}
	
	public void  messageHome()
	{
		driver.findElement(By.id("messageHome")).click();
	}

	public void membersGroup()
	{
		driver.findElement(By.id("membersandGroup")).click();
	}
	
	public void surveypoll()
	{
		driver.findElement(By.id("surveysandpolls")).click();
	}
	
	public void faq()
		{
			driver.findElement(By.id("faqs")).click();
		}
	
	public void enableflag1()
	{
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/input[1]")).click();
	}
	
	public void enableflag2()
	{
		driver.findElement(By.xpath("//tbody/tr[2]/td[3]/div[1]/input[1]")).click();
	}
	
	public void enableflag3()
	{
		driver.findElement(By.xpath("//tbody/tr[3]/td[3]/div[1]/input[1]")).click();
	}
	
	public void enableflag4()
	{
		driver.findElement(By.xpath("//tbody/tr[4]/td[3]/div[1]/input[1]")).click();
	}
	

	
}
