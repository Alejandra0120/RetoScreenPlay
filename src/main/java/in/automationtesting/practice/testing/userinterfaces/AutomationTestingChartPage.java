package in.automationtesting.practice.testing.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutomationTestingChartPage {
    public static final Target BTN_PROCEED_CHECKOUT = Target.the("BUTTON FOR PROCEED TO CHECKOUT")
            .located(By.xpath("//a[@href='http://practice.automationtesting.in/checkout/']"));
}
