package in.automationtesting.practice.testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static in.automationtesting.practice.testing.userinterfaces.AutomationTestingPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class OpenBrowserTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url("http://practice.automationtesting.in/"));
        actor.should(seeThat(the(SPN_TITLE_PAGE), isVisible()));
        actor.wasAbleTo(Click.on(BTN_SHOP));
    }
    public static OpenBrowserTask openBrowserTask(){
        return Tasks.instrumented(OpenBrowserTask.class);
    }
}
