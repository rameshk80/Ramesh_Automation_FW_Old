package SelWork;

import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class TestMain {
    public static void main(String[] args) throws InterruptedException {
        Properties properties = new Properties();
        WebdriverFactory objDriverFactory = new WebdriverFactory();
        objDriverFactory.initializeWebdriver();

        objDriverFactory.navigateTo();
        Thread.sleep(4000);
        objDriverFactory.quit();
    }
}
