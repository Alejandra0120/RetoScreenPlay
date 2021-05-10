package in.automationtesting.practice.testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromElement;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromTarget;
import org.apache.xmlbeans.impl.inst2xsd.VenetianBlindStrategy;
import org.openqa.selenium.support.ui.Select;

import static in.automationtesting.practice.testing.utils.enums.CheckOutEnum.*;
import static in.automationtesting.practice.testing.userinterfaces.AutomationTestingCheckOutPage.*;
import static in.automationtesting.practice.testing.userinterfaces.AutomationTestingChartPage.*;

public class ProceedCheckOutTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_PROCEED_CHECKOUT));
        actor.wasAbleTo(Enter.theValue(FIRST_NAME.getValue()).into(INP_FIRST_NAME),
                Enter.theValue(LAST_NAME.getValue()).into(INP_LAST_NAME),
                Enter.theValue(EMAIL_ADDRESS.getValue()).into(INP_EMAIL_ADDRESS),
                Enter.theValue(PHONE.getValue()).into(INP_PHONE),
                Enter.theValue(ADDRESS.getValue()).into(INP_ADDRESS),
                Enter.theValue(CITY.getValue()).into(INP_CITY),
                Enter.theValue(COUNTY.getValue()).into(INP_COUNTY)
                );
    }
    public static ProceedCheckOutTask proceedCheckOutTask (){
        return Tasks.instrumented(ProceedCheckOutTask.class);
    }
}
