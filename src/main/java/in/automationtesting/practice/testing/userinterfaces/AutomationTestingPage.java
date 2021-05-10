package in.automationtesting.practice.testing.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutomationTestingPage {
    public static final Target SPN_TITLE_PAGE = Target.the("TITLE TEXT")
            .located(By.id("site-logo"));
    public static final Target BTN_SHOP = Target.the("BUTTON FOR GO TO SHOP")
            .located(By.xpath("//a[text()='Shop']"));

}
