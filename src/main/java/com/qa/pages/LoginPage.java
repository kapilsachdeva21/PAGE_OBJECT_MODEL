package com.qa.pages;

import com.qa.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {



    @FindBy(xpath="//*[@id=\"country-group\"]/div/div/button")
    WebElement countrybutton;

    @FindBy(xpath="//*[@id=\"country-group\"]/div/div/div/ul/li[4]/a/span[1]")
    WebElement selectedcountry;

    @FindBy(xpath="//*[@id=\"phone\"]")
    WebElement entermobilenumber;

    @FindBy(xpath="//*[@id=\"btn_submit\"]")
    WebElement mainloginbutton;




    public LoginPage()
    {
        PageFactory.initElements(driver, this);

    }

    public void loginCheck()
    {
        try
        {
            Thread.sleep(3000);
            countrybutton.click();
            Thread.sleep(3000);
            selectedcountry.click();
        }catch (InterruptedException e)
        {
            e.fillInStackTrace();
        }

        entermobilenumber.sendKeys("676686868");
        mainloginbutton.click();
    }


}
