package com.epam.taf.webDriverFacroryMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class FirefoxDriverCreator {
    private static WebDriver driver; /// ????

    private FirefoxDriverCreator() {
    }

    public static WebDriver getInstance() {
        if (driver == null) {
            return driver = new FirefoxDriver();
        } else return driver;
        //   return driver;
    }

    public static void closeDriver() {
        driver.close();
        driver = null;
    }

    public static void initBrowser() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); /// ??????
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }

    public WebDriver factoryMethod() {
        return getInstance();
    } //// ?????




}
