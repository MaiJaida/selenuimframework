package findingElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElementInTableByTagName {
	
	ChromeDriver driver;   // should be declared here on the class level

	@BeforeTest
	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Sources\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
	}


	@Test
	public void findelementInTablebyTagName()
	{
		WebElement table= driver.findElement(By.id("customers")); // by this way i get the table then i will try to find the rows inside it
		List<WebElement> rows=table.findElements(By.tagName("tr")); // gbt element 2lly howa table w ba3dain 2oltelo ydawar 3ala el elements 2lly gowah
		System.out.println("table size = "+rows.size());
		System.out.println("trow 3 values = "+rows.get(3).getText());
	}


	@AfterTest
	public void closewebDriver()
	{

		driver.quit();
	}

}
