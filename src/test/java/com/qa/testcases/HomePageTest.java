package com.qa.testcases;

import com.qa.base.Base;
import com.qa.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends Base {

    HomePage homePage;

    public HomePageTest()
    {
        super();
    }

    @BeforeMethod
    public void setup()
    {
        Base.init();
        homePage=new HomePage();

    }

    @Test
    public void validateHomePageTitleTest()
    {
        String title=homePage.validateHomePageTitle();
        Assert.assertEquals(title,"Play Unlimited Online Games | Reycreo");
    }

}
