package com.loop.test.day3_locators_css_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Navigate to Google search
 * maximize the page
 * get title of the page
 * get url of the page
 * validate the title, expected title is "Google"
 * validate the url of the page, expected url is "https://www.google.com/"
 * close the brower
 */
public class GoogleSearch {
    public static void main(String[] args) {
        //setup the driver
        WebDriverManager.chromedriver().setup();

        //create driver object
        WebDriver driver = new ChromeDriver();
        //Webdriver is an interface. ChromeDriver is a class

        //Navigate to google
        driver.get("https://www.google.com/");

        //driver.quit();

        //Maximize the window
        driver.manage().window().maximize();

        String expectedTitle = "Google";

        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Actual title: " + actualTitle + ", matches expected title" + expectedTitle + ", =>Test PASS");
        } else {
            System.err.println("Actual title: " +  actualTitle + " does NOT match expected title: " +  expectedTitle + ", => Test FAIL");
            //error in red
        }

        String expectedURL = "https://www.google.com/";
        String actualURL =  driver.getCurrentUrl();

        if(actualURL.equals(expectedURL)){
            System.out.println("Actual URL: " + actualURL + ", matches expected URL" + expectedURL + ", =>Test PASS");
        } else {
            System.err.println("Actual URL: " +  actualURL + " does NOT match expected URL: " +  expectedURL + ", => Test FAIL");
            //error in red
        }

        driver.close(); //Only closes the page you are using

    }
}
