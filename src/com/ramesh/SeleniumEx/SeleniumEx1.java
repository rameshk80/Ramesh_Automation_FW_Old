package com.ramesh.SeleniumEx;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumEx1 {
    public static void main(String[] args)  throws InterruptedException{
        System.setProperty("webdriver.gecko.driver", "/Users/rasandesh/Code/Drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        try {
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //driver.manage().window().maximize();
            driver.get("https://www.google.com");
            WebElement element = driver.findElement(By.name("q"));
            element.sendKeys("Selenium");
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
            //Thread.sleep(1000);
            driver.findElement(By.name("btnK")).click();
            driver.findElement(new By.ByPartialLinkText("SeleniumHQ")).click();
            Thread.sleep(3000);
            //WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("gsc-i-id1")));

            try {
                Assert.assertEquals(driver.getTitle(), "SeleniumHQ");
            }
            catch(AssertionError e) {
                System.out.println("The assertion error is: " + e);
            }

            String title = driver.getTitle();
            Assert.assertTrue(title.contains("Selenium"));
            System.out.println("The title contain the Selenium word");
        }
        catch(AssertionError error)
        {
            System.out.println("The other error is: " + error);
        }
        finally {
            driver.quit();
        }
    }
}
