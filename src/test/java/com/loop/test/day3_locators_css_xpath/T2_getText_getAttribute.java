package com.loop.test.day3_locators_css_xpath;

import com.loop.test.utilities.LoopCampConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {


        /*
    go to url: https://loopcamp.vercel.app/registration_form.html
    verify header text expected:  Registration form
    verify placeholder attribute value expected - username
    //Placeholder is not the text so we need to use getAttribute
     */

        //go to the url
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://loopcamp.vercel.app/registration_form.html");

        WebElement headerForForm = driver.findElement(By.tagName("h2"));
        String actualHeaderForForm = headerForForm.getText();

        if(actualHeaderForForm.equals(LoopCampConstants.EXPECTED_HEADER_FOR_FORM)){
            System.out.println("Expected header for form: \"" +
                    LoopCampConstants.EXPECTED_HEADER_FOR_FORM + "\", matches actual header: \"" +
                    actualHeaderForForm + "\" = Test Passed");
        } else {
            System.out.println("Expected header for form: \"" +
                    LoopCampConstants.EXPECTED_HEADER_FOR_FORM + "\", DOES NOT match actual header: \"" +
                    actualHeaderForForm + "\" = TEST FAILED");
        }

        WebElement userNamePlaceHolder = driver.findElement(By.name("username")); // We identified the element
        String actualPlaceHolderForUsername = userNamePlaceHolder.getAttribute("placeholder"); //  On that element give us the attribute placeholder

        if(actualPlaceHolderForUsername.equals(LoopCampConstants.EXPECTED_PLACEHOLDER_USERNAME)){
            System.out.println("Expected placeholder for username: \"" +
                    LoopCampConstants.EXPECTED_PLACEHOLDER_USERNAME + "\", matches actual placeholder: \"" +
                    actualHeaderForForm + "\" = Test Passed");
        } else {
            System.out.println("Expected placeholder for username: \"" +
                    LoopCampConstants.EXPECTED_PLACEHOLDER_USERNAME+ "\", DOES NOT match actual placeholder: \"" +
                    actualHeaderForForm + "\" = TEST FAILED");
        }
    }
    /*
    Get text gets the text of web element between open and close tags <>text<>
    To get the value of any attribute, get text will not work. Get the value of any attribute we pass
     */
}
