package assesment;

import java.io.File;
import java.nio.file.Path;
import java.sql.Driver;

import javax.naming.spi.DirStateFactory.Result;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class demolisner implements ITestListener{
	@Override
	public void onTestStart(ITestResult	 result) {
		System.out.println("test start running");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipped");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		WebDriver driver=(WebDriver)result.getTestContext().getAttribute("selenium");
		String filName=result.getName();
		String path="D:\\Screen Shot\\aniket\\"+filName+".png";
		
		TakesScreenshot ss=(TakesScreenshot)driver;
		File source =ss.getScreenshotAs(OutputType.FILE);
		File dest=new File(path);
		
		try {
			FileUtils.copyFile(source, dest);
			System.out.println("ss taken");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
		                                                  

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("test finished");
	}
}