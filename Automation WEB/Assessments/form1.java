package assesment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import connection.Driverconnection;

public class form1 {
			
		public static void main(String[] args) throws InterruptedException {
			String url = " https://demoqa.com/automation-practice-form";
			WebDriver driver = Driverconnection.getDriver(url);

			WebElement Firstname = driver.findElement(By.id("firstName"));
			Firstname.click();
			Firstname.sendKeys("bharat");

			WebElement Lastname = driver.findElement(By.id("lastName"));
			Lastname.click();
			Lastname.sendKeys("meena");

			WebElement Email = driver.findElement(By.id("userEmail"));
			Email.click();
			Email.sendKeys("bharat@gmail.com");

			WebElement Female = driver.findElement(By.className("custom-control-label"));
			Female.click();

			WebElement mobile = driver.findElement(By.id("userNumber"));
			mobile.click();
			mobile.sendKeys("9424747357");

			WebElement datepic = driver.findElement(By.id("dateOfBirthInput"));
			datepic.click();

			WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
			Select months = new Select(month);
			months.selectByIndex(0);

			WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
			Select years = new Select(year);
			years.selectByVisibleText("2015");

			String mydate = "14";

			List<WebElement> date = driver
					.findElements(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[4]"));
			for (WebElement e : date) {
				if (e.getText().equals(mydate)) {
					e.click();
				}

			}

			WebElement Subject = driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]/div[2]"));
			Subject.click();
			Actions action = new Actions(driver);

			action.keyDown(Keys.SHIFT)
			.sendKeys("english")
			.keyUp(Keys.SHIFT)
			.keyDown(Keys.ENTER)
			.build()
			.perform();

		
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
			
			
			
			Thread.sleep(2000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;

			WebElement picture = driver.findElement(By.id("uploadPicture"));
			js.executeScript("arguments[0].scrollIntoView();", picture);

			Thread.sleep(1000);
			picture.sendKeys("C:\\Users\\meena\\OneDrive\\Pictures\\133556529940759819.jpg");
//
			Thread.sleep(2000);

			WebElement Address = driver.findElement(By.id("currentAddress"));
			Address.click();
			Address.sendKeys("Maninagar");
//			
			WebElement State = driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]"));
			action.click(State)
			.moveToElement(State)
			.sendKeys("NCR")
			.keyDown(Keys.ENTER)
			.build()
			.perform();
//			
			WebElement city=driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[2]/div"));
			action.click(city)
			.moveToElement(city)
			.sendKeys("Ahemdabad")
			.keyDown(Keys.ENTER)
			.build()
			.perform();

		}

	}


