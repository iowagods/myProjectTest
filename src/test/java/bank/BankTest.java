package bank;

import core.LoadSeleniumDriver;
import org.junit.Assert;
import org.junit.Test;
import properties.ConfigProvider;


public class BankTest extends LoadSeleniumDriver {

    @Test
    public void  readFromConf(){
        String urlFromConf = ConfigProvider.URL;
        System.out.println(urlFromConf);
    }

    @Test
    public void authorizationMainPage(){
        MainPage mainPage = new MainPage();
        mainPage.authorization();

    }

    @Test
    public void authorizationCustomersPage(){
        CustomerPage customerPage = new CustomerPage();
        customerPage.authorization();
    }

}
