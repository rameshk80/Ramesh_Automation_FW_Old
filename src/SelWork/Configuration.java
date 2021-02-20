package SelWork;

import org.openqa.selenium.WebDriver;

public class Configuration {
    private String browser_name;
    private String driver_path;
    private String application_url;

    public String getBrowser_name() {
        return browser_name;
    }

    public void setBrowser_name(String browser_name) {
        this.browser_name = browser_name;
    }

    public String getDriver_path() {
        return driver_path;
    }

    public void setDriver_path(String driver_path) {
        this.driver_path = driver_path;
    }

    public String getApplication_url() {
        return application_url;
    }

    public void setApplication_url(String application_url) {
        this.application_url = application_url;
    }

    //Default setting
    Configuration()
    {
        browser_name = "Firefox";
        driver_path = "/Users/rasandesh/Code/Drivers/geckodriver";
        application_url = "https://www.google.com";
    }



}
