package assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import connection.Driverconnection;

public class data {
	WebDriver driver;
	
	@BeforeClass
	
	public void openBrowser() {
		driver=Driverconnection.getDriver("https://demo.guru99.com/");
	}
	@Test
	public void logintest(String email) {
		System.out.println(email);
		WebElement username=driver.findElement(By.name("emailid"));
		username.sendKeys("bharat@gmail.com");
	}
	
	@DataProvider(name="dp")
	public static Object[][]data(){
		Excle ex=new Excle("C:\\Users\\meena\\OneDrive\\Documents\\test excle.xlsx", "login");
		int row =ex.rowcount();
		System.out.println("row  :"+row);
		int col=ex.colcount();
		System.out.println("col : "+col);
		
		Object obj[][]=new Object[row-1][col];
		
		for(int i=1;i<row;i++) {
			for(int j=0;j<col;j++) {
				String data=ex.getData(i,j);
				System.out.println(data+" : "+i+" : "+j);
				obj[i -1][j]=data;
				
			}
		}
		return obj;
	}
}
