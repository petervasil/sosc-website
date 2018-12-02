package tests.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        CommonTestsSuite.class,
        PagesTestsSuite.class
})

public class AllTestsSuite {
}
