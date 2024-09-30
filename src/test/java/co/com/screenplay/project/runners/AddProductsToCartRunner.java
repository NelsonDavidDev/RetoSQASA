package co.com.screenplay.project.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {"co.com.screenplay.project.stepdefinitions"},
        features = {"src/test/resources/features/addproductstocart.feature"},
        tags = ""
)

public class AddProductsToCartRunner {
}
