package com.qa.pages;

import com.qa.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {

    //@FindBy(name="abc")
    //WebElement anyname;

    public HomePage()
    {
        PageFactory.initElements(driver, this);
    }

    public String validateHomePageTitle()
    {
        return driver.getTitle();
    }

}
