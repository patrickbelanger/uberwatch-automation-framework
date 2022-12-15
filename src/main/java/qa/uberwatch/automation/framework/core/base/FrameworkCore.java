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

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import qa.uberwatch.automation.framework.core.context.FrameworkContext;

import java.util.List;

abstract class FrameworkCore {

    private ThreadLocal<FrameworkContext> frameworkContext = new ThreadLocal<>();
    private ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();
    private ThreadLocal<WebElement> webElement = new ThreadLocal<>();
    private ThreadLocal<List<WebElement>> webElements = new ThreadLocal<>();

    public FrameworkContext getFrameworkContext() {
        return this.frameworkContext.get();
    }

    public void setFrameworkContext(FrameworkContext frameworkContext) {
        this.frameworkContext.set(frameworkContext);
    }

    public WebDriver getWebDriver() {
        return this.webDriver.get();
    }

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver.set(webDriver);
    }

    public WebElement getWebElement() {
        return this.webElement.get();
    }

    public void setWebElement(WebElement webElement) {
        this.webElement.set(webElement);
    }

    public List<WebElement> getWebElements() {
        return this.webElements.get();
    }

    public void setWebElements(List<WebElement> webElements) {
        this.webElements.set(webElements);
    }
}
