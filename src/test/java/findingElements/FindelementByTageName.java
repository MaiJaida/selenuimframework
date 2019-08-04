package findingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindelementByTageName {

	ChromeDriver driver;   // should be declared here on the class level

	@BeforeTest
	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Sources\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
	}


	@Test
	public void findelementbyTagName()
	{
		WebElement GmailLink= driver.findElement(By.tagName("a"));
		System.out.println("GmailLink text = "+GmailLink.getText());
		GmailLink.click();
	}


	@AfterTest
	public void closewebDriver()
	{

		driver.quit();
	}


}
