package com.ramesh.SeleniumEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElementEx2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/rasandesh/Code/Drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://latex.now.sh/elements");
        driver.findElement(By.id("input__text")).sendKeys("baby toys");


        Thread.sleep(1000);
        System.out.println(driver.findElement(By.id("radio1")).isSelected());
        System.out.println(driver.findElement(By.id("radio2")).isDisplayed());
        System.out.println(driver.findElement(By.id("radio2")).isSelected());
        System.out.println(driver.findElement(By.id("radio2")).isEnabled());
        driver.findElement(By.id("radio2")).click();
        System.out.println(driver.findElement(By.id("radio1")).isSelected());
        System.out.println(driver.findElement(By.id("radio2")).isSelected());

        //drop down
        Select list1 = new Select(driver.findElement(By.id("select")));
        List<WebElement> element1 = list1.getOptions();
        for (WebElement e1 : element1) {
            System.out.println(e1.getText());
        }
        list1.selectByIndex(2);
        Thread.sleep(3000);

        driver.quit();

    }
}