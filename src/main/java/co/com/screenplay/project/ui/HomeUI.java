package co.com.screenplay.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class HomeUI extends PageObject{

    public static final Target FIRST_PRODUCT = Target.the("First product on home page").locatedBy("//*[@id=\"destacados-tab\"]/div[2]/div/ul/li[1]/a");

    public static final Target SECOND_PRODUCT = Target.the("Second product on home page").locatedBy("//*[@id=\"destacados-tab\"]/div[2]/div/ul/li[2]/a[2]");

}
