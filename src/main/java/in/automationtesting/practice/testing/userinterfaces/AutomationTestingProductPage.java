package in.automationtesting.practice.testing.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutomationTestingProductPage {
    public static final Target INP_AMOUNT = Target.the("ENTER AN AMOUNT")
            .located(By.xpath("//input[@class='input-text qty text']"));
    public static final Target BTN_ADD_BASKET = Target.the("BUTTON FOR ADD TO BASKET")
            .located(By.xpath("//button[text()='Add to basket']"));
    public static final Target SPN_BASKET = Target.the("BUTTON FOR GO TO BASKET")
            .located(By.xpath("//a[@class='wpmenucart-contents']"));
}
