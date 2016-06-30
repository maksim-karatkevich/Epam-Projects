package com.epam.taf.steps;


import com.epam.taf.SingleDriver;
import com.epam.taf.pages.LoginPage;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Steps {
    private WebDriver driver;

    public void initBrowser() {
        this.driver = SingleDriver.getInstance();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }

    public void logIn(String user, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.logIn(user, password);
    }

    public String getLoggedInUserName() {
        LoginPage loginPage = new LoginPage(driver);
        return loginPage.getUserName();
    }

    public void closeDriver() {
        driver.close();
    }


}
