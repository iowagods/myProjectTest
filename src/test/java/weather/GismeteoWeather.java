package weather;

import core.LoadSeleniumPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import properties.ConfigProvider;

public class GismeteoWeather extends LoadSeleniumPage {

    @FindBy(xpath = "//input[@type='search']")
    private WebElement GisSearch;

    @FindBy(xpath  ="//div[@class='weathertab-wrap']")
    private WebElement searchValue;

    @FindBy(xpath = "//div[@class='temperature']")
    private WebElement ActualWeather;

    @FindBy(xpath = "//span[@class='unit unit_temperature_c'][1]")
    private WebElement TekWeather;

    public GismeteoWeather(){
        driver.get(ConfigProvider.GISMETEO_URL);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        PageFactory.initElements(driver, this);
    }

    public void gisSearchWeather(){
        GisSearch.click();
        GisSearch.sendKeys("Санкт-Петербург");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        GisSearch.sendKeys(Keys.ENTER);
        String g = TekWeather.getText();
        System.out.println(g);
    }

}
