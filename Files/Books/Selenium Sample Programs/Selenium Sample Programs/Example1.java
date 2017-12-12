package src.main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example1 {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\ChromeDriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		//WebElement box = driver.findElement(By.name("myName"));
		//box.sendKeys("Selenium entered via Program");
		String title = driver.getTitle();
		String ExpectedTitle="Google";
		
		if(title.equals(ExpectedTitle))
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("Failure");
		}
		
		//String text = box.getAttribute("value");
		// Assert
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBePresentInElementValue(box,"Close"));
		*/driver.quit();
	}

}
