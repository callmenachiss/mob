package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;


public class Signinpage 
{
	public  AppiumDriver<WebElement> driver ;
	public Signinpage(AppiumDriver<WebElement> driver) 
	{
	this.driver=driver;
	}
	
	public String splashscreenname() throws Exception
	{
		
		String var = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView")).getText();
	
		System.out.println(var+" page");
	    return var;
		
	}
	
	public void splashscreenbuttonclick()
	{
		
		//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView")).click();
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView")).click();
	}
	
	public  void nextbuttonclick()
	{
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button")).click();
	}
	
	public  void chromebtn1()
	{
		driver.findElement(By.id("com.android.chrome:id/terms_accept")).click();
	}
	
	public  void chromebtn2()
	{
		driver.findElement(By.id("com.android.chrome:id/negative_button")).click();
	}
	
	public  void usernamebtn()
	{
		driver.findElement(By.className("android.widget.EditText")).sendKeys("chope");
	}
	
	public  void passwordbtn()
	{
		driver.findElement(By.className("android.widget.EditText")).sendKeys("Premier1");
	}
	
	public  void signinbtnclick()
	{
		driver.findElement(By.className("android.widget.Button")).click();
	}
	
	
	
}
