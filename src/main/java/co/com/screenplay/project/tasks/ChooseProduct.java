package co.com.screenplay.project.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ChooseProduct implements Task {

    private final Target product;

    public ChooseProduct(Target product) {
        this.product = product;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(product.resolveFor(actor))
        );
    }

    public static ChooseProduct forProduct(Target product) {
        return Tasks.instrumented(ChooseProduct.class, product);
    }
}