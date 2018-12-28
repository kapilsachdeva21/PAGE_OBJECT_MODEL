package com.qa.pages;

import com.qa.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends Base {

    @FindBy(xpath="//*[@id=\"ms-slidebar\"]/div/header/div[1]/a")
    public WebElement myaccountlink;


    public AccountPage()
    {
        PageFactory.initElements(driver, this);

    }

    public boolean myAccountTextDisplayed()
    {
        return myaccountlink.isDisplayed();

    }

}
