package tests.pages;

import com.environment.EnvironmentConfig;
import com.mocks.MockFactory;
import com.models.Blog;
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

public class OneBlogTests {

    private WebDriver driver;
    private EnvironmentConfig environmentConfig;

    @Before
    public void beforeHook() {
        environmentConfig = EnvironmentConfig.getInstance();
        driver = environmentConfig.getDriver();
        driver.get(environmentConfig.getUrl() + "/blog/lessons-from-hosting-hackathon-for-beginners");
    }

    @Test
    public void checkBlogContent() {

        Blog blog = (Blog) PageUtils.getObjectFromPage(Blog.class, driver);

        Blog expectedBlog = MockFactory.getBlog();

        Assert.assertTrue(CompareUtils.compareObjects(expectedBlog, blog));
    }

    @Test
    public void checkBlogImage() {

        WebDriverWait wait = new WebDriverWait(driver, 5000);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"flexContainer\"]/main/div/div/div/div[1]/div[2]/div/picture/img"))));

        WebElement image = driver.findElement(By.xpath("//*[@id=\"flexContainer\"]/main/div/div/div/div[1]/div[2]/div/picture/img"));

        Assert.assertEquals("https://sosc.org.in/static/5cb90dd8a674edaf49fd9231a69439b3/7917f/cover.jpg", image.getAttribute("src"));
    }

//    @Test
//    public void checkShareButtons() {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//
//        WebDriverWait wait = new WebDriverWait(driver, 5000);
//
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"form\"]/form/div/div[4]/div/div/section/div[1]/ul/li[1]"))));
//
//        List<WebElement> shareButtons = driver.findElements(By.xpath("//*[@id=\"form\"]/form/div/div[4]/div/div/section/div[1]/ul/li"));
//
//        Assert.assertEquals(4, shareButtons.size());
//
//        String[] buttonsLinks = {"auth:disqus", "auth:facebook", "auth:twitter", "auth:google"};
//
//        for (int i = 0; i < shareButtons.size(); i++) {
//            String dataAction = shareButtons.get(i).findElement(By.xpath("button")).getAttribute("data-action");
//            Assert.assertEquals(buttonsLinks[i], dataAction);
//        }
//
//    }
}
