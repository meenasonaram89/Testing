package basic1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class DriverScript {
	 WebDriver driver;
	    ActionKeywords actionKeywords = new ActionKeywords();

	    public void executeTestCase(String filePath) throws IOException {
	        FileInputStream file = new FileInputStream(filePath);
	        Workbook workbook = new XSSFWorkbook(file);
	        org.apache.poi.ss.usermodel.Sheet sheet =   workbook.getSheetAt(0);

	        for (Row row :sheet) {
	            String testCase = row.getCell(0).getStringCellValue();
	            String keyword = row.getCell(1).getStringCellValue();
	            String locatorType = row.getCell(2).getStringCellValue();
	            String locatorValue = row.getCell(3).getStringCellValue();
	            String data = row.getCell(4).getStringCellValue();

	            executeAction1(keyword, locatorType, locatorValue, data);
	        }

	        workbook.close();
	        file.close();
	    }

		private void executeAction1(String keyword, String locatorType, String locatorValue, String data) {
			// TODO Auto-generated method stub
			
		}
		private void executeAction(String keyword, String locatorType, String locatorValue, String data) {
	        switch (keyword) {
	            case "openBrowser":
	                actionKeywords.openBrowser(data);
	                break;
	            case "navigateTo":
	                actionKeywords.navigateTo(data);
	                break;
	            case "click":
	                actionKeywords.click(locatorType, locatorValue);
	                break;
	            case "enterText":
	                actionKeywords.enterText(locatorType, locatorValue, data);
	                break;
	            case "closeBrowser":
	                actionKeywords.closeBrowser();
	                break;
	        }
	    }

}
