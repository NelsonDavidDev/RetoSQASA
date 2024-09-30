package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
public class CartUI extends PageObject {
    public static final Target FIRST_PRODUCT_QUANTITY = Target.the("Quantity of the first product").locatedBy("/html/body/div[2]/main/article/div/div/div/div/div/div/form[3]/div[2]/table/tbody/tr[1]/td[1]/input");
    public static final Target SECOND_PRODUCT_QUANTITY = Target.the("Quantity of the second product").locatedBy("/html/body/div[2]/main/article/div/div/div/div/div/div/form[3]/div[2]/table/tbody/tr[2]/td[1]/input");

}
