package stepDefinition;

import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginPageStepDef {
    WebDriver driver;

    LoginPage loginPage = new LoginPage(BaseTest.getDriver());
    @Given("User is on login page")
    public void user_is_on_login_page() {
        loginPage.openLoginPageAndVerifyTitle();
    }

    @When("User enters username and password")
    public void user_enters_credentials() {
       // driver.findElement(By.id("username")).sendKeys("test");
       // driver.findElement(By.id("password")).sendKeys("1234");
       // driver.findElement(By.id("login")).click();
    }

    @Then("User should see homepage")
    public void user_should_see_homepage() {
        System.out.println("Login Successful");
        //driver.quit();
    }
}
