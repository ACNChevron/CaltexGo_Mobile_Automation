package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTests extends BaseTest {
	@Test
	public void invalidUserName() {
		LoginPage loginPage = new LoginPage();
		loginPage.enterUsername("Invalid Username");
	}

}
