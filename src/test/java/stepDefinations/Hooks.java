package stepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.BaseConnector;

public class Hooks {
	public BaseConnector objBaseConnector;

	public Hooks(BaseConnector objBaseConnector) {

		this.objBaseConnector = objBaseConnector;
	}

	@After
	public void AfterScenario() throws IOException, InterruptedException {

		objBaseConnector.objWebDriverManagement.WebDriverManager().close();
		objBaseConnector.objWebDriverManagement.WebDriverManager().quit();
	}

	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException, InterruptedException {
		WebDriver driver = objBaseConnector.objWebDriverManagement.WebDriverManager();
		if (scenario.isFailed()) {
			// screenshot
			File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(fileContent, "image/png", "image");
		}
	}
}
