package assiment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.Driverconnection;

public class P03333 {
			public static void main(String[] args) throws InterruptedException {
				String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
				WebDriver driver=Driverconnection.getDriver(url);
				
				Thread.sleep(5000);
				WebElement user=driver.findElement(By.name("username"));
				user.sendKeys("Admin");
				WebElement pass=driver.findElement(By.name("password"));
				pass.sendKeys("admin123");
				
				
				WebElement btn=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
						btn.click();
				Thread.sleep(5000);
				WebElement ad=driver.findElement(By.linkText("Admin"));
				ad.click();
				
				List<WebElement> all =driver.findElements(By.xpath("//div[@data-v-6c07a142][1]"));
				System.out.println( "print");
				for(WebElement a : all) {
					System.out.println("println");
					System.out.println(a.getText());
					 
				}

						
				}
			}

