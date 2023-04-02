package bank;

import core.LoadSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import properties.ConfigProvider;

public class MainPage extends LoadSeleniumPage {
    @FindBy(xpath = "//button[@class='btn home'][text()='Home']")
    private WebElement HomeButton;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-lg'][text()='Customer Login']")
    private WebElement CustomerLoginButton;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-lg'][text()='Bank Manager Login']")
    private WebElement BankManagerLoginButton;

    public MainPage(){
        driver.get(ConfigProvider.URL_BANK);
        PageFactory.initElements(driver, this);
    }

    public MainPage authorization(){
        HomeButton.click();
        CustomerLoginButton.click();
        BankManagerLoginButton.click();
        return this;

    }


}
