package com.epam.taf.webDriverFacroryMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class ChromeDriverCreator extends WebDriverCreator {
    protected static WebDriver driver;

    public WebDriver factoryMethod() {
        return getInstance();
    }

    protected WebDriver getInstance() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

    public void closeDriver() {
        driver.close();
        driver = null;
    }

    public void initBrowser() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }


}
