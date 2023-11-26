package com.loop.test.day4_xpath_findelement;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
   http://the-internet.herokuapp.com/forgot_password
    */
public class T00__css_isDisplayed {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/forgot_password");

        WebElement forgotPasswordHeading = driver.findElement(By.cssSelector("div[class='example']>h2"));
        System.out.println(forgotPasswordHeading);

        if(forgotPasswordHeading.isDisplayed()){
            System.out.println("Forget password heading is displayed");
            System.out.println("Test Passed");
        } else {
            System.out.println("Forget password heading is NOT displayed");
            System.out.println("Test FAILED");        }
    }
}
