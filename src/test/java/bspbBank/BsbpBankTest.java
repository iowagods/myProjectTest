package bspbBank;

import core.LoadSeleniumDriver;
import org.junit.Assert;
import org.junit.Test;

import static bspbBank.Сonstants.*;


public class BsbpBankTest extends LoadSeleniumDriver {

    @Test
    public void autorization(){
        ContactValuePage contactValuePage = new ContactValuePage();

        Assert.assertEquals(contactValuePage
                .authorizationBank()
                .getPhoneValue1()
                .getText(), PHONE_NUMBER_SPB);

        Assert.assertEquals(contactValuePage
                .getPhoneValue2()
                .getText(), PHONE_NUMBER_OTHER);

        Assert.assertEquals(contactValuePage
                .getPhoneValue3()
                .getText(), PHONE_NUMBER_TP_SPB);

        Assert.assertEquals(contactValuePage
                .getPhoneValue4()
                .getText(), PHONE_NUMBER_TP_OTHER);


        Assert.assertEquals(contactValuePage
                .getSiteValue()
                .getText(), SITE_NAME);

        Assert.assertTrue(contactValuePage
                .getIconVk()
                .isDisplayed());

        Assert.assertTrue(contactValuePage
                .getIconOd()
                .isDisplayed());

        Assert.assertTrue(contactValuePage
                .getIconTg()
                .isDisplayed());


    }

}
