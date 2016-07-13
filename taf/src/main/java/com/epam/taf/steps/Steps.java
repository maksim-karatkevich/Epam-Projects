package com.epam.taf.steps;


import com.epam.taf.SingleDriver;
import com.epam.taf.pages.LoginPage;
import com.epam.taf.pages.MailPage;
import org.openqa.selenium.WebDriver;



public class Steps {
    private WebDriver driver;

    /**
     * @param driver with factory method
     */

    public Steps(WebDriver driver) {
        this.driver = driver;
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
        SingleDriver.closeDriver();
    }


    public void logOut(String user, String pass) {
        logIn(user, pass);
        MailPage mailPage = new MailPage(driver);
        mailPage.logOutAfterLogIn();

    }
}
