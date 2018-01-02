package org.apache.maven.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.maven.pages.ColorsPage;

public class CartSteps extends ScenarioSteps {

    ColorsPage colorsPage;

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


}
