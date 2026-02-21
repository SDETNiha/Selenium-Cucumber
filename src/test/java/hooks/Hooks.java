package hooks;

import base.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ExtentManager;
import utils.ScreenshotUtil;

public class Hooks {

    static ExtentReports extent = ExtentManager.getInstance();
    static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
    @Before
    public void setup(Scenario scenario) {
        BaseTest.initializeDriver();
        test.set(extent.createTest(scenario.getName()));
    }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            ScreenshotUtil.captureScreenshot(
                    BaseTest.getDriver(),
                    scenario.getName().replaceAll(" ", "_")
            );
        }
        if (scenario.isFailed()) {
            test.get().fail("Test Failed");
        } else {
            test.get().pass("Test Passed");
        }

        extent.flush();
        BaseTest.quitDriver();
    }
}