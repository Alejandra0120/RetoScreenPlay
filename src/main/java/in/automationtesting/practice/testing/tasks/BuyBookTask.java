package in.automationtesting.practice.testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static in.automationtesting.practice.testing.userinterfaces.AutomationTestingShopPage.*;
import static in.automationtesting.practice.testing.userinterfaces.AutomationTestingProductPage.*;
import static in.automationtesting.practice.testing.utils.enums.ChartEnum.*;


public class BuyBookTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LBL_BOOK));
        actor.wasAbleTo(Enter.theValue(AMOUNT_BOOK.getValue()).into(INP_AMOUNT),
                Click.on(BTN_ADD_BASKET),
                Click.on(SPN_BASKET));
    }
    public static BuyBookTask buyBookTask(){
       return Tasks.instrumented(BuyBookTask.class);
    }
}
