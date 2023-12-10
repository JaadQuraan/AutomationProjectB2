package com.loop.test.day6_alerts_iframes;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/*
1- Open a chrome browser
2- Go to: https://loopcamp.vercel.app/iframe.html
3- Clear text from comment body
4- Type "Loop Academy" in comment body
5- Verify "Loop Academy" text is written in comment body
6- Verify header "An iFrame containing the TinyMCE WYSIWYG Editor" is displayed

*/
public class T2_IFrame extends TestBase {
    @Test
    public void iframeTest(){
        driver.get("https://loopcamp.vercel.app/iframe.html");
//        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
//        driver.switchTo().frame(iframe); //by name or id
//        driver.switchTo().driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(0); //By index

       // driver.switchTo().frame("mce_0_ifr");
        WebElement textBox = driver.findElement(By.xpath("//body[@id='tinymce']"));
        textBox.clear();
        textBox.sendKeys("Loop Academy");

        driver.switchTo().defaultContent(); //will take us to the main
        //driver.switchTo().parentFrame();

        WebElement heading = driver.findElement(By.xpath("//h3[text()='An iFrame containing the TinyMCE WYSIWYG Editor']"));
        String actual = heading.getText();
        String expected = "An iFrame containing the TinyMCE WYSIWYG Editor";
        assertEquals(actual,expected,"actual does not match expected");

        WebElement poweredBy = driver.findElement(By.xpath("//div[text()='Powered by ']"));
        System.out.println("Powered By Text: " + poweredBy.getText());
    }
    @Test
    public void amazonIframe(){
        driver.get("https://amazon.com");
        List<WebElement> iframes = new ArrayList<>();
        iframes = driver.findElements(By.xpath("//iframe"));
        System.out.println("iframes: " + iframes.size());
    }
}
