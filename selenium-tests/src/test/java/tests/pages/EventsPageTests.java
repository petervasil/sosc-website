package tests.pages;

import com.environment.EnvironmentConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EventsPageTests {

    private WebDriver driver;
    private EnvironmentConfig environmentConfig;

    @Before
    public void beforeHook() {
        environmentConfig = EnvironmentConfig.getInstance();
        driver = environmentConfig.getDriver();
        driver.get(environmentConfig.getUrl() + "/events");
    }

    @Test
    public void checkThereAreSomeEvents() {
        List<WebElement> eventsList = driver.findElements(By.xpath("//*[@id=\"flexContainer\"]/main/div/div/div/div"));

        Assert.assertTrue(!eventsList.isEmpty());
    }

    @Test
    public void checkEventsHaveRightClass() {
        List<WebElement> eventsList = driver.findElements(By.xpath("//*[@id=\"flexContainer\"]/main/div/div/div/div"));

        for (WebElement event : eventsList) {
            Assert.assertTrue(event.getAttribute("class").contains("card elevate white-bg"));
        }
    }

    @Test
    public void checkUrl() {
        Assert.assertEquals(environmentConfig.getUrl() + "/events/", driver.getCurrentUrl());
    }

    @Test
    public void checkNavLinkIsActive() {
        WebElement link = driver.findElement(By.xpath("//*[@id=\"flexContainer\"]/div/div/div/ul/li[2]/a"));

        Assert.assertTrue(link.getAttribute("class").contains("active"));
    }

}
