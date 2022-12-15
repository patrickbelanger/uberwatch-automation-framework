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
package qa.uberwatch.automation.framework.core.webdrivers;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import qa.uberwatch.automation.framework.core.configuration.FrameworkConfiguration;
import qa.uberwatch.automation.framework.core.type.Driver;

public class WebDriverFactory {

    private static FrameworkConfiguration frameworkConfiguration = ConfigFactory.create(FrameworkConfiguration.class);

    public static WebDriver getWebDriver(Driver driver) {
        System.setProperty(Driver.CHROME.getSystemPropertyValue(), getWebDriverExecutablePath(driver));
        return new ChromeDriver();
    }

    private static String getWebDriverExecutablePath(Driver driver) {
        return String.format("%s%s", frameworkConfiguration.webdriverDefaultPath(), driver.getExecutable());
    }
}
