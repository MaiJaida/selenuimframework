package findingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElementByID {

	ChromeDriver driver;   // should be declared here on the class level

	@BeforeTest
	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Sources\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("https://www.youtube.com/");
	}

	@Test
	public void findelementbyID()
	{
		// the below code should be srounded by try and catch because if this element is not founded an exception will be thrown
		try
		{
			WebElement searchboxTXT=driver.findElement(By.id("search")); // find element by id
			//WebElement searchboxTXT=driver.findElement(By.name("search_query"));  find element by name
			WebElement searchButton=driver.findElement(By.className("style-scope ytd-searchbox"));  // find element by class name
			System.out.println("text box location = "+searchboxTXT.getLocation());
			System.out.println("search button location = "+searchButton.getLocation());
		}
		catch (NoSuchElementException e) {
			System.out.println("the element is not found");
		}
	}

	@AfterTest
	public void closewebDriver()
	{

		driver.quit();
	}

}
