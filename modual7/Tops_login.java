package Assiment;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import connection.Driverconnection;
public class Tops_login {
	static WebDriver driver=null;
	@BeforeTest
	public  void  openBrowser() {
		String url="https://careercenter.tops-int.com/";
	 driver=Driverconnection.getDriver(url);
	}
		
	@Test
		public  void logintest() {
		WebElement emailEle=driver.findElement(By.id("mobile"));
		emailEle.sendKeys("8980868840");
		
		WebElement passEle=driver.findElement(By.id("password"));
		passEle.sendKeys("Sona@123");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
		@AfterTest
		public  void closeBrowser() throws InterruptedException {
			Thread.sleep(5000);
			driver.quit();
		}
	
	}

