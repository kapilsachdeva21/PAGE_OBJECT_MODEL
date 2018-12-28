package com.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base{


 public static WebDriver driver;
 public static Properties prop;

 public Base()
 {
     try {
         prop = new Properties();
         FileInputStream fi = new FileInputStream("E:\\PAGE_OBJECT_MODEL\\src\\main\\java\\com\\qa\\config\\config.properties");
         prop.load(fi);
     }catch (IOException e)
     {
         e.printStackTrace();
     }

 }

 public static void init()
 {
     String browserName=prop.getProperty("browser");
     if(browserName.equalsIgnoreCase("chrome"))
     {
         System.setProperty("webdriver.chrome.driver","E:\\driver\\chromedriver.exe");
         driver=new ChromeDriver();
     }
     else if(browserName.equalsIgnoreCase("firefox"))
     {
         driver=new FirefoxDriver();
     }
try {
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get(prop.getProperty("url"));
    Thread.sleep(5000);
}catch (InterruptedException e)
{
    e.fillInStackTrace();
}

 }

}

