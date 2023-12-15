package com.loop.test.day7_windows;

import com.loop.test.base.TestBase;
import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

//Window handles are unique so they are stored in a set
public class T1_window extends TestBase {

    @Test
    public static void test_window_handle (){
        driver.get("https://the-internet.herokuapp.com/windows");
        assertEquals(driver.getTitle(), "The Internet", "Results aren't matching!");
        WebElement clickHere = driver.findElement(By.xpath("//a[@href='/windows/new']"));
        clickHere.click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String each : windowHandles) {
            System.out.println("each window's handle = " + each);
            driver.switchTo().window(each);
        }

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        System.out.println("driver.getTitle() = " + driver.getTitle());
        //        WebElement newWindow = driver.findElement(By.xpath("//h3[contains(text(),'New Window')]"));
        WebElement newWindow = driver.findElement(By.xpath("//div[@class='example']/h3"));
        System.out.println("newWindow.getText() = " + newWindow.getText());

    }


}
