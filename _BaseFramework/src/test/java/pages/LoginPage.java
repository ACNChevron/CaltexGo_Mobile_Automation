package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginPage extends BasePage {
	@AndroidFindBy(accessibility = "test-Username")
	@iOSXCUITFindBy(id = "test-Username")
	private WebElement usernameTxtFld;
	
	public LoginPage enterUsername(String username) {
		System.out.println("LoginPage > enterUsername() was invoked.");
		
		//Store Web Element for Username Text Field
		WebElement e = wait.until(ExpectedConditions.visibilityOf(usernameTxtFld));
		System.out.println("Web Element for Username Text Field was stored.");
		
		//Clear values in Username Text Field
		e.clear();
		System.out.println("Values were cleared in Username Text Field.");
		
		//Enter Username
		e.sendKeys(username);
		System.out.println("Username was entered.");
		
		return this;
	}

}
