package tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import tests.suites.AllTestsSuite;

public class TestsRunner {

    public static void main(String[] args) {

        Result result = JUnitCore.runClasses(AllTestsSuite.class);

        if (!result.wasSuccessful()) {

            System.out.println("Tests failed !!!");

            for (Failure failure : result.getFailures()) {
                System.out.println("Failure: " + failure.toString());
            }

        } else {
            System.out.println("Tests were successful !!!");
        }
    }

}
