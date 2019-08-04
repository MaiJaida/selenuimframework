package workingWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithTextBoxAndButtons {


	ChromeDriver driver;   // should be declared here on the class level

	@BeforeTest
	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Sources\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("https://login.yahoo.com/"); 
	}

	@Test
	public void SerachGoogle()
	{
		WebElement SearchTXT= driver.findElement(By.id("login-username"));
		System.out.println("search text = "+SearchTXT.getTagName());
		
		WebElement Button= driver.findElement(By.id("login-signin"));
		System.out.println("button  = "+Button.getTagName());
		
		SearchTXT.clear();
		SearchTXT.sendKeys("film");
		
		Button.click();
		System.out.println("Button is clicked ");
		
		WebElement successNotification= driver.findElement(By.id("username-error"));
		System.out.println("Message "+successNotification.getText());
		
		
		Assert.assertTrue(successNotification.getText().contains("Sorry, we don't recognize this email."));
		
	}

	@AfterTest
	public void closewebDriver()
	{
		driver.quit();
	}
}
