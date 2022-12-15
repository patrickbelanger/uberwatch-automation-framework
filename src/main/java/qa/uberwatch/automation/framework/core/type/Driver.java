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
package qa.uberwatch.automation.framework.core.type;


public enum Driver {

    BRAVE("Brave", "chromedriver.exe", "webdriver.chrome.driver"),
    CHROME("Chrome", "chromedriver.exe","webdriver.chrome.driver"),
    EDGE("Edge", "msedgedriver.exe", "webdriver.edge.driver"),
    EDGE_IE_MODE("Edge", "iedriverserver.exe", "webdriver.internet.exporer.driver"),
    FIREFOX("Firefox", "geckodriver.exe", "webdriver.gecko.driver")
    ;

    private String executable;
    private String name;
    private String systemPropertyValue;

    Driver(String name, String executable, String systemPropertyValue) {
        this.name = name;
        this.executable = executable;
        this.systemPropertyValue = systemPropertyValue;
    }

    public String getExecutable() {
        return this.executable;
    }

    public String getSystemPropertyValue() {
        return this.systemPropertyValue;
    }
}
