package com.rapsodo.runnerFolder;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/rapsodo.feature",
        glue="com/rapsodo/stepDefinition",
        dryRun=false,
        tags = "@wip"

)
public class runnerClass {


}
