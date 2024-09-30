package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProductUI extends PageObject{
    public static final Target INPUT_QUANTITY = Target.the("Quantity of the selected product").locatedBy("//input[@name='quantity' and @type='number']");
    public static final Target BTN_ADD_TO_CART = Target.the("Button to add the selected product to the cart").locatedBy("//button[text()='Añadir al carrito']");
}
