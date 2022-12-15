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
package qa.uberwatch.automation.framework.core.configuration;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({ "classpath:framework.configuration.properties" })
public interface FrameworkConfiguration extends Config {

    @Key("application.version")
    String applicationVersion();
    @Key("application.build.name")
    String applicationBuildName();
    @Key("application.build.type")
    String applicationBuildType();
    @Key("webdriver.default")
    @DefaultValue("CHROME")
    String webdriverDefault();

    @Key("webdriver.default.path")
    String webdriverDefaultPath();
}
