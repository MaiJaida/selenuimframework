package findingElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindByElementS {

	ChromeDriver driver;   // should be declared here on the class level

	@BeforeTest
	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Sources\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("https://en.wikipedia.org/wiki/Hyperlink");
	}
	
	@Test
	public void testFindelements()
	{
		// get all links displayed on the page
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		//verify that their are 20 links(for example because i donot know how many links in this page) displayed on the page
		System.out.println("how many links inside the page ? "+links.size());
		// el links size tele3 521
		Assert.assertEquals(521, links.size());
		
		// then we want to iterate through the list of links
		for(WebElement link : links) // le kol element gowa el webelement
		{
			// print all the links values
			System.out.println(link.getAttribute("href"));
		}
	}
	
	@AfterTest
	public void closewebDriver()
	{

		driver.quit();
	}
}
