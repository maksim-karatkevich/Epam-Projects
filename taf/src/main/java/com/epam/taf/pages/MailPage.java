package com.epam.taf.pages;


import com.epam.taf.steps.Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailPage {
    private WebDriver driver;
    private Steps steps;

    @FindBy(xpath = "//div[@class='gb_ue gb_tf']/div/div[2]/div[4]//a")
    private WebElement temp;
    @FindBy(id = "gb_71")
    private WebElement singOutButtom;

    public MailPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void logOutAfterLogIn() {
        temp.click();
        singOutButtom.click();
    }
}
