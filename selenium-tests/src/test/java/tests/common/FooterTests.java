package tests.common;

import com.environment.EnvironmentConfig;
import com.mocks.MockFactory;
import com.models.Footer;
import com.utils.CompareUtils;
import com.utils.PageUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class FooterTests {

    private WebDriver driver;
    private EnvironmentConfig environmentConfig;

    @Before
    public void beforeHook() {
        environmentConfig = EnvironmentConfig.getInstance();
        driver = environmentConfig.getDriver();
        driver.get(environmentConfig.getUrl());
    }

    @Test
    public void testFooterContentTexts() {
        Footer footer = (Footer) PageUtils.getObjectFromPage(Footer.class, driver);

        Footer expectedFooter = MockFactory.getFooter();

        Assert.assertTrue(CompareUtils.compareObjects(footer, expectedFooter));
    }

}
