package co.com.screenplay.project.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.screenplay.project.ui.CartUI.FIRST_PRODUCT_QUANTITY;
import static co.com.screenplay.project.ui.CartUI.SECOND_PRODUCT_QUANTITY;

public class CartProductQuantities implements Question<Boolean> {

    private final String expectedQuantityFirstProduct;
    private final String expectedQuantitySecondProduct;

    public CartProductQuantities(String expectedQuantityFirstProduct, String expectedQuantitySecondProduct) {
        this.expectedQuantityFirstProduct = expectedQuantityFirstProduct;
        this.expectedQuantitySecondProduct = expectedQuantitySecondProduct;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String actualQuantityFirstProduct = Text.of(FIRST_PRODUCT_QUANTITY).answeredBy(actor);
        String actualQuantitySecondProduct = Text.of(SECOND_PRODUCT_QUANTITY).answeredBy(actor);

        return actualQuantityFirstProduct.equals(expectedQuantityFirstProduct) &&
                actualQuantitySecondProduct.equals(expectedQuantitySecondProduct);
    }

    public static CartProductQuantities are(String expectedQuantityFirstProduct, String expectedQuantitySecondProduct) {
        return new CartProductQuantities(expectedQuantityFirstProduct, expectedQuantitySecondProduct);
    }
}
