package org.apache.maven.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.apache.maven.steps.serenity.CartSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTest extends PageObject {



    @Managed(uniqueSession = true)
    WebDriver driver;

    @Steps
    CartSteps cartSteps;

    @Test
    public void addToCart()
    {
        cartSteps.selectOneColor();
        cartSteps.addToCart();
        cartSteps.openMiniCart();
        cartSteps.checkProductAdded();
    }

}
