package bdd.runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by Mior on 08/05/2016.
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/links/NavigateToLink.feature"},
        glue = "bdd.cucumber"
)
public class SerenityRunner {
}
