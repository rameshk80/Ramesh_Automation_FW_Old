package com.ramesh.SeleniumEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class findElementsEx1 {
    public static void main(String[] args)  throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/rasandesh/Code/Drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/chromium/package-summary.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.switchTo().frame(0);

        List<WebElement> e = driver.findElements(By.tagName("a"));
        System.out.println(e.size());
        for (WebElement w: e
             ) {
            System.out.println(w.getText());
        }

        Thread.sleep(3000);
        driver.quit();
    }
    }
