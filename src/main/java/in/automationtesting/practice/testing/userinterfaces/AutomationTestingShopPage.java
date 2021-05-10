package in.automationtesting.practice.testing.userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutomationTestingShopPage extends PageObject {
    public static final Target LBL_BOOK = Target.the("TITLE BOOK")
            .located(By.xpath("//h3[text()='Android Quick Start Guide']"));
}
