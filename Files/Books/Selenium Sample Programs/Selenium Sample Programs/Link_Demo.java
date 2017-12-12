package src.main.java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//String baseUrl = "http://newtours.demoaut.com/";
public class Link_Demo {

	public static void main(String[] args) {
		     //String baseUrl = "http://newtours.demoaut.com/";
		String baseUrl = "http://www.google.com";
	        WebDriver driver = new FirefoxDriver();
	        //String underConsTitle = "Under Construction: Mercury Tours";
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        driver.get(baseUrl);
	        
	        List<WebElement> linkElements = driver.findElements(By.tagName("a"));
	        String[] linkTexts = new String[linkElements.size()];
	        int i = 0;
	      //extract the link texts of each link element
	        for (WebElement e : linkElements) {
	            linkTexts[i] = e.getText();
	            System.out.println(linkTexts[i]);
	            i++;
	        }
	        
	      //test each link
	        for (String t : linkTexts) {
	        	driver.findElement(By.linkText(t)).click();
	        	/*if (driver.getTitle().equals(underConsTitle)) {
	                System.out.println("\"" + t + "\""
	                        + " is under construction.");
	            } else {
	                System.out.println("\"" + t + "\""
	                        + " is working.");
	            }*/
	        	System.out.println(driver.getTitle());
	            driver.navigate().back();
	        }
	        driver.quit();
	}
}

