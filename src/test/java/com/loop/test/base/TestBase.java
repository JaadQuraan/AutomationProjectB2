package com.loop.test.base;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
  public  WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }


    @AfterMethod
    public void teardownMethod(){
        //  driver.close();
    }
}
