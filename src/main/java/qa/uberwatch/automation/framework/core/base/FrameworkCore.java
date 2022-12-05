package qa.uberwatch.automation.framework.core.base;

import lombok.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
abstract class FrameworkCore {

    private ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();
    private ThreadLocal<WebElement> webElement = new ThreadLocal<>();
    private ThreadLocal<List<WebElement>> webElements = new ThreadLocal<>();
}
