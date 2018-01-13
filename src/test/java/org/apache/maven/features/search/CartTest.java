package org.apache.maven.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.apache.maven.steps.serenity.CartSteps;
import org.apache.maven.steps.serenity.CheckoutSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTest extends PageObject {



    @Managed(uniqueSession = true)
    WebDriver driver;

    @Steps
    CartSteps cartSteps;
    @Steps
    CheckoutSteps checkoutSteps;

    @Test
    public void addToCart()
    {
        cartSteps.selectOneColor();
        cartSteps.addToCart();
        cartSteps.openMiniCart();
        cartSteps.checkProductAdded();
    }

    @Test
    public void increaseQuantityInCart(){
        cartSteps.selectOneColor();
        cartSteps.addToCart();
        cartSteps.increaseQuantityOfOneProduct();

    }

    @Test
    public void deleteOneProduct(){
        cartSteps.selectOneColor();
        cartSteps.addToCart();
//        cartSteps.deleteOneProduct();
    }

    @Test
    public void checkout(){
        cartSteps.selectOneColor();
        cartSteps.addToCart();
        cartSteps.selectCompleteCheckout();
        checkoutSteps.completeCheckout();
    }

}
