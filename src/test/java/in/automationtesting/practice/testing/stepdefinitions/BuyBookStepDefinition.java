package in.automationtesting.practice.testing.stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import in.automationtesting.practice.testing.questions.VerifyAmountQuestion;
import in.automationtesting.practice.testing.tasks.BuyBookTask;
import in.automationtesting.practice.testing.tasks.OpenBrowserTask;
import in.automationtesting.practice.testing.tasks.ProceedCheckOutTask;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import static in.automationtesting.practice.testing.utils.enums.CheckOutEnum.*;
import static in.automationtesting.practice.testing.questions.VerifyAmountQuestion.*;

public class BuyBookStepDefinition {
    @Managed(driver = "chrome")
    private WebDriver webDriver;
    private Actor userAutomation = Actor.named("userAutomation");


    @Before
    public void prepareActorStage(){
        OnStage.setTheStage(new OnlineCast());
        userAutomation.can(BrowseTheWeb.with(webDriver));
    }
    @Given("^the user opens browser$")
    public void theUserOpensBrowser() {
    userAutomation.attemptsTo(OpenBrowserTask.openBrowserTask());
    }

    @When("^the user buys a book$")
    public void theUserBuysABook() {
    userAutomation.attemptsTo(BuyBookTask.buyBookTask());
    userAutomation.attemptsTo(ProceedCheckOutTask.proceedCheckOutTask());
    }

    @Then("^validate amount and price$")
    public void validateAmountAndPrice() {
    String textValid = AMOUNT.getValue();
    userAutomation.should(GivenWhenThen.seeThat(VerifyAmountQuestion.verifyAmountQuestion(), Matchers.equalTo(textValid)));
    }
}
