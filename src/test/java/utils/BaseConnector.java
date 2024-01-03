package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class BaseConnector {
	public WebDriver driver;
	public PageObjectManager objPageObjectManager;
	public WebDriverManagement objWebDriverManagement;
	public GenericUtils objGenericUtils;

	public BaseConnector() throws IOException, InterruptedException {
		objWebDriverManagement = new WebDriverManagement();
		objPageObjectManager = new PageObjectManager(objWebDriverManagement.WebDriverManager());
		objGenericUtils = new GenericUtils(objWebDriverManagement.WebDriverManager());
	}
}
