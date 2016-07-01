package com.epam.taf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by maksim_kevich on 6/30/16.
 */
public class SingleDriver {
    private static WebDriver driver = new FirefoxDriver();

    private SingleDriver() {
    }

    public static WebDriver getInstance() {
        if (driver == null) {
            driver = new FirefoxDriver();
        }
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
        driver = null;
    }
}
