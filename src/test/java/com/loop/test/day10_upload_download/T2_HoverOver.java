package com.loop.test.day10_upload_download;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
/*
 1. Go to https://www.google.com
 2. Hover over on Search button
 3. Hover over on Feeling Lucky button
  */
public class T2_HoverOver {
    @Test
    public void google_action_hover() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));
        WebElement googleSearch = Driver.getDriver().findElement(By.xpath("//input[@id='gbqfbb']/preceding-sibling::input"));
        WebElement feelingLucky = Driver.getDriver().findElement(By.xpath("//input[@id='gbqfbb']"));
        Actions action = new Actions(Driver.getDriver());
        Thread.sleep(3000);
        action.moveToElement(googleSearch).perform();
        Thread.sleep(3000);
        action.moveToElement(feelingLucky).perform();
        System.out.println(feelingLucky.getText());
        Thread.sleep(1000);
        action.sendKeys(Keys.F12).build().perform();
    }
}
