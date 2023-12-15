package com.loop.test.day7_windows;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T0_iframe_practice extends TestBase {

    @Test
    public void nestedIframe(){
        driver.get("https://loopcamp.vercel.app/nested-frames.html");
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
      //  WebElement leftFrame = driver.findElement(By.xpath("//frame[@name= 'frame-left']"));
        WebElement left = driver.findElement(By.xpath("//*[contains(text(),'LEFT')]"));
        String actualLeft = left.getText();
        Assert.assertEquals(actualLeft.trim(),"LEFT", "The left frame was not properly displayed");
        driver.switchTo().frame("frame-bottom");

    }

}
