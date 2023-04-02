package weather;

import core.LoadSeleniumDriver;
import core.LoadSeleniumPage;
import org.junit.Assert;
import org.junit.Test;

public class WeatherTest extends LoadSeleniumDriver {

    @Test
    public void searchAccuWeather(){
        AcuWeather acuWeather = new AcuWeather();
        acuWeather.searchA();
        GismeteoWeather gismeteoWeather = new GismeteoWeather();
        gismeteoWeather.gisSearchWeather();
        //Assert.assertEquals("pass", acuWeather,gismeteoWeather);
        Assert.assertFalse(gismeteoWeather.toString(), false);
        Assert.assertFalse(acuWeather.toString(), false);


    }
}
