package org.apache.maven.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

@DefaultUrl("https://www.vanceva.com/cart")
public class CartPage extends PageObject {

    @FindBy(css = ".views-table .form-item input")
    private WebElementFacade quantityField;

    @FindBy(css = "#edit-submit.form-submit.ajax-processed ")
    private WebElementFacade updateButton;

    @FindBy(css = "td.views-field.views-field-edit-delete")
    private WebElementFacade deleteButton;

    @FindBy(css = ".cart-empty-page")
    private WebElementFacade cartEmpty;

    Random myRandomizer = new Random();
    String randomValue = "";


    public void increaseQuantity(){
        for (Integer i = 1; i <= 4; ++i) {
            randomValue = randomValue + myRandomizer.nextInt(9);
        }
        typeInto(quantityField , randomValue);

    }

    public void clickUpdateCart(){
        clickOn(updateButton);
        waitABit(200);
    }

    public void clickDeleteButton(){
        waitABit(2000);
        clickOn(deleteButton);
    }

    public void checkEmptyCart(){
        waitFor(cartEmpty);
        Assert.assertTrue(cartEmpty.getText().contains("Your shopping cart is empty."));
    }


    public void checkIncreasedValue(){
        Assert.assertTrue(randomValue.equals(quantityField.getValue()));
    }


}
