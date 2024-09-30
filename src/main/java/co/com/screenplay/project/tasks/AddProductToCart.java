package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.screenplay.project.ui.ProductUI.BTN_ADD_TO_CART;


public class AddProductToCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(BTN_ADD_TO_CART.resolveFor(actor))
        );
    }

    public static AddProductToCart now() {
        return Tasks.instrumented(AddProductToCart.class);
    }
}