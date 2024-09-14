package Project_Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import connection.Driverconnection;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class Cource_Details {

	static WebDriver driver = null;

	@BeforeClass
	public static void OpenBrowser() {
		System.out.println("login");

		String url = "https://careercenter.tops-int.com/";
		driver = Driverconnection.getDriver(url);
		System.out.println("connect");
	}

	@Test(priority = 1)
	public void login() throws InterruptedException {
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
	public void Diploma() throws InterruptedException {
		System.out.println("cource details");

		driver.findElement(By.linkText("Diploma In Software Testing And Automation")).click();

		WebElement cd = driver.findElement(By.linkText("Course Details"));
		cd.click();
		Thread.sleep(2000);

		WebElement lacture = driver.findElement(By.linkText("Lecture Flow"));
		lacture.click();

		Thread.sleep(2000);
		WebElement book = driver.findElement(By.xpath("//i[@class='fa-solid fa-book me-2']"));
		book.click();

		Thread.sleep(5000);

		WebElement project = driver.findElement(By.linkText("View Project"));
		project.click();
		Thread.sleep(2000);

		WebElement downloadfile = driver.findElement(By.linkText("Download Files"));
		downloadfile.click();
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		Thread.sleep(3000);

		driver.navigate().back();

		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,800)", "");
		Thread.sleep(2000);

		WebElement assiment = driver.findElement(By.linkText("View All"));
		assiment.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);

		WebElement Assesment = driver.findElement(By.linkText("View All"));
		Assesment.click();
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		WebElement Interview = driver.findElement(By.linkText("View All"));
		Interview.click();
		Thread.sleep(2000);
		WebElement filedoun=driver.findElement(By.linkText("Download File"));
		filedoun.click();
		Thread.sleep(2000);
		WebElement filedoun1=driver.findElement(By.linkText("Download File"));
		filedoun1.click();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,500)", "");
		WebElement filedoun2=driver.findElement(By.linkText("Download File"));
		filedoun2.click();
		
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		Thread.sleep(3000);

		WebElement feedback = driver.findElement(By.linkText("Share Your Feedback"));
		feedback.click();

		Thread.sleep(2000);
		WebElement close = driver.findElement(By.xpath("//*[@id=\"moduleFeedbackModal\"]/div/div/div/div[1]/div/div[2]/button"));
		close.click();

		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-1500)", "");

		Thread.sleep(2000);

	}

	@Test(priority = 3)
	public void attendance() throws InterruptedException {
		System.out.println("Attendance");
		WebElement atten = driver.findElement(By.id("course-attendance-tab"));
		atten.click();
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0,-5500)", "");
		Thread.sleep(2000);
	}

	
	  @Test(priority = 4) public void Account() throws InterruptedException {
	  System.out.println("ac");
	 
	  WebElement ac = driver.findElement(By.id("course-accounts-tab")); ac.click();
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver; Thread.sleep(2000);
	  
	  WebElement recipt = driver .findElement(By.xpath(
	  "//*[@id=\"course-accounts\"]/div/div[1]/div[3]/div[5]/span/a"));
	  recipt.click();
	  
	  Thread.sleep(3000);
	  
	  js.executeScript("window.scrollBy(0,600)", ""); Thread.sleep(3000);
	  
	  WebElement recipt1=driver.findElement(By.xpath( "//*[@id=\"course-accounts\"]/div/div[1]/div[4]/div[5]/span/a"));
	  recipt1.click(); Thread.sleep(2000);
	  
	  WebElement recipt2=driver.findElement(By.xpath("//*[@id=\"course-accounts\"]/div/div[1]/div[5]/div[5]/span/a"));
	  recipt2.click(); Thread.sleep(2000);
	  
	 WebElement recipt3=driver.findElement(By.xpath("//*[@id=\"course-accounts\"]/div/div[1]/div[6]/div[5]/span/a"));
	  recipt3.click(); Thread.sleep(2000);
	 
	  WebElement recipt4=driver.findElement(By.xpath("//*[@id=\"course-accounts\"]/div/div[1]/div[7]/div[5]/span/a"));
	  recipt4.click(); Thread.sleep(2000);
	  
	  WebElement recipt5=driver.findElement(By.xpath( "//*[@id=\"course-accounts\"]/div/div[1]/div[8]/div[5]/span/a"));
	  recipt5.click(); Thread.sleep(3000);
	  
	  js.executeScript("window.scrollBy(0,-5500)", ""); Thread.sleep(3000); 
	  }
	 


	@Test(priority = 5)
	public void recoardlecture() throws InterruptedException {
		System.out.println("recoardlecture");

		WebElement recorded = driver.findElement(By.id("course-recorded-lectures-tab"));
		recorded.click();

		Thread.sleep(3000);

		WebElement refer1c = driver.findElement(By.linkText("Reference - 1"));
		refer1c.click();
		Thread.sleep(3000);
//		String mainWin = driver.getWindowHandle(); dont clear
//		System.out.println(mainWin);
//		Set<String> allWin = driver.getWindowHandles();
//		for (String s : allWin) {
//			if (!s.equals(mainWin)) {
//				driver.switchTo().window(s);
//				driver.close(); don't comment remove
//			}
//}

	}

	@Test(priority = 6)
	public void report() throws InterruptedException {
		System.out.println("report");
		WebElement progress = driver.findElement(By.xpath("//*[@id=\"course-progress-report-tab\"]"));
		progress.click();
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0,-5500)", "");
		Thread.sleep(2000);
	}

	
}
