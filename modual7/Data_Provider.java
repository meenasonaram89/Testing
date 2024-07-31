package Assiment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import connection.Driverconnection;

public class Data_Provider {
	static WebDriver driver=null;
	@BeforeClass
	public static void Open() {
			driver=Driverconnection.getDriver("https://www.instagram.com/");
			
	}
	
	@Parameters("dp")
	@Test(dataProvider = "dp")
	public void test(String username,String password) throws InterruptedException {
		WebElement user=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"));
		user.clear();
		user.sendKeys(username);
		user.clear();

		WebElement pass=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input"));
		pass.clear();
		pass.sendKeys(password);
		pass.clear();

	}
	@DataProvider(name="dp")
	public static Object[][]data() throws InterruptedException{
		Object [][]obj=new Object[4][2];
		
		obj[0][0]="tushar_45";
		obj[0][1]="Tushar@123";
		
		Thread.sleep(3000);

		obj[1][0]="tushar_45";
		obj[1][1]="Tushar@1";
		
		Thread.sleep(3000);

		obj[2][0]="tushar_40";
		obj[2][1]="Tushar@123";

		Thread.sleep(3000);

		obj[3][0]="tushar_";
		obj[3][1]="Tushar@";
		
		return obj;
	}
}
