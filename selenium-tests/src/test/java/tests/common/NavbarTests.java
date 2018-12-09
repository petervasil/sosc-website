package tests.common;

import com.environment.EnvironmentConfig;
import com.mocks.MockFactory;
import com.models.Navbar;
import com.utils.CompareUtils;
import com.utils.PageUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavbarTests {

    private WebDriver driver;
    private EnvironmentConfig environmentConfig;

    @Before
    public void beforeHook() {
        environmentConfig = EnvironmentConfig.getInstance();
        driver = environmentConfig.getDriver();
        driver.get(environmentConfig.getUrl());
    }

    @Test
    public void testTextsOfNavigationItems() {
        Navbar navbar = (Navbar) PageUtils.getObjectFromPage(Navbar.class, driver);

        Navbar expectedNavbar = MockFactory.getNavbar();

        Assert.assertTrue(CompareUtils.compareObjects(navbar, expectedNavbar));
    }

    @Test
    public void testCountOfNavigationLinks() {
        Assert.assertEquals(4, driver.findElements(By.xpath("//*[@id=\"flexContainer\"]/div/div/div/ul/li/a")).size());
    }

    @Test
    public void testActiveLinks() {

        WebDriverWait webDriverWait = new WebDriverWait(driver, 2000);

        for (int i = 1; i <= 4; i++) {
            WebElement link;

            link = driver.findElement(By.xpath(String.format("//*[@id=\"flexContainer\"]/div/div/div/ul/li[%d]/a", i)));

            link.click();

            try {
                webDriverWait.until(ExpectedConditions.attributeContains(link, "class", "active"));
            } catch (StaleElementReferenceException e) {
                link = driver.findElement(By.xpath(String.format("//*[@id=\"flexContainer\"]/div/div/div/ul/li[%d]/a", i)));
                webDriverWait.until(ExpectedConditions.attributeContains(link, "class", "active"));
            }

            Assert.assertTrue(link.getAttribute("class").contains("active"));

        }

    }

}
