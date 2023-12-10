package com.loop.test.day6_alerts_iframes;

import com.loop.test.base.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

import java.time.Duration;

/*
    Information alert practice
    1. Open browser
    2. Go to website: https://loopcamp.vercel.app/javascript-alerts.html
    3. Click to “Click for JS Alert” button
    4. Click to OK button from the alert
    5. Validate “You successfully clicked an alert” text is displayed

    Confirmation alert practice
    1. Click to “Click for JS Confirm” button
    2. Click to OK button from the alert
    3. Verify “You clicked: Ok” text is displayed.
    4. Click to “Click for JS Confirm” button
    5. Click to Cancel button from the alert
    6. Validate “You clicked: Cancel” text is displayed.

    Prompt alert practice
    1. Click to “Click for JS Prompt” button
    2. Send "Loop Academy"
    3. Click Ok
    4. Validate "You entered: Loop Academy" text is displayed


     */
public class T1_alerts extends TestBase {
    @Test
    public void informationAlert(){

        driver.get("https://loopcamp.vercel.app/javascript-alerts.html");
        WebElement clickForJSAlert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        clickForJSAlert.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement successMessageForInformationAlert = driver.findElement(By.xpath("//p[@id='result']"));
        String expected = "You successfully clicked an alert";
        String actual = successMessageForInformationAlert.getText();
        assertEquals(actual, expected, "actual does not match the expected");

    }
    @Test
    public void conformationAlert(){

        driver.get("https://loopcamp.vercel.app/javascript-alerts.html");
        WebElement clickForJSConfirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        clickForJSConfirm.click();
        driver.switchTo().alert().accept(); // will ok and accept
        WebElement successMessageForInformationAlert = driver.findElement(By.xpath("//p[@id='result']"));
        String expected = "You clicked: Ok";
        String actual = successMessageForInformationAlert.getText();
        assertEquals(actual,expected,"Actual does not match the expected");
        clickForJSConfirm.click();
        driver.switchTo().alert().dismiss();
         expected = "You clicked: Cancel";
         actual = successMessageForInformationAlert.getText();
        assertEquals(actual,expected,"Actual does not match the expected");

    }

    @Test
    public void promptAlert(){
        driver.get("https://loopcamp.vercel.app/javascript-alerts.html");
        WebElement clickJSPrompt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
        clickJSPrompt.click();
        String text = "Loop Academy";
//        driver.switchTo().alert().sendKeys(text);
//        driver.switchTo().alert().accept();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
        alert.accept();
        WebElement successMessageForInformationAlert = driver.findElement(By.xpath("//p[@id='result']"));
        String actual = successMessageForInformationAlert.getText();
        String expected = "You entered: " + text;
        assertEquals(actual,expected,"Actual does not match the expected");


    }

}
