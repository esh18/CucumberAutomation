package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By checklbl = By.xpath("//div[@class='login_logo']");
	By txtusername = By.id("user-name");
	By txtpassword = By.id("password");
	By btnlogin = By.id("login-button");
	By checktxt = By.xpath("//span[@class='title']");
	By btnmenu = By.xpath("//button[text()='Open Menu']");
	By optlogout = By.xpath("//a[text()='Logout']");

	public WebElement checklbl() {
		return driver.findElement(checklbl);
	}

	public WebElement txtusername() {
		return driver.findElement(txtusername);
	}

	public WebElement txtpassword() {
		return driver.findElement(txtpassword);
	}

	public WebElement btnlogin() {
		return driver.findElement(btnlogin);
	}

	public WebElement checktxt() {
		return driver.findElement(checktxt);
	}

	public WebElement btnmenu() {
		return driver.findElement(btnmenu);
	}

	public WebElement optlogout() {
		return driver.findElement(optlogout);
	}
	
}
