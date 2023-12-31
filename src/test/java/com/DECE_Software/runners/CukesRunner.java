package com.DECE_Software.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"html:target/default-html-report.html",
                "json:target/cucumber.json"

        },

        features = "src/test/resources/features",
        glue = "com/DECE_Software/stepDefinitions",
        dryRun = false,
        tags = ""

)

public class CukesRunner {
}
