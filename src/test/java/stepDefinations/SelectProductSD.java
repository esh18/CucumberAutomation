package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import utils.BaseConnector;

public class SelectProductSD {
	public WebDriver driver;
	public BaseConnector objBaseConnector;
	public HomePage objHomePage;
	public LoginPage objLoginPage;

	public SelectProductSD(BaseConnector objBaseConnector) {
		this.objBaseConnector = objBaseConnector;
		this.objHomePage = objBaseConnector.objPageObjectManager.getHomePageObj();
		this.objLoginPage = objBaseConnector.objPageObjectManager.getLoginPageObj();
	}

	@Then("Select all the filter")
	public void select_all_the_filter() throws InterruptedException {
		Thread.sleep(2000);
		WebElement staticddfilter = objHomePage.ddfilter();
		Select ddfilter = new Select(staticddfilter);
		ddfilter.selectByVisibleText("Name (A to Z)");
		Thread.sleep(2000);

		ddfilter.selectByVisibleText("Name (Z to A)");
		Thread.sleep(2000);
	}

	@Then("Click on the any product")
	public void click_on_the_any_product() throws InterruptedException {
		objHomePage.divproduct().click();
		Thread.sleep(2000);
		Assert.assertEquals(objHomePage.btnaddtocart().getText(), "Add to cart");
	}

	@Then("Click on the add to cart button")
	public void click_on_the_add_to_cart_button() throws InterruptedException {
		objHomePage.btnaddtocart().click();
		Thread.sleep(2000);
		Assert.assertEquals(objHomePage.btnremove().getText(), "Remove");
	}

	@Then("Click on the cart button")
	public void click_on_the_cart_button() throws InterruptedException {
		objHomePage.btncart().click();
		Thread.sleep(2000);
		Assert.assertEquals(objHomePage.btncheckout().getText(), "Checkout");
	}

	@Then("Click on the checkout button")
	public void click_on_the_checkout_button() throws InterruptedException {
		objHomePage.btncheckout().click();
		Thread.sleep(3000);
		Assert.assertEquals(objHomePage.checklblcheckout().getText(), "Checkout: Your Information");
	}

	@Then("^Enter the (.+), (.+) and (.+) and click on the continue button$")
	public void enter_the_firstname_lastname_and_zipcode_and_click_on_the_continue_button(String firstname,
			String lastname, String pincode) throws InterruptedException {
		objHomePage.txtfirstname().sendKeys(firstname);
		objHomePage.txtlastname().sendKeys(lastname);
		objHomePage.txtpostalcode().sendKeys(pincode);
		Thread.sleep(2000);
		objHomePage.btncontinue().click();
		Thread.sleep(2000);
		Assert.assertEquals(objHomePage.btnfinish().getText(), "Finish");
	}

	@Then("Click on the finish button")
	public void click_on_the_finish_button() throws InterruptedException {
		objHomePage.btnfinish().click();
		Thread.sleep(2000);
		Assert.assertEquals(objHomePage.btnbackhome().getText(), "Back Home");
	}

	@Then("Click on the Back Home button")
	public void click_on_the_back_home_button() throws InterruptedException {
		objHomePage.btnbackhome().click();
		Thread.sleep(2000);
		Assert.assertEquals(objHomePage.checklblhome().getText(), "Products");
	}

}
