package in.automationtesting.practice.testing.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = {"src/test/resources/in.automationtesting.practice.testing.features/buy_book.feature"},
                  glue = "in.automationtesting.practice.testing.stepdefinitions",
                    snippets = SnippetType.CAMELCASE)
public class BuyBookRunner {
}
