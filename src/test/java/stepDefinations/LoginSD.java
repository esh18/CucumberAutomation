package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.LoginPage;
import utils.BaseConnector;

public class LoginSD {
	public WebDriver driver;
	public BaseConnector objBaseConnector;
	public LoginPage objLoginPage;

	public LoginSD(BaseConnector objBaseConnector) {
		this.objBaseConnector = objBaseConnector;
		this.objLoginPage = objBaseConnector.objPageObjectManager.getLoginPageObj();
	}

	@Then("Check that The login succesfully done or not")
	public void check_that_the_login_succesfully_done_or_not() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertEquals("Products", objLoginPage.checktxt().getText());
	}

	@Then("Click on the Sandwitch menu and logout button")
	public void click_on_the_sandwitch_menu_and_logout_button() throws InterruptedException {
		objLoginPage.btnmenu().click();
		Thread.sleep(1000);
		objLoginPage.optlogout().click();
		Thread.sleep(1000);
	}

	@Then("Check the Logout is successfully happened")
	public void check_the_logout_is_successfully_happened() {
		Assert.assertEquals("Swag Labs", objLoginPage.checklbl().getText());
	}

	@Then("^Enter the (.+) and (.+) and click on the Login button$")
	public void enter_the_username_and_password_and_click_on_the_login_button(String username, String password)
			throws InterruptedException {
		objLoginPage.txtusername().sendKeys(username);
		objLoginPage.txtpassword().sendKeys(password);
		Thread.sleep(1000);
		objLoginPage.btnlogin().click();
	}

	@Then("Check that Login successfully happened or not")
	public void check_that_The_login_succesfully() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertEquals("Products", objLoginPage.checktxt().getText());
	}
}
