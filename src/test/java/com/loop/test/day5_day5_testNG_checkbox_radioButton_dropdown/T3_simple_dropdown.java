package com.loop.test.day5_day5_testNG_checkbox_radioButton_dropdown;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

//1. Open Chrome browse
//2. Go to http://the-internet.herokuapp.com/dropdown
//3. Verify “Dropdown list” default selected value is correct - Expected: “Please select an option”
public class T3_simple_dropdown {


    WebDriver driver;
    String expected = "Please select an option";
    String actual;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void teardownMethod(){
        driver.close();
    }

    @Test
    public void dropdownTest(){
        driver.get("http://the-internet.herokuapp.com/dropdown");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // create dropdown
        //WebElement dropdownElement = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        actual = dropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actual,expected,"Actual message does not match expected");
    }

}
