package bank;

import core.LoadSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import properties.ConfigProvider;

public class CustomerPage extends LoadSeleniumPage {
    @FindBy(xpath = "//button[@class='btn home'][text()='Home']")
    private WebElement HomeButton;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-lg'][text()='Customer Login']")
    private WebElement CustomersButton;


    @FindBy(xpath = "//select[@id='userSelect']")
    private WebElement YourName;

    @FindBy(xpath = "//option[@class='ng-binding ng-scope'][text()='Harry Potter']")
    private WebElement Name;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement LoginButton;

    public CustomerPage(){
        driver.get(ConfigProvider.URL_BANK);
        PageFactory.initElements(driver, this);
    }


    public CustomerPage authorization(){
        CustomersButton.click();
        YourName.click();
        Name.click();
        LoginButton.click();
        return this;
    }
}
