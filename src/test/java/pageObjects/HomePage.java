package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	By ddfilter = By.xpath("//select[@class='product_sort_container']");
	By divproduct = By.xpath("//div[@class='inventory_item_name ' and text()='Sauce Labs Backpack']");
	By btnaddtocart = By.xpath("//button[text()='Add to cart']");
	By btnremove = By.id("remove-sauce-labs-backpack");
	By btncart = By.xpath("//a[@class='shopping_cart_link']");
	By btncheckout = By.id("checkout");
	By txtfirstname = By.id("first-name");
	By txtlastname = By.id("last-name");
	By txtpostalcode = By.id("postal-code");
	By btncontinue = By.id("continue");
	By btnfinish = By.id("finish");
	By btnbackhome = By.id("back-to-products");
	By checklblhome = By.xpath("//span[@class='title' and text()='Products']");
	By checklblcheckout = By.xpath("//span[@class='title' and text()='Checkout: Your Information']");

	public WebElement ddfilter() {
		return driver.findElement(ddfilter);
	}

	public WebElement divproduct() {
		return driver.findElement(divproduct);
	}

	public WebElement btnaddtocart() {
		return driver.findElement(btnaddtocart);
	}

	public WebElement btnremove() {
		return driver.findElement(btnremove);
	}

	public WebElement btncart() {
		return driver.findElement(btncart);
	}

	public WebElement btncheckout() {
		return driver.findElement(btncheckout);
	}

	public WebElement txtfirstname() {
		return driver.findElement(txtfirstname);
	}

	public WebElement txtlastname() {
		return driver.findElement(txtlastname);
	}

	public WebElement txtpostalcode() {
		return driver.findElement(txtpostalcode);
	}

	public WebElement btncontinue() {
		return driver.findElement(btncontinue);
	}

	public WebElement btnfinish() {
		return driver.findElement(btnfinish);
	}

	public WebElement btnbackhome() {
		return driver.findElement(btnbackhome);
	}

	public WebElement checklblhome() {
		return driver.findElement(checklblhome);
	}

	public WebElement checklblcheckout() {
		return driver.findElement(checklblcheckout);
	}

}
