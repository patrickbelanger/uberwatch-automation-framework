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
package qa.uberwatch.automation.framework.core.context;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import org.aeonbits.owner.ConfigFactory;
import qa.uberwatch.automation.framework.core.configuration.FrameworkConfiguration;
import qa.uberwatch.automation.framework.core.type.Driver;

import java.util.Map;
import java.util.Optional;

@Data
@Setter(AccessLevel.PRIVATE)
public class FrameworkContext {

    private static FrameworkConfiguration frameworkConfiguration = ConfigFactory.create(FrameworkConfiguration.class);

    private String context;
    private Driver driver;
    private TestNgXmlReader testNgXmlReader;

    public FrameworkContext() {
        this.testNgXmlReader = new TestNgXmlReader();
        this.driver = Driver.valueOf(
                getParameter(TestNgParameters.WEBDRIVER, frameworkConfiguration.webdriverDefault()));
    }

    public String getParameter(String key) {
        return getParameter(key, "");
    }

    public String getParameter(String key, String defaultValue) {
        Optional<Map.Entry<String, String>> value = testNgXmlReader.getAllParameters().entrySet().stream()
                .filter(entry -> entry.getKey().equalsIgnoreCase(key)).findAny();
        return value.map(entry -> entry.getValue().toUpperCase()).orElseGet(defaultValue::toUpperCase);
    }
}
