package src.test.java;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void test1() throws Exception{

		WebDriver driver = new FirefoxDriver();
		driver.get("http://hdfcbank.com");
		driver.manage().window().maximize();
		
		String homepage=driver.getWindowHandle();
		
		System.out.println(homepage);
		
		System.out.println("Window before switching "+driver.getTitle());
		WebElement element = driver.findElement(By.xpath("//*[@id='loginsubmit']")); 
		element.click();
		
		/*String nextpage=driver.getWindowHandle();
		System.out.println(nextpage);*/
		
		Set<String> window_list = driver.getWindowHandles();
		
		Iterator iterator = window_list.iterator();
		String currentWindowId;
		while(iterator.hasNext())
		{
			currentWindowId = (String)iterator.next();
			System.out.println(currentWindowId);
			System.out.println(driver.getTitle());
		
		
			if(!currentWindowId.equals(homepage))
			{
			driver.switchTo().window(currentWindowId);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='wrapper']/div[6]/a/img")).click();
			}
			
			}
		}

}

