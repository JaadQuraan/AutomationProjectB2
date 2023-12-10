package com.loop.test.day5_day5_testNG_checkbox_radioButton_dropdown;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T6_dropdown_without_select {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void testDropdown() throws InterruptedException {
        WebElement userName = driver.findElement(By.xpath("//input[@id='input-14']"));
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));

        userName.sendKeys(DocuportConstants.USERNAME_ADVISOR);
        password.sendKeys(DocuportConstants.PASSWORD_ADVISOR);
        login.click();
        WebElement receivedDocuments = driver.findElement(By.xpath("//span[.='Received docs']"));
        receivedDocuments.click();
        WebElement searchButton = driver.findElement(By.xpath("//span[contains(text(), 'Search')]"));
        searchButton.click();

       // WebElement statusButton = driver.findElement(By.xpath("//div[@class='v-select__slot']/label[contains(.,'Status')]"));
        WebElement statusButton = driver.findElement(By.xpath("(//label[.='Status']/../div/following-sibling::div)[2]"));
        statusButton.click();
        Thread.sleep(1000);
        WebElement inProgress = driver.findElement(By.xpath("//div[contains(text(), 'In progress')]"));
        inProgress.click();

    }
}
//You can setup chrome driver to a specific version
