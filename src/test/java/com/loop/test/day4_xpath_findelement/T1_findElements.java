package com.loop.test.day4_xpath_findelement;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

//Go to nba.com and locate all links
public class T1_findElements {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://nba.com");

        List<WebElement> nbaLinks = driver.findElements(By.tagName("a"));
        System.out.println("nbaLinks.size():" + nbaLinks.size());
    //findElements returns a List

        List<WebElement> nbaLinksXpath = driver.findElements(By.xpath("//a"));
        System.out.println("nbaLinksXpath.size() = " + nbaLinksXpath.size());

        for (WebElement nbaLink : nbaLinks) {
            if (!nbaLink.getText().equals("")) {
                System.out.println("nba Link = " + nbaLink.getText());
            }
        }
        for (WebElement nbaLink : nbaLinks) {
                System.out.println("nba Link = " + nbaLink.getAttribute("href"));
        }

        for (int i = 0; i < nbaLinks.size(); i++) {
            if(!nbaLinks.get(i).getText().equals("")){
                System.out.println("nba Link = " + nbaLinks.get(i).getText());
                System.out.println("nba Link = " + nbaLinks.get(i).getAttribute("href"));
            }
        }
        driver.quit();
    }
}
