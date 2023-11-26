package com.loop.test.day4_xpath_findelement;

import com.loop.test.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
 * verify forget password
 * identify reset password heading using css and go from parent to child
 */
public class T0_forget_password {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app/");

        //forgot password
        WebElement forgotPasswordLink = driver.findElement(By.cssSelector("a[href='/reset-password']"));
        forgotPasswordLink.click();
        Thread.sleep(1000);
        WebElement forgetPasswordHeading = driver.findElement(By.cssSelector("div[class='login-layout__form']>h1"));
        //CSS selector parent to child use >
        System.out.println("forgetPasswordHeading = " + forgetPasswordHeading.getText());
    }

}
