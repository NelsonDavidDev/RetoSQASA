package co.com.screenplay.project.stepdefinitions;

import co.com.screenplay.project.hook.OpenWeb;
import co.com.screenplay.project.questions.CartProductQuantities;
import co.com.screenplay.project.tasks.AddProductToCart;
import co.com.screenplay.project.tasks.ChooseProduct;
import co.com.screenplay.project.tasks.IncreaseProductQuantity;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.screenplay.project.ui.HomeUI.SECOND_PRODUCT;
import static co.com.screenplay.project.utils.Constants.WEB_URL;
import static co.com.screenplay.project.ui.HomeUI.FIRST_PRODUCT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddProductsToCartStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the {string} is on the products page")
    public void theOpenedTheMainPage(String actor) {
        theActorCalled(actor).wasAbleTo(OpenWeb.browserURL(WEB_URL)
        );
    }

    @When("adds {string} units of the first product to the shopping cart")
    public void addsUnitsOfTheFirstProductToTheShoppingCart(String quantity) {
        theActorInTheSpotlight().attemptsTo(
                ChooseProduct.forProduct(FIRST_PRODUCT),
                IncreaseProductQuantity.to(quantity),
                AddProductToCart.now()
        );
    }

    @And("adds {string} units of the second product to the shopping cart")
    public void fillForm(String quantity) {
        theActorInTheSpotlight().attemptsTo(
                OpenWeb.browserURL(WEB_URL),
                ChooseProduct.forProduct(SECOND_PRODUCT),
                IncreaseProductQuantity.to(quantity),
                AddProductToCart.now()
        );
    }

    @Then("the shopping cart must contain the products with their quantities {string} and {string}")
    public void theShoppingCartMustContainTheProductsWithTheirQuantities(String quantityFirstProduct, String quantitySecondProduct) {
        theActorInTheSpotlight().should(
            seeThat(CartProductQuantities.are(quantityFirstProduct, quantitySecondProduct))
        );
    }
}