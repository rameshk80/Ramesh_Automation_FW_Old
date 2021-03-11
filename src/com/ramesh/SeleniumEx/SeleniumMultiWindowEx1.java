package com.ramesh.SeleniumEx;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SelniumMultiWindowEx1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/rasandesh/Code/Drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.manage().window().maximize();
        driver.get("https://developer.salesforce.com/signup");

        WebElement link = new RemoteWebElement();
        link = driver.findElement(By.partialLinkText("Terms of"));

        Actions action = new Actions(driver);
        action.keyDown(Keys.SHIFT).click(link).keyUp(Keys.SHIFT).build().perform();
        Thread.sleep(4000);

        Set<String> windows = driver.getWindowHandles();
        for(String s: windows)
        {
            driver.switchTo().window(s);
            System.out.println(driver.getTitle());
        }
        System.out.println(driver.getWindowHandle());
        Thread.sleep(4000);
        driver.quit();
    }
}
