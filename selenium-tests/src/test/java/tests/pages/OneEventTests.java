package tests.pages;

import com.environment.EnvironmentConfig;
import com.mocks.MockFactory;
import com.models.Event;
import com.utils.CompareUtils;
import com.utils.PageUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OneEventTests {

    private WebDriver driver;
    private EnvironmentConfig environmentConfig;

    @Before
    public void beforeHook() {
        environmentConfig = EnvironmentConfig.getInstance();
        driver = environmentConfig.getDriver();
        driver.get(environmentConfig.getUrl() + "/events/intro-to-data-manipulation-and-data-visualization");
    }

    @Test
    public void checkEventContent() {

        Event event = (Event) PageUtils.getObjectFromPage(Event.class, driver);

        Event expectedEvent = MockFactory.getEvent();

        Assert.assertTrue(CompareUtils.compareObjects(expectedEvent, event));
    }

    @Test
    public void checkEventImage() {

        WebDriverWait wait = new WebDriverWait(driver, 5000);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"flexContainer\"]/main/div/div/div/div/div[1]/picture/img"))));

        WebElement image = driver.findElement(By.xpath("//*[@id=\"flexContainer\"]/main/div/div/div/div/div[1]/picture/img"));

        Assert.assertEquals("https://sosc.org.in/static/0b3f064278e686cbb27dcaffea132b9f/91ba7/cover.png", image.getAttribute("src"));
    }

}
