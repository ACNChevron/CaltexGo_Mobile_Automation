package base;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage {
	public WebDriverWait wait;
	
	public BasePage() {
		System.out.println("BasePage > BasePage() was invoked.");
		
		//The initElements is a static method of PageFactory class which is used in conjunction with @FindBy annotation. 
		//Using the initElements method we can initialize all the web elements located by @FindBy annotation.
		PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()), this);
		System.out.println("PageFactory.initElements was invoked.");
		
		//Wait for Web Driver
		wait = new WebDriverWait(DriverManager.getDriver(), 10);
		System.out.println("Wait for Web Driver was invoked.");
	}
}
