package tests.pages;

import com.environment.EnvironmentConfig;
import com.mocks.MockFactory;
import com.models.HomePage;
import com.utils.CompareUtils;
import com.utils.PageUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageTests {

    private WebDriver driver;
    private EnvironmentConfig environmentConfig;

    @Before
    public void beforeHook() {
        environmentConfig = EnvironmentConfig.getInstance();
        driver = environmentConfig.getDriver();
        driver.get(environmentConfig.getUrl() + "/");
    }

    @Test
    public void checkContent() {
        HomePage homePage = (HomePage) PageUtils.getObjectFromPage(HomePage.class, driver);
        HomePage expectedHomePage = MockFactory.getHomePage();

        Assert.assertTrue(CompareUtils.compareObjects(expectedHomePage, homePage));
    }

    @Test
    public void checkLearnMoreButton() {
        WebElement learnMoreButton = driver.findElement(By.xpath("//*[@id=\"flexContainer\"]/main/div/div[4]/section/div[2]/a"));

        Assert.assertEquals("Learn More", learnMoreButton.getText());

        Assert.assertEquals(environmentConfig.getUrl() + "/team", learnMoreButton.getAttribute("href"));

    }

    @Test
    public void checkBecomeMemberButton() {
        WebElement becomeMemberButton = driver.findElement(By.xpath("//*[@id=\"flexContainer\"]/main/div/div[1]/section/div[1]/a"));

        Assert.assertEquals("Become a member", becomeMemberButton.getText());

        Assert.assertEquals("https://goo.gl/forms/XH41TwlMxOeRwmdQ2", becomeMemberButton.getAttribute("href"));

    }

    @Test
    public void checkUrl() {
        Assert.assertEquals(environmentConfig.getUrl() + "/", driver.getCurrentUrl());
    }

}
