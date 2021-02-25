package com.twiliaerp.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports"
        },
        features = "src/test/resources/features",
        glue = "com/twiliaerp/stepDefinitions",
        dryRun = true,
        tags = "@login"
)
public class CukesRunner {
}