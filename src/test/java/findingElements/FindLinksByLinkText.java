package findingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindLinksByLinkText {
	

	ChromeDriver driver;   // should be declared here on the class level

	@BeforeTest
	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Sources\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
	}
	
	@Test
	public void FindElementBytext()
	{
		WebElement SignedinLink= driver.findElement(By.linkText("Gmail"));
		System.out.println("signed in link = "+SignedinLink.getAttribute("href"));
	}
	
	@Test
	public void FindElementBypartialtext()
	{
		WebElement SignedinLink= driver.findElement(By.partialLinkText("Gmai"));
		System.out.println("signed in partial link = "+SignedinLink.getAttribute("href"));
	}

	@AfterTest
	public void closewebDriver()
	{

		driver.quit();
	}

}
