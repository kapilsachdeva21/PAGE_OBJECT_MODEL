package com.qa.pages;

import com.qa.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

public class LoginPage extends Base {


    WebElement selectedcountry;


    @FindBy(xpath="//*[@id=\"country-group\"]/div/div/button")
    public WebElement countrybutton;

    @FindBy(xpath="//*[@id=\"country-group\"]/div/div/div/ul/li[10]/a/span[1]")
    public WebElement hutch;

     /******************Select Country from Country List****************/

    //*[@id="country-group"]/div/div/div/ul/li[2]/a/span[1]     India
    //*[@id="country-group"]/div/div/div/ul/li[3]/a/span[1]     Afganistan
    //*[@id="country-group"]/div/div/div/ul/li[4]/a/span[1]     Bhamas

    @FindBy(xpath="//*[@id=\"phone\"]")
    public WebElement entermobilenumber;

    @FindBy(xpath="//*[@id=\"btn_submit\"]")
    public WebElement continue_button;




    public LoginPage()
    {
        PageFactory.initElements(driver, this);

    }

    public String loginPageTitleValidation()
    {
        return driver.getTitle();
    }


    public Boolean loginValidationHutch(String msisdn,String name)
    {
        try {
            System.out.println("Welcome"+ name);
            Thread.sleep(5000);
            countrybutton.click();
        }catch (InterruptedException e){e.getStackTrace();}

        try{
            Thread.sleep(5000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", hutch);
            try {
                Thread.sleep(5000);
                hutch.click();
            }catch (InterruptedException e){
               e.getStackTrace();
            }
            }catch (InterruptedException e){e.getStackTrace();}
        entermobilenumber.sendKeys(msisdn);
        try{
            Thread.sleep(5000);
            continue_button.click();
            Thread.sleep(5000);
        String actual_title=driver.getTitle();
        if(actual_title.equalsIgnoreCase("Reycreo Games"))
            return true;
        else
            return false ;}catch (InterruptedException e)
        {
            e.getStackTrace();
        }
            return true;
    }


    public void loginValidationMaxis()
    {
       System.out.println("Login validation for Maxis started");
    }

}
