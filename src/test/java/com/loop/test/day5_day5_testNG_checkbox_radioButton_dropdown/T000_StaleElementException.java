package com.loop.test.day5_day5_testNG_checkbox_radioButton_dropdown;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.*;

import java.time.Duration;

//        1. Open Chrome browser
//        2. Go to http://the-internet.herokuapp.com/add_remove_elements/
//        3. Click to “Add Element” button
//        4. Verify “Delete” button is displayed after clicking.
//        5. Click to “Delete” button.
//        6. Verify “Delete” button is NOT displayed after clicking.
//        USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
public class T000_StaleElementException {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://loopcamp.vercel.app/add-remove-elements.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //WebElement addButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        WebElement addButton = driver.findElement(By.xpath("//button[contains(text(),'Add Element')]"));
        addButton.click();
        WebElement deleteButton = driver.findElement(By.xpath("//button[contains(text(),'Delete')]"));
        if(deleteButton.isDisplayed()){
            System.out.println("Delete button is displayed");
        } else {
            System.out.println("Delete button is not displayed");
        }

        deleteButton.click();
        try {
            deleteButton.isDisplayed();
        }catch (StaleElementReferenceException s){
            System.out.println("Exception Handled");
            System.out.println("Element is not displayed anymore");
            System.out.println(s.getMessage());
        }



    }
}
