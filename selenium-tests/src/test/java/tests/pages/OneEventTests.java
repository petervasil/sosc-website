package tests.pages;

import com.environment.EnvironmentConfig;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class OneEventTests {

    private WebDriver driver;
    private EnvironmentConfig environmentConfig;

    @Before
    public void beforeHook() {
        environmentConfig = EnvironmentConfig.getInstance();
        driver = environmentConfig.getDriver();
        driver.get(environmentConfig.getUrl());
    }

    @Test
    public void test() {
        System.out.println("Testing " + this.getClass().getName());
    }

}
