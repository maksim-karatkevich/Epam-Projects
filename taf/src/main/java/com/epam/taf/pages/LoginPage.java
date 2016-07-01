package com.epam.taf.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
    @FindBy(id = "Email")
    private WebElement emailField;
    @FindBy(id = "next")
    private WebElement nextButton;
    @FindBy(id = "Passwd")
    private WebElement passwordField;
    @FindBy(id = "signIn")
    private WebElement signInButton;
    @FindBy(xpath = "//div[@class='gb_ue gb_tf']/div[1]/div[2]/div[4]//a")
    private WebElement userNameSpan;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }


    public void logIn(String loginName, String password) {
        openPage();
        emailField.sendKeys(loginName);
        nextButton.click();
        passwordField.sendKeys(password);
        signInButton.click();
    }

    public String getUserName() {
//        StringBuilder builder = new StringBuilder(userNameSpan.getAttribute("title"));
//        String regax = "sd";
        return userNameSpan.getAttribute("title");
    }

    public void openPage() {
        driver.navigate().to("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1");
    }
}
