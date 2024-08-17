package assiment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.Driverconnection;

public class P05_Alert {
	public static void main(String[] args) throws InterruptedException {
		String url="https://demoqa.com/alerts";
		WebDriver driver=Driverconnection.getDriver(url);
		
		
//			1.Alert 
			WebElement btn= driver.findElement(By.id("alertButton"));
			btn.click();
			Alert alert=driver.switchTo().alert();
			Thread.sleep(2000);
			alert.accept();
			Thread.sleep(5000);
			
			//2.5 secondtime alert
			WebElement btn1=driver.findElement(By.id("timerAlertButton"));
			btn1.click();
			Thread.sleep(5000);
			Alert alert1=driver.switchTo().alert();
			alert1.accept();
			Thread.sleep(5000);
			
//			3. yes and cancle Aleart
			WebElement btn2=driver.findElement(By.id("confirmButton"));
			btn2.click();
			Alert alert2=driver.switchTo().alert();
			alert2.dismiss();
			Thread.sleep(5000);

			
//			4. comment pass Alert
			WebElement btn3=driver.findElement(By.id("promtButton"));
			btn3.click();
			Thread.sleep(2000);
			Alert alert3=driver.switchTo().alert();
			alert3.sendKeys("tushar");
			alert3.accept();	
			
	} 
	
	
}
