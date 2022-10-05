package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginPage extends BasePage {
	@AndroidFindBy(accessibility = "test-Username")
	@iOSXCUITFindBy(id = "test-Username")
	private MobileElement usernameTxtFld;
	
	public LoginPage enterUsername(String username) {
		WebElement e = wait.until(ExpectedConditions.visibilityOf(usernameTxtFld));
		e.clear();
		e.sendKeys(username);
		return this;
	}

}
