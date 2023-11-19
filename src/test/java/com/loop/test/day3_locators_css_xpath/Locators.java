package com.loop.test.day3_locators_css_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        //setup driver
        WebDriverManager.chromedriver().setup();
        //create driver object
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        //Maximize the window
        driver.manage().window().maximize();

        //locate the element
        WebElement searchBoxWithID = driver.findElement(By.id("APjFqb"));
        WebElement searchBoxWithName = driver.findElement(By.name("q"));
        WebElement aboutLink = driver.findElement(By.linkText("About"));

//        aboutLink.click();
        searchBoxWithID.sendKeys("Feyruz is awesome");
        Thread.sleep(1000);
        searchBoxWithID.clear(); //clears the search box dont want something in there when we send something
        String textToSearch = "Loop Academy";
        searchBoxWithID.sendKeys(textToSearch + Keys.ENTER);

        String actualURL = driver.getCurrentUrl();
        if (actualURL.contains("Loop")) {
            System.out.println("Actual URL: DOES contain \"Loop\" , => Test PASS");
        } else {
            System.err.println("Actual URL: does not contain \"Loop\" , => Test FAIL");
            //error in red
        }
        String actualTitle = driver.getTitle();
        if (actualTitle.contains("Loop Academy - Google Search")) {
            System.out.println("Actual title: DOES contain \"Loop\" , => Test PASS");
        } else {
            System.err.println("Actual title: does not contain \"Loop\" , => Test FAIL");

        }
    }
}
