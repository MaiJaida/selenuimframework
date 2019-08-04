package findingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBrowserCommands {
	
	ChromeDriver driver;   // should be declared here on the class level

	@BeforeTest
	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Sources\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/"); 
	}
	
	@Test
	public void testBrowserCommand()
	{
		driver.navigate().to("https://mail.google.com/mail/u/0/?tab=wm&ogbl");
		System.out.println("navigate to URL "+driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println("back to URL "+driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println("forward to URL "+driver.getCurrentUrl());
		driver.navigate().refresh();
		System.out.println("refresh to URL "+driver.getCurrentUrl());
	}
	
	@AfterTest
	public void closewebDriver()
	{
		//driver.quit();
	}

}
