package com.qa.testcases;

import com.qa.base.Base;
import com.qa.customlisteners.CustomListeners;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.utility.ScreenshotUtility;
import com.qa.utility.TestUtility;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
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
        System.out.println("Required object for homepage has been intilaized");

    }

    @Test
    public void validateHomePageTitleTest()
    {
        String title=homepage.validateHomePageTitle();

        Assert.assertEquals(title,"Play Unlimited Online Games | Reycreo1","Home page title is not matching");
        System.out.println("Home Page title is correct");
        //homepage.hamburgerClick();
        //loginpage=homepage.loginButton();
    }

    @AfterMethod
    public void brosercloseafterHOMEPAGETEST()
    {
        driver.close();
        System.out.println("Closing browser after HomePage testing");

    }


}
