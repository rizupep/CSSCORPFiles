package src.main.java;

import java.io.File;

import java.io.FileInputStream;
 
import java.io.IOException;
 
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
 
import org.apache.poi.ss.usermodel.Row;
 
import org.apache.poi.ss.usermodel.Sheet;
 
import org.apache.poi.ss.usermodel.Workbook;
 
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Poi_demo {

	public void readExcel(String filepath , String filename , String sheetname) throws IOException
	{
		File f=new File(filepath+"\\"+filename );
		FileInputStream is= new FileInputStream(f);
		Workbook wb=null;
		String file_ext = filename.substring(filename.indexOf("."));
		if(file_ext.equals(".xlsx"))
		{
			wb = new XSSFWorkbook(is);
		}
		else
		{
			wb= new HSSFWorkbook(is);
		}
		Sheet s1= wb.getSheet(sheetname);
		int rowcount = s1.getLastRowNum() - s1.getFirstRowNum();
		for(int i=0;i <=rowcount;i++)
		{
			Row row=s1.getRow(i);
			
			for(int j=0;j< row.getLastCellNum();j++)
			{
				System.out.println(row.getCell(j).getStringCellValue()+"||");
			}
			System.out.println();
		}
		wb.close();
		
	}
	
	public static void main(String[] args) throws IOException {
		//C:\Users\css100079\workspace\Selenium_samples\src\src\main\java
		String filepath= System.getProperty("user.dir")+"\\src\\src\\main\\java";
		Poi_demo obj=new Poi_demo();
		obj.readExcel(filepath,"Test_data.xlsx","data");

	}

}
