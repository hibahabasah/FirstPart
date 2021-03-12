package pro1;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = "usecases",
plugin = {"html:target/cucmber/wikipidia.html"},
snippets = SnippetType.CAMELCASE ,
glue= {"pro1"},
strict=true)

public class AcceptanceTest {

}
