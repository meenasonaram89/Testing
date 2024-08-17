package Assiment;

import org.checkerframework.checker.units.qual.t;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import connection.Driverconnection;

public class Tops_multipal_perameters {
		static WebDriver driver=null;
		
		@BeforeClass
		public static void test() {
			String url="https://www.instagram.com/";
			driver=Driverconnection.getDriver(url);
		}
@Test
	public void test(String email,String password) {
//	WebElement emailEle=
}
}
