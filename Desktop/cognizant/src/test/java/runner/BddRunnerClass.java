package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        features = "/Users/deekondanarender/Desktop/cognizant/src/main/resources/Features", snippets = SnippetType.CAMELCASE,
        glue = {"/src/test/Java/step_definitions"},
        plugin = {"pretty", "html:target/cucumberHtmlReport"}
)
public class BddRunnerClass {

}

