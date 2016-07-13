package com.epam.taf.webDriverFacroryMethod;

import org.openqa.selenium.WebDriver;

public abstract class WebDriverCreator {

    public abstract WebDriver factoryMethod(String browserType);

    public abstract WebDriver getInstance();

    public abstract void closeDriver();

    public abstract void initBrowser();


}
