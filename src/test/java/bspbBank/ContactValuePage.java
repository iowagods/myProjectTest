package bspbBank;

import core.LoadSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import properties.ConfigProvider;

public class ContactValuePage extends LoadSeleniumPage {

    @FindBy(xpath = "//button[@id='login-button'][text()='Войти']")
    private WebElement sendInButton1;

    @FindBy(xpath = "//button[@id='login-otp-button']")
    private WebElement sendInButton2;

    @FindBy(xpath = "//span[@class='filter-option pull-left']")
    private WebElement user;

    @FindBy(xpath = "//span[@class='text'][text()='ИП \"Морозов Павел Изяславович\"']")
    private  WebElement ipUser;

    @FindBy(xpath = "//a[@id='close-alerts-dialog'][text()='Закрыть']")
    private WebElement closeWindow;

    @FindBy(xpath = "//span[@class='icon-phone']")
    private WebElement contactButton;

    @FindBy(xpath = "//a[@class='contacts-link'][text()='8 /812/ 332 7878']")
    private WebElement phoneValue1;

    @FindBy(xpath = "//a[@class='contacts-link'][text()='8 /800/ 500 0049']")
    private WebElement phoneValue2;

    @FindBy(xpath = "//div[@class='modal-body']//div//a[@class='contacts-link'][text()='8 /812/ 329 5939']")
    private WebElement phoneValue3;

    @FindBy(xpath = "//a[@class='contacts-link'][text()='8 /800/ 500 5939']")
    private WebElement phoneValue4;

    @FindBy(xpath = "//a[@class='contacts-link'][text()='www.bspb.ru']")
    private WebElement siteValue;

    @FindBy(xpath = "//span[@class='social-links muted']//a[@href='https://vk.com/bspb'][@target='_blank']")
    private WebElement iconVk;
    @FindBy(xpath = "//span[@class='social-links muted']//a[@href='https://www.odnoklassniki.ru/bspb'][@target='_blank']")
    private WebElement iconOd;

    public WebElement getIconVk() {
        return iconVk;
    }

    public WebElement getIconOd() {
        return iconOd;
    }

    public WebElement getIconTg() {
        return iconTg;
    }

    @FindBy(xpath = "//span[@class='social-links muted']//a[@href='https://t.me/mybspb'][@target='_blank']")
    private WebElement iconTg;


    public WebElement getPhoneValue1() {
        return phoneValue1;
    }

    public WebElement getPhoneValue2() {
        return phoneValue2;
    }

    public WebElement getPhoneValue3() {
        return phoneValue3;
    }

    public WebElement getPhoneValue4() {
        return phoneValue4;
    }

    public WebElement getSiteValue() {
        return siteValue;
    }

    public ContactValuePage(){
        driver.get(ConfigProvider.BSPB_BANK_URL);
        PageFactory.initElements(driver, this);
    }



    public ContactValuePage authorizationBank(){
        sendInButton1.click();
        sendInButton2.click();
        user.click();
        ipUser.click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        closeWindow.click();
        contactButton.click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this;
    }

}
