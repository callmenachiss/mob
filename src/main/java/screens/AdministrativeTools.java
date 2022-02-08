package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class AdministrativeTools 
{

public WebDriver driver ;
	
	
	public AdministrativeTools(WebDriver driver) 
	{
	this.driver=driver;
	}
	
	//AdministrativeTools-sidebar
	public  void AdminTools()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Administrative Tools')]")).click();
		/*Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();*/
		
	}
}
