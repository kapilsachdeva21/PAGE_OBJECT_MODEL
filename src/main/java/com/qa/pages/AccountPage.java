package com.qa.pages;

import com.qa.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends Base {

    @FindBy(xpath="//*[@id=\"ms-slidebar\"]/div/header/div[1]/a")
    WebElement myaccountlink;
    //WebElement myaccountlink=driver.findElement(By.xpath("//*[@id=\\\"ms-slidebar\\\"]/div/header/div[1]/a"));

    @FindBy(xpath="//*[@id=\"reycreo-main-body\"]/div/div[1]/div/div/div/div[2]/div/div[3]/a")
    WebElement logoutlink;


    public AccountPage()
    {
        PageFactory.initElements(driver, this);

    }

    public boolean myAccountTextDisplayed()
    {
        if(myaccountlink!=null)
            return myaccountlink.isDisplayed();
        else
            return false;

    }

    public void validateMyAccountClick()
    {
        myaccountlink.click();
    }

    public void validateLogout()
    {
       logoutlink.click();

    }
}
