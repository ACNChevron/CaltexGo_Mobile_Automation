package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class DummyFile {
	@Test
	public void dummyTest() {		
		AppiumDriver driver;
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "vivo 1811");
		caps.setCapability("udid", "c744264a");
		caps.setCapability("platformName", "Android");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage", "com.swaglabsmobileapp");
		caps.setCapability("appActivity", "com.swaglabsmobileapp.SplashActivity");
		
		//Declare URL
		URL url;
		try {
			url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AndroidDriver(url,caps);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
