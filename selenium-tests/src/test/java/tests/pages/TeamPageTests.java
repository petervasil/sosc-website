package tests.pages;

import com.environment.EnvironmentConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TeamPageTests {

    private WebDriver driver;
    private EnvironmentConfig environmentConfig;

    @Before
    public void beforeHook() {
        environmentConfig = EnvironmentConfig.getInstance();
        driver = environmentConfig.getDriver();
        driver.get(environmentConfig.getUrl() + "/team");
    }

    @Test
    public void checkThereAreSomeCoordinators() {
        List<WebElement> peopleList = driver.findElements(By.xpath("//*[@id=\"flexContainer\"]/main/div/div/div[1]/div"));

        Assert.assertTrue(!peopleList.isEmpty());
    }

    @Test
    public void checkThereAreSomeMembers() {
        List<WebElement> peopleList = driver.findElements(By.xpath("//*[@id=\"flexContainer\"]/main/div/div/div[2]/div"));

        Assert.assertTrue(!peopleList.isEmpty());
    }

    @Test
    public void checkCoordinatorsHaveRightClass() {
        List<WebElement> peopleList = driver.findElements(By.xpath("//*[@id=\"flexContainer\"]/main/div/div/div[1]/div"));

        for (WebElement person : peopleList) {
            Assert.assertTrue(person.getAttribute("class").contains("member-card"));
            Assert.assertTrue(person.getAttribute("class").contains("elevate"));
            Assert.assertTrue(person.getAttribute("class").contains("white-bg"));
        }
    }

    @Test
    public void checkMembersHaveRightClass() {
        List<WebElement> peopleList = driver.findElements(By.xpath("//*[@id=\"flexContainer\"]/main/div/div/div[2]/div"));

        for (WebElement person : peopleList) {
            Assert.assertTrue(person.getAttribute("class").contains("member-card elevate white-bg"));
        }
    }

    @Test
    public void checkAllMembersHavePhoto() {
        List<WebElement> peopleList = driver.findElements(By.xpath("//*[@id=\"flexContainer\"]/main/div/div/div[2]/div"));

        WebDriverWait wait = new WebDriverWait(driver, 2000);

        for (WebElement person : peopleList) {
            wait.until(ExpectedConditions.visibilityOf(person.findElement(By.xpath("img"))));
            Assert.assertFalse(person.findElements(By.xpath("img")).isEmpty());
        }
    }

    @Test
    public void checkUrl() {
        Assert.assertEquals(environmentConfig.getUrl() + "/team/", driver.getCurrentUrl());
    }

    @Test
    public void checkNavLinkIsActive() {
        WebElement link = driver.findElement(By.xpath("//*[@id=\"flexContainer\"]/div/div/div/ul/li[4]/a"));

        Assert.assertTrue(link.getAttribute("class").contains("active"));
    }
}
