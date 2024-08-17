package assesment;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import connection.Driverconnection;

public class Excle {
	String filepath;
	String Sheetname;
	
	public  Excle(String filepath,String Sheetname) {
		super();	
		this.filepath=filepath;
		this.Sheetname=Sheetname;		
	}
	public int rowcount() {
		int i=0;
		try {
			XSSFWorkbook workbook=new XSSFWorkbook(filepath);
			XSSFSheet worksheet= workbook.getSheet(Sheetname);
			i=worksheet.getPhysicalNumberOfRows();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return i;
		
	}
	public int colcount() {
		int i=0;
		try {
			XSSFWorkbook workbook=new XSSFWorkbook(filepath);
			XSSFSheet worksheet =workbook.getSheet(Sheetname);
			i=worksheet.getRow(0).getPhysicalNumberOfCells();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return i;
	}
	
	public String getData(int row ,int col) {
		String data =null;
		try {
			XSSFWorkbook workbook=new XSSFWorkbook(filepath);
			XSSFSheet worksSheet =workbook.getSheet(Sheetname);
			data=worksSheet.getRow(row).getCell(col).getStringCellValue();
			System.out.println(data);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return data;
	}
}
