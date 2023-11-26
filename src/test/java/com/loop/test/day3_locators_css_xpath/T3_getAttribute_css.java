package com.loop.test.day3_locators_css_xpath;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
 * go to docuport application
 * identify docuport with css
 * get value of the attribute
 * Validate if  it is "Docuport"
 */
public class T3_getAttribute_css {
    public static void main(String[] args) throws InterruptedException {
        //setup the driver
        WebDriverManager.chromedriver().setup();

        //create driver object
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app/");
        //identify logo with css
        WebElement logo = driver.findElement(By.cssSelector("img[src='/img/logo.d7557277.svg']")); //finds the logo
        String docuport = logo.getAttribute("alt"); // gets the attribute alt from the logo

        if (DocuportConstants.LOGO_DOCUPORT.equalsIgnoreCase(docuport)) {
            System.out.println("Expected Logo text: " + DocuportConstants.LOGO_DOCUPORT + ", matches actual logo text: " + docuport);
            System.out.println("Test PASSED");
        } else {
            System.out.println("Expected Logo text: " + DocuportConstants.LOGO_DOCUPORT + ", DOES NOT match actual logo text: " + docuport);
            System.out.println("Test FAILED");
        }
        //Locate username and password with css

        WebElement username = driver.findElement(By.cssSelector("label[for='input-14']"));
        String actualUserText = username.getText();
        if (DocuportConstants.DOCUPORT_USERNAME.equalsIgnoreCase(actualUserText)) {
            System.out.println("Expected username text: " + DocuportConstants.DOCUPORT_USERNAME + ", matches actual username text: " + actualUserText);
            System.out.println("TEST PASSED");
        } else {
            System.out.println("Expected username text: " + DocuportConstants.DOCUPORT_USERNAME + ", DOES NOT match actual username text: " + actualUserText);
            System.out.println("TEST FAILED");
        }
        System.out.println();
        WebElement password = driver.findElement(By.cssSelector("label[for='input-15']"));
        String actualPasswordText = password.getText();
        if (DocuportConstants.DOCUPORT_PASSWORD.equalsIgnoreCase(actualPasswordText)) {
            System.out.println("Expected password text: " + DocuportConstants.DOCUPORT_PASSWORD + ", matches actual password text: " + actualPasswordText);
            System.out.println("TEST PASSED");
        } else {
            System.out.println("Expected password text: " + DocuportConstants.DOCUPORT_PASSWORD + ", DOES NOT match actual password text: " + actualPasswordText);
            System.out.println("TEST FAILED");
        }


        //Locate login with css

        WebElement login = driver.findElement(By.cssSelector("button[type='submit']"));
        String actualLoginText = login.getText();
        // System.out.println(actualLoginText); // Log in
        if (DocuportConstants.DOCUPORT_LOGIN.equalsIgnoreCase(actualLoginText)) {
            System.out.println("Expected login text: " + DocuportConstants.DOCUPORT_LOGIN + ", matches actual login text: " + actualLoginText);
            System.out.println("TEST PASSED");
        } else {
            System.out.println("Expected login text: " + DocuportConstants.DOCUPORT_LOGIN + ", DOES NOT match actual login text: " + actualLoginText);
            System.out.println("TEST FAILED");
            //Locate home icon in top left after login or any element after login
        }

        WebElement usernameInput = driver.findElement(By.cssSelector("label[for='input-14'] + input"));
        WebElement passwordInput = driver.findElement(By.cssSelector("label[for='input-15'] + input"));


        usernameInput.sendKeys(DocuportConstants.USERNAME_CLIENT);
        passwordInput.sendKeys(DocuportConstants.PASSWORD_CLIENT);
        login.click();
        Thread.sleep(1000);
        WebElement cont = driver.findElement(By.cssSelector("button[type='submit']"));
         cont.click();

         //locate the home icon of docuport after login
        //validate that you logged in
        System.out.println("After login");
        if (DocuportConstants.LOGO_DOCUPORT.equalsIgnoreCase(docuport)) {
            System.out.println("Expected Logo text: " + DocuportConstants.LOGO_DOCUPORT + ", matches actual logo text: " + docuport);
            System.out.println("Test PASSED");
        } else {
            System.out.println("Expected Logo text: " + DocuportConstants.LOGO_DOCUPORT + ", DOES NOT match actual logo text: " + docuport);
            System.out.println("Test FAILED");
        }
        Thread.sleep(1000);
        driver.close();


       // driver.findElement(By.linkText("link text"));

        }
    }

