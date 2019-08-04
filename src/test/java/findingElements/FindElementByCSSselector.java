package findingElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElementByCSSselector {
	
	ChromeDriver driver;   // should be declared here on the class level

	@BeforeTest
	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Sources\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
	}


	@Test
	public void findelementbyByCssSelector()
	{
		WebElement button=driver.findElement(By.cssSelector("input.gNO89b"));
	
		System.out.println("button text value = "+button.getTagName());
		System.out.println("button location = "+button.getLocation());
	}


	@AfterTest
	public void closewebDriver()
	{

		driver.quit();
	}

}
