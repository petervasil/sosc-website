package tests.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.pages.*;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        HomePageTests.class,
        EventsPageTests.class,
        BlogsPageTests.class,
        TeamPageTests.class,
        OneEventTests.class,
        OneBlogTests.class
})

public class PagesTestsSuite {
}
