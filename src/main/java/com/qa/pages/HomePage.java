package com.qa.pages;

import com.qa.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {


    @FindBy(xpath = "//*[@id=\"bottom-nav-menu\"]/i")
    WebElement hamburgerbutton;
    @FindBy(xpath = "//*[@id=\"ms-slidebar\"]/div/header/div[1]/a")
    WebElement loginbutton;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public String validateHomePageTitle() {
        return driver.getTitle();
    }

    public void hamburgerClick() {
        hamburgerbutton.click();
    }

    public LoginPage loginButton()
    {
        loginbutton.click();
        return new LoginPage();
    }

}