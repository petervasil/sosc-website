package tests.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.common.FooterTests;
import tests.common.NavbarTests;
import tests.common.OtherTests;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        OtherTests.class,
        NavbarTests.class,
        FooterTests.class
})

public class CommonTestsSuite {
}
