package tests;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
        System.out.println(driver.getTitle());
    }

    @After
    public void exit() {
        driver.quit();
    }
}
