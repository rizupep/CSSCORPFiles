package src.main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Partial_Links_demo {

	public static void main(String[] args) {
		    
	        
	       new Partial_Links_demo().partial_link_search();

	}
	
	public void partial_link_search()
	 {
		 String baseUrl = "file:///D:/examplehtmls/examplelinks2.html";
	     WebDriver driver = new FirefoxDriver();
	     driver.get(baseUrl);
	     driver.findElement(By.partialLinkText("HERE")).click();
	     System.out.println(driver.getTitle());
	 }
	
 public void link_search()
 {
	 String baseUrl = "file:///D:/examplehtmls/examplelinks.html";
     WebDriver driver = new FirefoxDriver();
     driver.get(baseUrl);
     driver.findElement(By.linkText("click here")).click();
     System.out.println(driver.getTitle());
 }
}
