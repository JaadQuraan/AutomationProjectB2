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
    public static void main(String[] args) {
        //setup the driver
        WebDriverManager.chromedriver().setup();

        //create driver object
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app/");
        //identify logo with css
        WebElement logo = driver.findElement(By.cssSelector("img[src='/img/logo.d7557277.svg']")); //finds the logo
        String docuport = logo.getAttribute("alt"); // gets the attribute alt from the logo

        if(DocuportConstants.LOGO_DOCUPORT.equalsIgnoreCase(docuport)){
            System.out.println("Expected Logo text: " + DocuportConstants.LOGO_DOCUPORT + ", matches actual logo text: " + docuport);
            System.out.println("Test PASSED");
        } else {
            System.out.println("Expected Logo text: " + DocuportConstants.LOGO_DOCUPORT + ", DOES NOT match actual logo text: " + docuport);
            System.out.println("Test FAILED");
        }
        System.out.println();

        //Locate username and password with css
        //Locate login with css
        //locate login with css
        //Locate home icon in top left after login or any element after login
        //Validate that login was successful that element is displayed



    }
}
