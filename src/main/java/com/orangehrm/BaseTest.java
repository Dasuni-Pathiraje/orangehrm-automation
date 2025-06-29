package com.orangehrm;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class BaseTest {

    WebDriver driver;
//    WebDriverWait wait;

    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    public void navigateToURL(String url){
        driver.get(url);
    }

    public void closeBrowser(){
        driver.quit();
    }

    public void enterUserName(String username){
        WebElement userName = driver.findElement(By.id("txtUsername"));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.elementToBeSelected(userName));
        userName.sendKeys(username);
    }

    public void enterPassword(String password){
        WebElement passwordElement = driver.findElement(By.id("txtPassword"));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.elementToBeSelected(passwordElement));
        passwordElement.sendKeys(password);
    }

    public void clickLogin(){
        WebElement loginButton = driver.findElement(By.xpath("//button[@type = 'submit']"));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
    }

    public String getCurrentURL(){
        return driver.getCurrentUrl();
    }

}
