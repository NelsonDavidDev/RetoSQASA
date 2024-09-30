package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.screenplay.project.ui.ProductUI.INPUT_QUANTITY;

public class IncreaseProductQuantity implements Task {

    private final String quantity;

    public IncreaseProductQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(String.valueOf(quantity)).into(INPUT_QUANTITY.resolveFor(actor))
        );
    }

    public static IncreaseProductQuantity to(String quantity) {
        return Tasks.instrumented(IncreaseProductQuantity.class, quantity);
    }
}