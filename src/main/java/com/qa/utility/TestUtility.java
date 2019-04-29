package com.qa.utility;

import com.qa.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestUtility extends Base {

    public static WebElement lang=driver.findElement(By.xpath("//*[@id=\"sch5\"]/a"));

    public static WebElement english=driver.findElement(By.xpath("//*[@id=\"sc5\"]/li/a"));


}
