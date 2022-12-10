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
}
