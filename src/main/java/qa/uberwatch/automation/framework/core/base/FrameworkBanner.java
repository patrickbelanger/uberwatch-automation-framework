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

import org.aeonbits.owner.ConfigFactory;
import qa.uberwatch.automation.framework.core.configuration.FrameworkConfiguration;

import java.io.PrintStream;

public class FrameworkBanner {
   static FrameworkConfiguration frameworkConfiguration = ConfigFactory.create(FrameworkConfiguration.class);

   private static final String[] BANNER = {
           "",
           "          $$\\                                                    $$\\               $$\\       ",
           "          $$ |                                                   $$ |              $$ |      ",
           "$$\\   $$\\ $$$$$$$\\   $$$$$$\\   $$$$$$\\  $$\\  $$\\  $$\\  $$$$$$\\ $$$$$$\\    $$$$$$$\\ $$$$$$$\\ ",
           "$$ |  $$ |$$  __$$\\ $$  __$$\\ $$  __$$\\ $$ | $$ | $$ | \\____$$\\\\_$$  _|  $$  _____|$$  __$$\\ ",
           "$$ |  $$ |$$ |  $$ |$$$$$$$$ |$$ |  \\__|$$ | $$ | $$ | $$$$$$$ | $$ |    $$ /      $$ |  $$ |",
           "$$ |  $$ |$$ |  $$ |$$   ____|$$ |      $$ | $$ | $$ |$$  __$$ | $$ |$$\\ $$ |      $$ |  $$ |",
           "\\$$$$$$  |$$$$$$$  |\\$$$$$$$\\ $$ |      \\$$$$$\\$$$$  |\\$$$$$$$ | \\$$$$  |\\$$$$$$$\\ $$ |  $$ |",
           " \\______/ \\_______/  \\_______|\\__|       \\_____\\____/  \\_______|  \\____/  \\_______|\\__|  \\__|",
           "=============================================================================================",
           "           An outstanding Test Automation Framework powered by Selenium WedDriver",
           "=============================================================================================",
           String.format("Version %s (%s)",
               frameworkConfiguration.applicationVersion(),
               frameworkConfiguration.applicationBuildType()
           ),
           String.format("Release name: %s",
               frameworkConfiguration.applicationBuildName()
           ),
           "Copyright 2022-%s, Patrick Bélanger, and other contributors.",
           "Licensed under the Apache License, Version 2.0 - You may obtain a copy of the License at:",
           "https://www.apache.org/licenses/LICENSE-2.0",
           ""
   };

   public void show() {
      PrintStream printStream = new PrintStream(System.out);
      for (String line : BANNER) {
         printStream.println(line);
      }
   }

}