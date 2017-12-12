package src.main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouse_event_demo {

	public static void main(String[] args) {
		String baseUrl = "http://newtours.demoaut.com/";
        WebDriver driver = new FirefoxDriver();
     
        WebElement userName = driver.findElement(By.name("userName"));
        
         
        Actions builder = new Actions(driver);
        Action seriesOfActions = builder.moveToElement(userName).click().keyDown(userName,Keys.SHIFT).sendKeys(userName,"hello").doubleClick(userName).contextClick(userName).build();
        		
  seriesOfActions.perform();
        
        
        //driver.quit();
        
        
	}

}
