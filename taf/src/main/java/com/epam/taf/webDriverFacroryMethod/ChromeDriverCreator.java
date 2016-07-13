package com.epam.taf.webDriverFacroryMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class ChromeDriverCreator {
    private static WebDriver driver;

    private ChromeDriverCreator() {
    }


    public static WebDriver getInstance() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void closeDriver() {
        driver.close();
        driver = null;
    }

    public static void initBrowser() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }


}
