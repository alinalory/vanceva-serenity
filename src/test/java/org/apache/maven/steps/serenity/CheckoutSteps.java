package org.apache.maven.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.maven.pages.CheckoutPage;
import org.apache.maven.pages.PaymentPage;
import org.apache.maven.pages.ReviewOrderPage;

public class CheckoutSteps extends ScenarioSteps {


    CheckoutPage checkoutPage;
    ReviewOrderPage reviewOrderPage;
    PaymentPage paymentPage;

    @Step
    public void completeCheckout(){
        checkoutPage.closePopup();
        checkoutPage.setFirstNameField("Alina");
        checkoutPage.setLasttNameField("Vasileniuc");
        checkoutPage.setCompanytNameField("Vanceva");
        checkoutPage.setPositionField();
        checkoutPage.selectRandomPosition();
        checkoutPage.setEmailField("alina@mailinator.com");
        checkoutPage.setPhoneField("0230560598");
        checkoutPage.setAddressField("Strada Vanceva nr.23");
        checkoutPage.setPostalCodeField("456123");
        checkoutPage.setCityField("Vanceva City");
        checkoutPage.clickButtonContinue();
        reviewOrderPage.setPleaseSpecify("Vanceva Test");
        reviewOrderPage.clickButtonContinue();
        paymentPage.checkpayPall();


    }
}
