
package runners;

import org.junit.platform.suite.api.*;

@Suite
@IncludeEngines("cucumber")
@ConfigurationParameter(key = "cucumber.features", value = "classpath:features")
@ConfigurationParameter(key = "cucumber.glue", value = "steps,utils,pages")
public class RunCucumberTest {}
