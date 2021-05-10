package in.automationtesting.practice.testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static in.automationtesting.practice.testing.userinterfaces.AutomationTestingCheckOutPage.*;

public class VerifyAmountQuestion implements Question<String> {

    public static Question<String> verifyAmountQuestion(){
        return actor -> LBL_TOTAL.resolveFor(actor).getTextValue();
    }
    @Override
    public String answeredBy(Actor actor) {
        return LBL_TOTAL.resolveFor(actor).getTextValue();
    }
}
