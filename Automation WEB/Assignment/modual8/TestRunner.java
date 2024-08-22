package basic1;

import java.io.IOException;

import org.junit.Test;

public class TestRunner {
	   @Test
	    public void runKeywordDrivenTest() throws IOException {
	        DriverScript driverScript = new DriverScript();
	        driverScript.executeTestCase("C:\\Users\\meena\\OneDrive\\Documents\\excle.xlsx");
	    }
}
