package findingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElementByXPath {
	
	
	//ChromeDriver driver;
	FirefoxDriver driver; 
	
	@BeforeTest
	public void openURL()
	{
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Sources\\chromedriver.exe");
//		driver= new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Sources\\geckodriver.exe");
		driver= new FirefoxDriver();
		
		driver.navigate().to("https://www.google.com/");
	}
	
	@Test
	public void FindElementByXpath()
	{
		
//		WebElement searchTXT=driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
//		System.out.println("X Path "+searchTXT.getTagName());
		
		// firefox XPath 
		
		WebElement searchTXT=driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[1]/div/div[1]/input"));
		System.out.println("X Path "+searchTXT.getTagName());
		
	}
	
	

	@AfterTest
	public void closewebDriver()
	{

		driver.quit();
	}

}
