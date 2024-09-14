package Project_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import connection.Driverconnection;

public class Login_Test {

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
	public void trest() throws InterruptedException {
		System.out.println( "Details");
		driver.findElement(By.xpath("//span[@class='d-none d-md-inline']")).click();
		Thread.sleep(2000);

		WebElement pr = driver.findElement(By.linkText("Personal Details"));
		pr.click();

		Thread.sleep(2000);

		WebElement fname = driver.findElement(By.id("firstName"));
		fname.clear();
		fname.sendKeys("Sonaram");
		Thread.sleep(1000);
		WebElement lname = driver.findElement(By.id("lastName"));
		lname.clear();
		lname.sendKeys("Meena");
		Thread.sleep(1000);

		WebElement ename = driver.findElement(By.id("email"));
		ename.clear();
		ename.sendKeys("meenasonaram6@gmail.com");
		Thread.sleep(1000);

		WebElement insta = driver.findElement(By.id("instagram_id"));
		insta.clear();
		insta.sendKeys("Bha_ra_t.meena");
		Thread.sleep(1000);

		driver.findElement(By.id("select2-gender-container")).click();
		Thread.sleep(1000);

		WebElement gender = driver.findElement(By.id("select2-gender-container"));
		gender.click();

		Thread.sleep(2000);
		driver.findElement(By.id("select2-maritalStatus-container")).click();
		Thread.sleep(1000);
		WebElement status = driver.findElement(By.xpath("//span[@id='select2-maritalStatus-container']"));
		status.click();

		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// 1.By pixels
		js.executeScript("window.scrollBy(0,500)", "");

		Thread.sleep(2000);
		driver.findElement(By.id("birthdate")).click();

		WebElement pname = driver.findElement(By.name("father_name"));
		pname.clear();
		pname.sendKeys("Talsaji");
		Thread.sleep(1000);

		WebElement mname = driver.findElement(By.name("mother_name"));
		mname.clear();
		mname.sendKeys("Bhamariben");
		Thread.sleep(1000);

		WebElement gname = driver.findElement(By.id("guardianName"));
		gname.clear();
		gname.sendKeys("Talsaji");
		Thread.sleep(1000);

		driver.findElement(By.id("select2-religion-container")).click();
		Thread.sleep(1000);

		WebElement Religion = driver.findElement(By.className("select2-results__option"));
		Religion.click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"profileForm\"]/div/div[3]/div/div[17]/div/span/span[1]/span")).click();
		Thread.sleep(1000);

		WebElement Disability = driver
				.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']"));
		Disability.click();
		Thread.sleep(1000);

		WebElement adno = driver.findElement(By.name("id_no"));
		adno.clear();
		adno.sendKeys("987376618903");
		Thread.sleep(1000);



		WebElement add = driver.findElement(By.id("address"));
		add.clear();
		add.sendKeys("maninagar");
		Thread.sleep(2000);


		WebElement btn = driver.findElement(By.id("aadharFront"));
		js.executeScript("arguments[0].scrollIntoView();", btn);

		Thread.sleep(1000);
		btn.sendKeys("C:\\Users\\meena\\Downloads\\WhatsApp Image 2024-06-27 at 15.34.27_1f9aa69c.jpg");

		Thread.sleep(2000);
		WebElement btn1 = driver.findElement(By.id("aadharBack"));
		js.executeScript("arguments[0].scrollIntoView();", btn1);

		Thread.sleep(1000);
		btn1.sendKeys("C:\\\\Users\\\\meena\\\\Downloads\\\\WhatsApp Image 2024-06-27 at 15.34.27_1f9aa69c.jpg");
		Thread.sleep(2000);

		WebElement pin = driver.findElement(By.id("pincode"));
		pin.clear();
		pin.sendKeys("380008");

		driver.findElement(By.id("select2-country-container")).click();

		WebElement country = driver.findElement(By.xpath("//input [@class='select2-search__field']"));
		Actions action = new Actions(driver);

		action.sendKeys("India").keyDown(Keys.ENTER).build().perform();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"profileForm\"]/div/div[3]/div/div[27]/div/span/span[1]/span")).click();
		WebElement state = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		action.sendKeys("Gujarat").keyDown(Keys.ENTER).build().perform();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"profileForm\"]/div/div[3]/div/div[27]/div/span/span[1]/span")).click();
		Thread.sleep(2000);
		action.sendKeys("Ahmedabad").keyDown(Keys.ENTER).build().perform();

		driver.findElement(By.xpath("//*[@id=\"profileForm\"]/div/div[3]/div/div[27]/div/span/span[1]/span")).click();
		Thread.sleep(1000);
		WebElement city = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		action.sendKeys("Ahmedabad").keyDown(Keys.ENTER).build().perform();

		driver.findElement(By.xpath("//*[@id=\"profileForm\"]/div/div[3]/div/div[27]/div/span/span[1]/span")).click();
		WebElement Training = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		action.sendKeys("Fresher").keyDown(Keys.ENTER).build().perform();

		WebElement pbtn = driver.findElement(By.id("imageUpload"));
		js.executeScript("arguments[0].scrollIntoView();", pbtn);

		Thread.sleep(2000);
		pbtn.sendKeys("C:\\Users\\meena\\OneDrive\\Documents\\my.jpg");
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,-1500)");
		Thread.sleep(2000);
		WebElement btn2 = driver.findElement(By.id("updateProfile"));
		btn2.click();
		Thread.sleep(3000);

	}
	@Test(priority = 3)
	public void testing() throws InterruptedException {
		System.out.println("education");
		driver.findElement(By.xpath("//span[@class='d-none d-md-inline']")).click();

		WebElement edu = driver.findElement(By.linkText("Education Details"));
		edu.click();
		Thread.sleep(2000);

		WebElement home = driver.findElement(By.linkText("Home"));
		home.click();
		Thread.sleep(3000);

	}

	@Test(priority = 4)
	public void change() throws InterruptedException {
		System.out.println("pass change");

		driver.findElement(By.xpath("//span[@class='d-none d-md-inline']")).click();
		Thread.sleep(2000);

		WebElement pass = driver.findElement(By.linkText("Change Password"));
		pass.click();

		Thread.sleep(2000);

		WebElement cupass = driver.findElement(By.id("current_password"));
		cupass.sendKeys("8980868840");

		Thread.sleep(2000);

		WebElement newpass = driver.findElement(By.id("new_password"));
		newpass.sendKeys("Sona@123");

		Thread.sleep(2000);

		WebElement conpass = driver.findElement(By.id("confirm_password"));
		conpass.sendKeys("Sona@123");

		Thread.sleep(2000);

//		WebElement chnagebtn=driver.findElement(By.id("changePasswordSubmit"));
//		chnagebtn.click();

		Thread.sleep(2000);

		WebElement home = driver.findElement(By.linkText("Home"));
		home.click();
	}

	@Test(priority = 5)
	public void remiders() throws InterruptedException {
		System.out.println("remiders");
		WebElement remi = driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div/div[2]/a[1]/i"));
		remi.click();

		Thread.sleep(2000);	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		Thread.sleep(3000);
		
		WebElement home = driver.findElement(By.linkText("Home"));
		home.click();

	}
}
