package assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.Driverconnection;

public class edit {
		public static void main(String[] args) throws InterruptedException {
			String url="https://demoqa.com/webtables";
			WebDriver driver=Driverconnection.getDriver(url);
			
			WebElement edit=driver.findElement(By.id("edit-record-1"));
			edit.click();
			
			WebElement fname=driver.findElement(By.id("firstName"));
			fname.clear();
			fname.sendKeys("mahipal");
			
			WebElement lname=driver.findElement(By.id("lastName"));
			lname.clear();
			lname.sendKeys("malaviya");
			
			WebElement ename=driver.findElement(By.id("userEmail"));
			ename.clear();
			ename.sendKeys("mahipal@gmail.com");
			
			WebElement age=driver.findElement(By.id("age"));
			age.clear();
			age.sendKeys("26");
			
			WebElement sname=driver.findElement(By.id("salary"));
			sname.clear();
			sname.sendKeys("10000");
			
			WebElement dep=driver.findElement(By.id("department"));
			dep.clear();
			dep.sendKeys("purchase");
			
			WebElement btn=driver.findElement(By.id("submit"));
			btn.click();
				
			Thread.sleep(3000);
			
			
			
			WebElement edit1=driver.findElement(By.id("edit-record-2"));
			edit1.click();
			
			WebElement fname1=driver.findElement(By.id("firstName"));
			fname1.clear();
			fname1.sendKeys("prem");
			
			WebElement lname1=driver.findElement(By.id("lastName"));
			lname1.clear();
			lname1.sendKeys("mali");
			
			WebElement ename1=driver.findElement(By.id("userEmail"));
			ename1.clear();
			ename1.sendKeys("premmali@gmail.com");
			
			WebElement age1=driver.findElement(By.id("age"));
			age1.clear();
			age1.sendKeys("22");
			
			WebElement sname1=driver.findElement(By.id("salary"));
			sname1.clear();
			sname1.sendKeys("20000");
			
			WebElement dep1=driver.findElement(By.id("department"));
			dep1.clear();
			dep1.sendKeys("Despatch");
			
			WebElement btn1=driver.findElement(By.id("submit"));
			btn1.click();
				
			Thread.sleep(3000);
			
			
			WebElement edit2=driver.findElement(By.id("edit-record-3"));
			edit2.click();
			
			WebElement fname2=driver.findElement(By.id("firstName"));
			fname2.clear();
			fname2.sendKeys("aniket");
			
			WebElement lname2=driver.findElement(By.id("lastName"));
			lname2.clear();
			lname2.sendKeys("patil");
			
			WebElement ename2=driver.findElement(By.id("userEmail"));
			ename2.clear();
			ename2.sendKeys("ani@gmail.com");
			
			WebElement age2=driver.findElement(By.id("age"));
			age2.clear();
			age2.sendKeys("20");
			
			WebElement sname2=driver.findElement(By.id("salary"));
			sname2.clear();
			sname2.sendKeys("15000");
			
			WebElement dep2=driver.findElement(By.id("department"));
			dep2.clear();
			dep2.sendKeys("Electronic");
			
			WebElement btn2=driver.findElement(By.id("submit"));
			btn2.click();
				
			
//			delete
			
			WebElement delete=driver.findElement(By.id("delete-record-1"));
			delete.click();
			
			Thread.sleep(2000);
			
			WebElement delete1=driver.findElement(By.id("delete-record-2"));
			delete1.click();
			Thread.sleep(2000);

			
			WebElement delete2=driver.findElement(By.id("delete-record-3"));
			delete2.click();
		}
		
}
