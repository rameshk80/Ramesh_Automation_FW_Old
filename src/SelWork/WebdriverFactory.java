package SelWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class WebdriverFactory {
    private Configuration config;
    private Properties properties;
    private WebDriver driver;

    public WebdriverFactory() {
        this.config = new Configuration();
        this.properties = new Properties();
    }

    public void initializeWebdriver()
    {
        try
        {
            properties.load(new FileInputStream("/Users/rasandesh/Code/Java/src/SelWork/config.properties"));
        }
        catch(FileNotFoundException exception)
        {
            System.out.println("config.properties file not found");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        config.setBrowser_name(properties.getProperty("BROWSER_NAME"));
        if(config.getBrowser_name().equalsIgnoreCase ("Firefox"))
        {
            System.setProperty("webdriver.gecko.driver", properties.getProperty("FIREFOX_DRIVER_PATH"));
            driver = new FirefoxDriver();
        }
        else if(config.getBrowser_name().equalsIgnoreCase("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver", properties.getProperty("CHROME_DRIVER_PATH"));
            driver = new ChromeDriver();
        }

        //Set the application URL
        config.setApplication_url(properties.getProperty("URL"));
    }

    public void navigateTo()
    {
        config.getDriver().get(config.getApplication_url());
    }

    public void quit()
    {
        config.getDriver().quit();
    }
}
