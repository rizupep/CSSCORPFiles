package src.main.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Title_Check {

	public static boolean runTest(String strSearchString, String strPageTitle) {
        boolean flag;
        // Start a browser driver and navigate to Google
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
 
        // Enter the search string and send it
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(strSearchString);
        element.submit();
        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        
        try{Thread.sleep(10000);}
        catch(Exception e){}
        // Check the title of the page
        if (driver.getTitle().equals(strPageTitle)) {
            System.out.println("Page title is " + strPageTitle + ", as expected");
            flag=true;
            
        } else {
            System.out.println("Expected page title was " + strPageTitle + ", but was " + driver.getTitle() + " instead");
            flag=false;
        }
        
        //Close the browser
        driver.quit();
        return flag;
}
	
	public static void main(String[] args) {
		 try {
			 File f=new File("d:\\TestData\\Test1.xlsx");
		        // Open the Excel file
		        FileInputStream fis = new FileInputStream("d:\\TestData\\Test1.xlsx");
		        // Access the required test data sheet
		        XSSFWorkbook wb = new XSSFWorkbook(fis);
		        XSSFSheet sheet = wb.getSheet("sheet1");
		        // Loop through all rows in the sheet
		        // Start at row 1 as row 0 is our header row
		        for(int count = 1;count<=sheet.getLastRowNum();count++){
		            XSSFRow row = sheet.getRow(count);
		            System.out.println("Running test case " + row.getCell(0).toString());
		            // Run the test for the current test data row
		            boolean test_result=runTest(row.getCell(1).toString(),row.getCell(2).toString());
		            
		            //Open outputStream
		            
		            Cell c= row.createCell(3);
		            
		            if(test_result==true)
		            {
		            	c.setCellValue("Success");
		            }
		            else
		            {
		            	c.setCellValue("Failure");
		            }
		            
		        }
		        FileOutputStream fos= new FileOutputStream("d:\\TestData\\Test1.xlsx");
		        wb.write(fos);
		        wb.close();
		        fis.close();
		    } catch (IOException e) {
		        System.out.println("Test data file not found");
		    }   
		}
	}
	
	


