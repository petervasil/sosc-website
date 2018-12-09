package com.environment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class EnvironmentConfig {

    private static volatile EnvironmentConfig environmentConfig;

    private WebDriver driver;
    private String url;

    private EnvironmentConfig(String configFile) {
        if (configFile.isEmpty()) {
            String pathToWebdriver = System.getProperty("user.dir") +
                    File.separator + "webdrivers" + File.separator + "chrome"
                    + File.separator + "chromedriver";

            System.setProperty("webdriver.chrome.driver", pathToWebdriver);

            this.driver = new ChromeDriver();
            this.url = "https://sosc.org.in";

        }
    }

    public static synchronized EnvironmentConfig getInstance(String configFile) {

        if (environmentConfig != null) {
            return environmentConfig;
        }

        environmentConfig = new EnvironmentConfig(configFile);

        return environmentConfig;
    }

    public static synchronized EnvironmentConfig getInstance() {
        return getInstance("");
    }

    public String getUrl() {
        return url;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
