package SelWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class WebdriverFactory {
    public WebDriver getWebdriver()
    {
        WebDriver driver = null;
        Properties properties = new Properties();
        try
        {
            properties.load(new FileInputStream("./config.properties"));
        }
        catch(FileNotFoundException exception)
        {
            System.out.println("config.properties file not found");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        String browser_name = properties.getProperty("BROWSER_NAME");
        if(browser_name.equalsIgnoreCase ("Firefox"))
        {
            System.setProperty("webdriver.gecko.driver", properties.getProperty("FIREFOX_DRIVER_PATH"));
            driver = new FirefoxDriver();
        }
        else if(browser_name.equalsIgnoreCase("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver", properties.getProperty("CHROME_DRIVER_PATH"));
            driver = new ChromeDriver();
        }

        return driver;
    }
}
