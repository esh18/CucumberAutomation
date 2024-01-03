package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public WebDriver driver;
	public LoginPage objLoginPage;
	public HomePage objHomePage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPage getLoginPageObj() {
		this.objLoginPage = new LoginPage(driver);
		return objLoginPage;
	}

	public HomePage getHomePageObj() {
		this.objHomePage = new HomePage(driver);
		return objHomePage;
	}
}
