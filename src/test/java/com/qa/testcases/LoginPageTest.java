package com.qa.testcases;

import com.qa.base.Base;
import com.qa.pages.AccountPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.utility.TestUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends Base {

    HomePage homepage;
    LoginPage loginpage;
    AccountPage accountpage;

    public LoginPageTest()
    {
        super();
    }

    @BeforeMethod
    public void loginSetup()
    {
        Base.init();
        homepage=new HomePage();
    }


    @Test(priority=1)
    public void validateLoginPageTest()
    {

            String title=homepage.validateHomePageTitle();
            System.out.println("Before home page title check");
            Assert.assertEquals(title,"Play Unlimited Online Games | Reycreo","Home Page title is incorrect");
            System.out.println("Title is correct");
            homepage.hamburgerClick();
            loginpage=homepage.loginButton();
            loginpage.loginCheck();
            try {
                Thread.sleep(2000);
                homepage.hamburgerClick();
            }catch (InterruptedException e)
            {
                e.fillInStackTrace();
            }

            TestUtility.lang.click();
            TestUtility.english.click();
            System.out.println("Language changes to english");
           try {
               Thread.sleep(2000);
               homepage.hamburgerClick();
           }catch (InterruptedException e)
           {
               e.fillInStackTrace();
           }

        accountpage=new AccountPage();
           boolean myaccounttext=accountpage.myAccountTextDisplayed();
           Assert.assertTrue(myaccounttext,"User login is unsuccessful");
           System.out.println("User login successful");

        }

    @AfterMethod
    public void browserclosingafterLoginPageTest()
    {
        driver.close();
        System.out.println("Closing browser after successful login ");
    }
}
