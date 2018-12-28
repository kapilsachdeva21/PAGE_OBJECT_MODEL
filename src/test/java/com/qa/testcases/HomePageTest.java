package com.qa.testcases;

import com.qa.base.Base;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends Base {

    HomePage homepage;
    LoginPage loginpage;

    public HomePageTest()
    {
        super();
    }

    @BeforeMethod
    public void homeSetup()
    {
        Base.init();
        homepage=new HomePage();

    }

    @Test
    public void validateHomePageTitleTest()
    {
        String title=homepage.validateHomePageTitle();
        Assert.assertEquals(title,"Play Unlimited Online Games | Reycreo");
        homepage.hamburgerClick();
        loginpage=homepage.loginButton();
    }

    @AfterMethod
    public void brosercloseafterHOMEPAGETEST()
    {
        driver.close();
        System.out.println("Closing browser after HomePage testing");

    }


}
