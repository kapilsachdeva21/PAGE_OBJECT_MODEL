package com.qa.testcases;

import com.qa.base.Base;
import com.qa.pages.AccountPage;
import com.qa.pages.HomePage;
import com.qa.pages.LandingPage;
import com.qa.pages.LoginPage;
import com.qa.utility.ExcelUtility;
import com.qa.utility.ScreenshotUtility;
import com.qa.utility.TestUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageTest extends Base {

    LandingPage landing_page_obj;
    LoginPage login_page_obj;


    public LoginPageTest()
    {
        super();
    }

    @BeforeMethod
    public void loginSetup()
    {
        Base.init();
        landing_page_obj=new LandingPage();
        login_page_obj=landing_page_obj.gameClickValidation();
        ExcelUtility excel_utility_obj=new ExcelUtility();
    }


    @Test
    public void loginPageTitleValidationTest()
    {
        String actualTitle=login_page_obj.loginPageTitleValidation();
        String expectedTitle="Reycreo Games :: Login";
        Assert.assertEquals(actualTitle,expectedTitle,"login page title is not matching");
    }

    @DataProvider(name="getDataHutch")
    public Object[][] getDataHutch()
    {
        ExcelUtility excel_utility_obj=new ExcelUtility();
        Object[][] data=excel_utility_obj.getExcelData();
        System.out.println("DATA RECEIVED FROM EXCEL SHEET");
        return data;
    }

    @Test(dataProvider = "getDataHutch",alwaysRun = true)
    public void loginValidationHutchTest(String msisdn,String name)
    {
        System.out.println("Data Received from Data Provider" + msisdn +"and" + name);
        Boolean result=login_page_obj.loginValidationHutch(msisdn,name);
        Assert.assertTrue(result,"Hutch login Unsuccessful");
        System.out.println("Login Successful");
    }

@AfterMethod
    public void closeBrwoser()
{
    System.out.println("Closing browser after test");
    driver.close();
}
}
