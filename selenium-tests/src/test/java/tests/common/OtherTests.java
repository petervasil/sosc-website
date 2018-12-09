package tests.common;

import com.environment.EnvironmentConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class OtherTests {

    private WebDriver driver;
    private EnvironmentConfig environmentConfig;

    @Before
    public void beforeHook() {
        environmentConfig = EnvironmentConfig.getInstance();
        driver = environmentConfig.getDriver();
        driver.get(environmentConfig.getUrl());
    }

    @Test
    public void testTitle() {
        Assert.assertEquals("SOSC", driver.getTitle());
    }
}
