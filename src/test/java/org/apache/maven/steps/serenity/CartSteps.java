package org.apache.maven.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.maven.pages.CartPage;
import org.apache.maven.pages.ColorsPage;

public class CartSteps extends ScenarioSteps {

    ColorsPage colorsPage;
    CartPage cartPage;

    @Step
    public void selectOneColor()
    {
        colorsPage.open();
        colorsPage.selectOneColorFamily();
        colorsPage.selectOneColor();
    }

    @Step
    public void addToCart()
    {
        colorsPage.clickAddToCart();
    }

    @Step
    public void openMiniCart()
    {
        colorsPage.openMiniCart();
    }

    @Step
    public void checkProductAdded()
    {
        colorsPage.checkProductAdded();
    }

    @Step
    public void increaseQuantityOfOneProduct(){
        cartPage.open();
        cartPage.increaseQuantity();
        cartPage.clickUpdateCart();
        cartPage.open(); // refresh the page
        cartPage.checkIncreasedValue();


    }

    @Step
    public void deleteOneProduct(){
        cartPage.open();
        cartPage.clickDeleteButton();
     //   cartPage.open(); // refresh the page
        cartPage.checkEmptyCart();
    }

    @Step
    public void selectCompleteCheckout(){
        cartPage.open();
        cartPage.setCompleteCheckout();
    }
}
