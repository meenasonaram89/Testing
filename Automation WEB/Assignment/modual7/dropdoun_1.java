package assiment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.Driverconnection;

public class dropdoun_1 {
	public static void main(String[] args) {
		
		String url="https://demo.guru99.com/test/newtours/register.php";
		WebDriver driver=Driverconnection.getDriver(url);
		
		
		WebElement country=driver.findElement(By.name("country"));
		country.click();
		country.sendKeys("india");	
		country.click();
		
	}
}
