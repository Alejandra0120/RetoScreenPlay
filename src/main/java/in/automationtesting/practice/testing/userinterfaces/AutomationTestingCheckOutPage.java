package in.automationtesting.practice.testing.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutomationTestingCheckOutPage {
    public static final Target INP_FIRST_NAME = Target.the("ENTER A FIRST NAME")
            .located(By.id("billing_first_name"));
    public static final Target INP_LAST_NAME = Target.the("ENTER A LAST NAME")
            .located(By.id("billing_last_name"));
    public static final Target INP_EMAIL_ADDRESS = Target.the("ENTER AN EMAIL ADDRESS")
            .located(By.id("billing_email"));
    public static final Target INP_PHONE = Target.the("ENTER A PHONE")
            .located(By.id("billing_phone"));
    public static final Target SLC_COUNTRY = Target.the("SELECT A COUNTRY")
            .located(By.id("billing_country"));
    public static final Target INP_ADDRESS = Target.the("ENTER AN ADDRESS")
            .located(By.id("billing_address_1"));
    public static final Target INP_CITY = Target.the("ENTER A CITY")
            .located(By.id("billing_city"));
    public static final Target INP_COUNTY = Target.the("ENTER A COUNTY")
            .located(By.id("billing_state"));
    public static final Target LBL_TOTAL = Target.the("TOTAL")
            .located(By.xpath("(//span[@class='woocommerce-Price-amount amount'])[4][not(@class='woocommerce-Price-currencySymbol')]"));



}
