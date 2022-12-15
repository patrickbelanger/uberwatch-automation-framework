package qa.uberwatch.automation.framework.core.context;

import org.testng.Reporter;
import org.testng.xml.XmlTest;

import java.util.Map;

public class TestNgXmlReader {
    private XmlTest xmlTest;

    public TestNgXmlReader() {
        this.xmlTest = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest();
    }

    public Map<String, String> getAllParameters() {
        return this.xmlTest.getAllParameters();
    }
}
