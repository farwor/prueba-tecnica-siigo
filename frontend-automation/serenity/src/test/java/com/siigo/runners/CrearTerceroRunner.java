package com.siigo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.siigo.stepsdefinitions",
        tags = "@creacionCliente",
        plugin = {
                "pretty",
                "json:target/destination/cucumber.json",
                "rerun:target/destination/failedrerun.txt",
        },
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CrearTerceroRunner {
}