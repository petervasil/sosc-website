package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllTests {

    private WebDriver driver;

    @Before
    public void init() {
        // Setup Chrome Driver
        System.setProperty("webdriver.chrome.driver", "webdrivers/chrome/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testTitle() {
        driver.get("http://google.com");
        WebDriverWait webDriverWait = new WebDriverWait(driver, 5000);

        WebElement element = driver.findElement(By.xpath(""));

        webDriverWait.until(ExpectedConditions.visibilityOf(element)).click();

        System.out.println(driver.getTitle());
    }

    @After
    public void exit() {
        driver.quit();
    }
}
