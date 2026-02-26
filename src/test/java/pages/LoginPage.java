package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //  @FindBy(id = "username")
    ///  WebElement username;

    //Locators
    @FindBy(xpath = "//input[@id='name']")
    WebElement Firstname;


    @FindBy(xpath = "//input[@id='email']")
    WebElement Email;

    @FindBy(id = "phone")
    WebElement Phone;

    @FindBy(xpath = "//textarea[@class='form-control']")
    WebElement Address;


    @FindBy(id = "female")
    WebElement Female;

    @FindBy(id = "country")
    WebElement Country;



    @FindBy(xpath="//a[@data-date='22']")
    WebElement Date;


    @FindBy(id="datepicker")
    WebElement DatePicker;


    @FindBy(xpath="//input[@type='file']")
    WebElement Filepath;


    @FindBy(xpath="(//input[@type='checkbox'])[10]")
    WebElement checkbox;

    @FindBy(xpath="//input[@id='Wikipedia1_wikipedia-search-input']")
    WebElement searchInput;


    @FindBy(xpath="//input[@class='wikipedia-search-button']")
    WebElement SearchButton;

    @FindBy(xpath="//a[text()='Neha Kakkar']")
    WebElement searchResult;


    @FindBy(xpath="//button[@name='start']")
    WebElement DynamicButton;


    @FindBy(id="draggable")
    WebElement Drag;

    @FindBy(id="droppable")
    WebElement Drop;


    @FindBy(xpath="//button[@fdprocessedid='ni71vn']")
    WebElement CopyButton;

    @FindBy(xpath="//button[@fdprocessedid='kzn2i5']")
    WebElement MouseButton;


    @FindBy(id="alertBtn")
    WebElement Alert;

    @FindBy(id="confirmBtn")
    WebElement Confirm;

    @FindBy(id="promptBtn")
    WebElement Prompt;









    //Methods

    public void clickOnAlertPopup()throws InterruptedException{
        Thread.sleep(4000);
        Alert.click();
    }
    public void clickOnConfirmationPopup()throws InterruptedException{
        Thread.sleep(4000);
        Confirm.click();
    }
    public void clickOnPromptPopup()throws InterruptedException{
        Thread.sleep(4000);
        Prompt.click();
    }



     public boolean verifySearchedData () throws InterruptedException {
         Thread.sleep(4000);
          return searchResult.isDisplayed();
           }

    public void performMouseHover() {

        Actions action = new Actions(driver);
        action.moveToElement(MouseButton);//button[@fdprocessedid='a9mif0g']


    }

    public void performDoubleClick() {

        Actions action = new Actions(driver);
        action.doubleClick(CopyButton).perform();
    }

    public void DragAndDrop() {

        Actions action = new Actions(driver);
        action.dragAndDrop(Drag, Drop).perform();
    }





    public void searchInput(String name) {
        searchInput.sendKeys(name);
        SearchButton.click();
      //  SearchResult.click();
    }


public void clickOnButton() throws InterruptedException {
    DynamicButton.click();
    Thread.sleep(4000);
    DynamicButton.click();
}


public void selectDataFromNextPage(String value){


    String dynamicXpath=String.format("//a[text()='%s']",value.toLowerCase());
    driver.findElement(By.xpath(dynamicXpath)).click();
    checkbox.click();
}

    public void selectElementFromTable(String data) {
        // (//td[text()="Selenium"])[1]

        String dynamicXpath = String.format("(//td[text()='%s'])[1]", data);
        driver.findElement(By.xpath(dynamicXpath)).click();
    }

    public void uploadImage(String path) {
        Filepath.sendKeys(path);
    }

    public void selectDate1() throws InterruptedException {
        // WebElement Day=//option[@value='white']
        DatePicker.click();
        Thread.sleep(2000);
        Date.click();


    }


    public void openLoginPageAndVerifyTitle() {
        driver.getTitle().equals("For Selenium, Cypress & Playwright");
    }

    public void enterUserDetails(String name, String email, String phone, String address) {
        Firstname.sendKeys(name);
        Email.sendKeys(email);
        Phone.sendKeys(phone);
        Address.sendKeys(address);
    }

    public void chooseGender() {
        Female.click();
    }
    public void selectDay(String day) {
       // WebElement Day=//input[@value='+"day"+']

        String dynamicXpath = String.format("//input[@value='%s']", day.toLowerCase());
        driver.findElement(By.xpath(dynamicXpath)).click();
    }
public void selectCountry(String country) {
    Country.click();
    ////option[@value='germany']
    String dynamicXpath = String.format("//option[@value='%s']", country.toLowerCase());
    driver.findElement(By.xpath(dynamicXpath)).click();
}

    public void chooseColour(String  colour) {
        // WebElement Day=//option[@value='white']

        String dynamicXpath = String.format("//option[@value='%s']", colour.toLowerCase());
        driver.findElement(By.xpath(dynamicXpath)).click();
    }
}
