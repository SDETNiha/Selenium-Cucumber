package stepDefinition;

import base.BaseTest;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginPageStepDef {

    LoginPage loginPage = new LoginPage(BaseTest.getDriver());

    @Given("User is on login page")
    public void user_is_on_login_page() {
        loginPage.openLoginPageAndVerifyTitle();
    }

    @When("we enter firstName, email, address")
    public void weEnterFirstNameEmailAddress() {
        loginPage.enterUserDetails("Neha","neha@gmail.com","1234566788","pawai");
    }

    @Then("choose gender")
    public void chooseGender() {
        loginPage.chooseGender();
    }

    @And("select day")
    public void selectDay() {
        loginPage.selectDay("thursday");
    }

    @Given("User is on homepage")
    public void userIsOnHomepage() {

    }

    @Then("Select country")
    public void selectCountry() {
        loginPage.selectCountry("germany");
    }

    @And("Choose colour")
    public void ChooseColour() {
        loginPage.chooseColour("white");
    }



    @Then("Select Date")
    public void selectDate() throws InterruptedException {
        loginPage.selectDate1();
    }

    @Then("Upload Files")
    public void uploadFiles() {
        loginPage.uploadImage("C:\\Users\\Neha\\eclipse-workspace\\SeleniumAutomationWithCucumber\\Data\\image_0.jpg");
    }

    @Then("select Table element")
    public void selectTableElement() {
        loginPage.selectElementFromTable("Mukesh");
    }

    @Then("select elememt of next page")
    public void selectElementOfNextPage() {
        loginPage.selectDataFromNextPage("2");

    }

    @Then("Search Data")
    public void searchData() throws InterruptedException {
        loginPage.searchInput("Neha");
        boolean b=loginPage.verifySearchedData();
        Assert.assertTrue(b);
    }

    @Then("Handle Dynamic button")
    public void handleDynamicButton() throws InterruptedException {
        loginPage.clickOnButton();
    }

    @Then("Drag and Drop")
    public void dragAndDrop() {
        loginPage.DragAndDrop();
    }

    @Then("Double Click")
    public void doubleClick() {
        loginPage.performDoubleClick();
    }

    @Then("mouse Hover")
    public void mouseHover() {
        loginPage.performMouseHover();
    }

    @Then("Verify Simple Alert")
    public void verifySimpleAlert() throws InterruptedException{
        loginPage.clickOnAlertPopup();
        // Switch to alert
        Alert alert = BaseTest.getDriver().switchTo().alert();
        Thread.sleep(2000);
// Get alert text
        System.out.println(alert.getText());
        Thread.sleep(2000);
// Accept alert (Click OK)
        alert.accept();
    }

    @Then("Verify Confirmation Alert")
    public void verifyConfirmationAlert() throws InterruptedException{
        loginPage.clickOnConfirmationPopup();
        Alert alert = BaseTest.getDriver().switchTo().alert();
        Thread.sleep(2000);
// Print message
        System.out.println(alert.getText());
        Thread.sleep(2000);
// Click Cancel
        alert.dismiss();
    }

    @Then("Verify Prompt Alert")
    public void verifyPromptAlert() throws InterruptedException{
        loginPage.clickOnPromptPopup();
        Alert alert = BaseTest.getDriver().switchTo().alert();
        Thread.sleep(2000);
// Enter text
        // Select all existing text
        alert.sendKeys(Keys.chord(Keys.CONTROL, "a"));

// Delete selected text
        alert.sendKeys(String.valueOf(Keys.DELETE));
        System.out.println("---------");
        alert.sendKeys("Hello Selenium");
        System.out.println("---------entered new ");
        Thread.sleep(2000);
// Accept alert
        alert.accept();
    }
}


