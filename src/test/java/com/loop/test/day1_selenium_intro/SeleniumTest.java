package com.loop.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {

        // setting up the web driver
        WebDriverManager.chromedriver().setup();

        // create an instance of webdriver
        WebDriver driver = new ChromeDriver();
       // Thread.sleep(5000);
        //Makes it wait 5 seconds before loading the webpage

        // navigate to web page

       // driver.get("https://www.google.com");
        //driver.get actually navigates to that page
        driver.navigate().to("https://www.google.com");
        driver.navigate().to("https://www.etsy.com");

        //maximize the window
       driver.manage().window().maximize();
      //  driver.manage().window().fullscreen();


        //navigate back
        driver.navigate().back();

        //navigate forward
        driver.navigate().forward();

        //navigate refresh
        driver.navigate().refresh();

        //quit and close
      //  driver.quit(); // quits the chrome browser
        driver.close();


    }
}
