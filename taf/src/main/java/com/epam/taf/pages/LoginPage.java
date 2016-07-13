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
    @FindBy(xpath = "//div[@class='gb_pc gb_cb gb_tf gb_R']/a[1]")
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
        return userNameSpan.getAttribute("title");
    }

    public void openPage() {
        driver.navigate().to("https://gmail.com");
    }
}
