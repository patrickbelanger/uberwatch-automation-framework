package qa.uberwatch.automation.framework.core.base;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

@Slf4j
abstract class BaseTest extends FrameworkCore {

    @BeforeSuite
    public void frameworkSetUp() {
        new FrameworkBanner().show();
    }

    @BeforeTest
    public void testSetUp() {

    }

    @AfterTest
    public void testTearDown() {

    }

    @AfterSuite
    public void frameworkTearDown() {
        log.info("Tear down Automation framework");
    }
}
