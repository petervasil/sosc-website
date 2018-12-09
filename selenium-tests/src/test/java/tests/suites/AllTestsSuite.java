package tests.suites;

import com.environment.EnvironmentConfig;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        CommonTestsSuite.class,
        PagesTestsSuite.class
})

public class AllTestsSuite {

    @AfterClass
    public static void quit() {
        EnvironmentConfig.getInstance().getDriver().close();
        EnvironmentConfig.getInstance().getDriver().quit();
    }
}
