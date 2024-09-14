package Project_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import connection.Driverconnection;

public class ALL_OtherFunction {

	static WebDriver driver = null;

	@BeforeClass
	public static void OpenBrowser() {
		System.out.println("Open Browser");

		String url = "https://careercenter.tops-int.com/";
		driver = Driverconnection.getDriver(url);
		System.out.println("connect");
	}

	@Test(priority = 1)
	public void login() throws InterruptedException {
		System.out.println("login");
		WebElement mobile = driver.findElement(By.id("mobile"));
		mobile.sendKeys("8980868840");

		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("Sona@123");
		Thread.sleep(2000);
		driver.findElement(By.id("eye-icon")).click();

		WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
		btn.click();

	}
		@Test(priority = 2)
		public void test() throws InterruptedException {
			System.out.println("resume buldir");
			Thread.sleep(3000);
			WebElement resume=driver.findElement(By.linkText("Resume Builder"));
			resume.click();
			
			Thread.sleep(2000);
			
			JavascriptExecutor js = (JavascriptExecutor)driver;

			WebElement btn = driver.findElement(By.name("files[]"));
			js.executeScript("arguments[0].scrollIntoView();", btn);
			
			Thread.sleep(1000);
			btn.sendKeys("C:\\Users\\meena\\Downloads\\meena sonaram CV. (1) (1).pdf");
			 
			Thread.sleep(2000);
			
			WebElement sbtn=driver.findElement(By.id("resumeFileSubmit"));
			sbtn.click();
			
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			
			Thread.sleep(3000);
			
			js.executeScript("window.scrollBy(0,-1550)", "");
			
			Thread.sleep(3000);
		}
		@Test(priority = 3)
		public void jobTracker() throws InterruptedException {
			System.out.println("jobTracker");
			
			
			WebElement job=driver.findElement(By.linkText("Job Tracker"));
			job.click();
			
			Thread.sleep(2000);

			JavascriptExecutor js = (JavascriptExecutor)driver;

			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

			Thread.sleep(3000);
		}
		@Test(priority = 4)
		public void uplod() throws InterruptedException {
			System.out.println("uplod");
			
			JavascriptExecutor js = (JavascriptExecutor)driver;

			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,-1550)", "");
			
			Thread.sleep(3000);
		}
		@Test(priority = 5)
		public void rewards() throws InterruptedException {
			System.out.println("rewards");
			WebElement refers=driver.findElement(By.linkText("Rewards"));
			refers.click();
			
			Thread.sleep(2000);
			
			JavascriptExecutor js = (JavascriptExecutor)driver;

			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(3000);
			
			js.executeScript("window.scrollBy(0,-1550)", "");
			
			Thread.sleep(3000);
		}
		
		@Test(priority = 6)
		public void event() throws InterruptedException {
			System.out.println("event");
			WebElement even=driver.findElement(By.linkText("Events"));
			even.click();
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor)driver;

			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(3000);
			
			js.executeScript("window.scrollBy(0,-1550)", "");
			
			Thread.sleep(3000);
			
			
			
		}
		@Test(priority = 7)
		public void locatoion() throws InterruptedException {
			System.out.println("location");
			
			WebElement loca=driver.findElement(By.linkText("TOPS Centers"));
			loca.click();
			
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor)driver;

			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(3000);
			
			js.executeScript("window.scrollBy(0,-1550)", "");
			
			Thread.sleep(3000);
			WebElement home=driver.findElement(By.linkText("Home"));
			home.click();
		}
}
