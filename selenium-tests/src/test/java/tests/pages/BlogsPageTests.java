package tests.pages;

import com.environment.EnvironmentConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BlogsPageTests {

    private WebDriver driver;
    private EnvironmentConfig environmentConfig;

    @Before
    public void beforeHook() {
        environmentConfig = EnvironmentConfig.getInstance();
        driver = environmentConfig.getDriver();
        driver.get(environmentConfig.getUrl() + "/blog");
    }

    @Test
    public void checkThereAreSomeBlogs() {
        List<WebElement> blogsList = driver.findElements(By.xpath("//*[@id=\"flexContainer\"]/main/div/div/section/div/div"));

        Assert.assertTrue(!blogsList.isEmpty());
    }

    @Test
    public void checkBlogsHaveRightClass() {
        List<WebElement> blogsList = driver.findElements(By.xpath("//*[@id=\"flexContainer\"]/main/div/div/section/div/div"));

        for (WebElement event : blogsList) {
            Assert.assertTrue(event.getAttribute("class").contains("blog-card elevate white-bg"));
        }
    }

    @Test
    public void checkUrl() {
        Assert.assertEquals(environmentConfig.getUrl() + "/blog/", driver.getCurrentUrl());
    }

    @Test
    public void checkNavLinkIsActive() {
        WebElement link = driver.findElement(By.xpath("//*[@id=\"flexContainer\"]/div/div/div/ul/li[3]/a"));

        Assert.assertTrue(link.getAttribute("class").contains("active"));
    }
}
