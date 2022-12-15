/*
 * Copyright 2022 Patrick Bélanger, and other contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package qa.uberwatch.automation.framework.core.base;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import qa.uberwatch.automation.framework.core.context.FrameworkContext;
import qa.uberwatch.automation.framework.core.webdrivers.WebDriverFactory;

@Slf4j
abstract class BaseTest extends FrameworkCore {

    @BeforeSuite
    public void frameworkSetUp() {
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        Logger rootLogger = loggerContext.getLogger("io.netty");
        rootLogger.setLevel(Level.OFF);
        loggerContext.getLogger("org.asynchttpclient");
        rootLogger.setLevel(Level.OFF);
        FrameworkBanner.show();
    }

    @BeforeTest
    public void testSetUp() {
        setFrameworkContext(new FrameworkContext());
        setWebDriver(WebDriverFactory.getWebDriver(getFrameworkContext().getDriver()));
    }

    @AfterTest
    public void testTearDown() {
        getWebDriver().quit();
    }

    @AfterSuite
    public void frameworkTearDown() {
        log.info("Tear down Automation framework");
    }
}
