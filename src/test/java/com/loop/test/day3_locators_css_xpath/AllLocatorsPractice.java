package com.loop.test.day3_locators_css_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocatorsPractice {
    public static void main(String[] args) {
        //setup the driver
        WebDriverManager.chromedriver().setup();

        //create driver object
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://loopcamp.vercel.app/registration_form.html");

        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Loop");
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Academy");
        //this will return us 3 elements,  and always will click the first one,
        //pay attention to locate unique elements
        // control + f //*[@name='gender']
        WebElement gender = driver.findElement(By.name("gender"));
        gender.click();



    }
}
