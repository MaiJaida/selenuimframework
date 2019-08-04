package workingWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithSubmitMethode {

	ChromeDriver driver;   // should be declared here on the class level

	@BeforeTest
	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Sources\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("https://www.google.com/"); 
	}

	@Test
	public void TestSubmit()
	{

		WebElement searchTXT=driver.findElement(By.cssSelector("input.gLFyf.gsfi"));
		searchTXT.sendKeys("selenuim");
		searchTXT.submit();
	}

	@AfterTest
	public void closewebDriver()
	{
		driver.quit();
	}


}
