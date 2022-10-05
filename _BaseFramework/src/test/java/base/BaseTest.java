package base;

import org.testng.annotations.*;

public class BaseTest {
	@Parameters({"deviceID"})
	@BeforeTest
	public void beforeTest(String deviceID) throws Exception {
		System.out.println("BaseTest > beforeTest() was invoked.");
		
		//Initialize Driver
		DriverManager.initializeDriver(deviceID);
		System.out.println("Driver was initialized.");
	}
	
	@AfterTest(alwaysRun = true)
	public void quit() {
		System.out.println("BaseTest > quit() was invoked.");
		if(DriverManager.getDriver() != null) {
			DriverManager.getDriver().quit();
		}
	}
}
