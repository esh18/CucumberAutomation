package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;

public class WebDriverManagement {
	public WebDriver driver;

	public WebDriver WebDriverManager() throws IOException, InterruptedException {
		// this.objBaseConnector = objBaseConnector;
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("Url");
		String browser_properties = prop.getProperty("browser");
		String browser_maven = System.getProperty("browser");
		// result = testCondition ? value1 : value2

		String browser = browser_maven != null ? browser_maven : browser_properties;

		if (driver == null) {
			if (browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				// System.setProperty("webdriver.chrome.driver",
				// System.getProperty("user.dir") + "//src//test//resources//chromedriver.exe");
				driver = new ChromeDriver();// driver gets the life
			} else if (browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				// System.setProperty("webdriver.gecko.driver",
				// System.getProperty("user.dir") + "//src//test//resources//chromedriver");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				// System.setProperty("webdriver.gecko.driver",
				// System.getProperty("user.dir") + "//src//test//resources//chromedriver");
				driver = new FirefoxDriver();
			}

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(url);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
		}
		return driver;
	}
}
