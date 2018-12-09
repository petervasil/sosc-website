package tests.common;

import com.environment.EnvironmentConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Calendar;

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


    @Test
    public void testCopyright() {
        String copyrightText = driver.findElement(By.xpath("//*[@id=\"flexContainer\"]/footer/div[2]/p")).getText();

        Assert.assertEquals("SOSC © " + Calendar.getInstance().get(Calendar.YEAR), copyrightText);
    }


}
