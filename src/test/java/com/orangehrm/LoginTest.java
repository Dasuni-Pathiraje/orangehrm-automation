package com.orangehrm;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginTest {

//    WebDriver driver;

    BaseTest baseTest = new BaseTest();
    String instanceName = "https://dpsurko272upgrade-temp7-kord.orangehrm.com";
    String instanceUserName = "admin";
    String instancePassword = "admin@OHRM123";

//    WebDriverWait wait;
    @Test
    public void loginTo(){
        baseTest.openBrowser();
        baseTest.navigateToURL(instanceName);
        baseTest.enterUserName(instanceUserName);
        baseTest.enterPassword(instancePassword);
        baseTest.clickLogin();

        WebDriverWait wait = new WebDriverWait(baseTest.driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Employee Management")));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Employee Management']")));

        String actualCurrent = baseTest.getCurrentURL();
        String expectedCurrent = instanceName +"/client/#/dashboard";

        Assert.assertEquals(actualCurrent, expectedCurrent, "Login is Successful");
//        Assert.assertNotEquals(actualCurrent,expectedCurrent, "Login is not Successful");

        baseTest.closeBrowser();
    }
}
