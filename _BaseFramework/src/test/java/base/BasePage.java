package base;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage {
	public WebDriverWait wait;
	
	public BasePage() {
		PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()), this);
		wait = new WebDriverWait(DriverManager.getDriver(), 10);
	}
}
