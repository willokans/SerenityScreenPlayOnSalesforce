package com.salesforce.root.runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(   features = "src/test/resources/features",
                    glue = "src/test/java/com/salesforce/root/stepdefinitions",
                    plugin = {
                        "pretty", "html:target/serenity-reports/serenity-html-report",
                            "json:target/serenity-reports/SerenityTestReport.json",
                            "rerun:target/serenity-reports/rerun.txt"},
        tags = {""})
public class GenericRunner {
}
