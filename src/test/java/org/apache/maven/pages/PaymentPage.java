package org.apache.maven.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://payflowlink.paypal.com/")
public class PaymentPage extends PageObject {

    @FindBy(css = "#stdpage")
    WebElementFacade payPall;

    public void checkpayPall(){
        Assert.assertTrue(payPall.isDisplayed());
    }
}
