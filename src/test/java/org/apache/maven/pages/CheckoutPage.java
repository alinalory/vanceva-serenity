package org.apache.maven.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;


public class CheckoutPage extends PageObject{

    Random myRandomizer = new Random() ;


    @FindBy(css = ".field-name-field-vanceva-first-name input")
    private WebElementFacade firstNameField;

    @FindBy(css = ".field-name-field-vanceva-last-name input")
    private WebElementFacade lastNameField;


    @FindBy(css = ".field-name-field-company input")
    private WebElementFacade companyField;

    @FindBy(css = ".field-name-field-customer-email input")
    private WebElementFacade emailField;

    @FindBy(css = ".field-name-field-vanceva-phone input")
    private WebElementFacade phoneField;

    @FindBy(css = ".close-popup-desktop")
    private WebElementFacade popupCloseButton;

    @FindBy(css = ".form-item-customer-profile-shipping-commerce-customer-address-und-0-thoroughfare input")
    private WebElementFacade adrressField;

    @FindBy(css = ".form-item-customer-profile-shipping-commerce-customer-address-und-0-postal-code input")
    private WebElementFacade postalCodeField;

    @FindBy(css = ".form-item-customer-profile-shipping-commerce-customer-address-und-0-locality input")
    private WebElementFacade cityField;

    @FindBy(css = ".form-item-customer-profile-shipping-field-vanceva-position-und .sbSelector")
    private WebElementFacade positionField;

    @FindBy(css = ".form-item-customer-profile-shipping-field-vanceva-position-und .sbOptions li:not(:first-child) a")
    private List<WebElementFacade> positionList;

    @FindBy(css = "#edit-continue")
    private WebElementFacade buttonContinue;



    public void setFirstNameField(String firstName){
        typeInto(firstNameField,firstName);
    }

    public void setLasttNameField(String lastName){
        typeInto(lastNameField,lastName);
    }

    public void setCompanytNameField(String companyName){
        typeInto(companyField,companyName);
    }

    public void closePopup() {
        waitABit(1000);
        clickOn(popupCloseButton);
    }

    public void setEmailField(String email){
        typeInto(emailField,email);
    }
    public void setPhoneField(String phone){
        typeInto(phoneField,phone);
    }

    public void setAddressField(String adrress){
        typeInto(adrressField,adrress);
    }

    public void setPostalCodeField(String postalCode){
        typeInto(postalCodeField,postalCode);
    }

    public void setCityField(String city){
        typeInto(cityField,city);
    }

    public void setPositionField(){
        waitFor(positionField);
        clickOn(positionField);
    }

    public void selectRandomPosition(){
        WebElementFacade position = positionList.get(myRandomizer.nextInt(positionList.size()));
        waitFor(position);
        position.click();
    }

    public void clickButtonContinue(){
        clickOn(buttonContinue);
    }


}
