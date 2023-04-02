package weather;

import core.LoadSeleniumPage;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import properties.ConfigProvider;

public class AcuWeather extends LoadSeleniumPage {

    @FindBy(xpath = "//input[@type=\"text\"]")
    private WebElement searchCity;

    @FindBy(xpath = "//div[@class='cur-con-weather-card__panel']")
    private WebElement CurrentWeather;

    @FindBy(xpath = "//div[@class='temp']")
    private  WebElement Weather;

    public AcuWeather(){
        driver.get(ConfigProvider.ACCUWEATHER);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        PageFactory.initElements(driver, this);
    }

    public void searchA(){
        searchCity.click();
        searchCity.sendKeys("Санкт петербург");
        searchCity.sendKeys(Keys.ENTER);

        String w = Weather.getText();
        w = StringUtils.substring(w,0,2);
        System.out.println(w);
    }

}
