package qa.uberwatch.automation.framework.core.base;

import java.io.PrintStream;

public class FrameworkBanner {

   private static final String[] BANNER = {
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
           "Version 0.0.1 (SNAPSHOT)",
           "Release name: None",
           ""
   };

   public void show() {
      PrintStream printStream = new PrintStream(System.out);
      for (String line : BANNER) {
         printStream.println(line);
      }
   }
}
