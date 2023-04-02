package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

abstract public class LoadSeleniumDriver {
    protected WebDriver driver;
    protected LoadSeleniumDriver() {

    }
        @Before
        public void setUp(){
            ChromeOptions option = new ChromeOptions();
            option.addArguments("--remote-allow-origins=*");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(option);
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            LoadSeleniumPage.setDriver(driver);


        }

        @After
        public void tearDown()  {
//        Date dateNow = new Date();
//        SimpleDateFormat format = new SimpleDateFormat("hh.mm.ss.yyyy");
//        String fileName = format.format(dateNow) + ".png";
//        File screenshot = ((TakesScreenshot)driver).getScreenshotAs (OutputType.FILE);
//        try {
//            FileUtils.copyFile(screenshot, new File( ("E:\\IDE ScreeShots\\" + fileName)));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
           driver.close();
           driver.quit();

        }

    }
