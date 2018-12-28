package com.qa.testcases;

import com.qa.base.Base;
import com.qa.pages.AccountPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountPageTest extends Base {

    AccountPage account;
    String text;

public AccountPageTest()
{
    super();
}

    @BeforeMethod
    public void accountPageTestSetup()
    {
        AccountPage account=new AccountPage();

    }

    @Test
    public void validateMyAccountGetText()
    {

        System.out.println("nothing");
    }

    @AfterMethod
    public void myAccountPageClose()
    {
        driver.quit();
        System.out.println("Browser closed after AccountPage testing");
    }
}
