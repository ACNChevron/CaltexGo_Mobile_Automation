package base;

import org.testng.annotations.*;

public class BaseTest {
	@Parameters({"deviceName"})
	@BeforeTest
	public void beforeTest(String deviceName) throws Exception {
		DriverManager.initializeDriver(deviceName);
	}
	
	@AfterTest(alwaysRun = true)
	public void quit() {
		if(DriverManager.getDriver() != null) {
			DriverManager.getDriver().quit();
		}
	}
}
