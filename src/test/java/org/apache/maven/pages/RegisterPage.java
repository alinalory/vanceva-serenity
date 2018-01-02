package org.apache.maven.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

@DefaultUrl("https://www.vanceva.com/user/register")
public class RegisterPage extends PageObject {

    @FindBy(css = "#edit-field-vanceva-first-name-und-0-value")
    private WebElementFacade firstNameField;


    @FindBy(css = "#edit-field-vanceva-last-name-und-0-value")
    private WebElementFacade lastNameField;

    @FindBy(css = "#edit-mail")
    private WebElementFacade emailField;

    @FindBy(css = "#edit-pass-pass1")
    private WebElementFacade passwordField;

    @FindBy(css = "#edit-pass-pass2")
    private WebElementFacade confirmationField;

    @FindBy(css = "#edit-field-company-und-0-value")
    private WebElementFacade companyField;

    @FindBy(css = ".sbSelector")
    private WebElementFacade positionField;

    @FindBy(css = ".sbOptions li:not(:first-child) a")
    private List<WebElementFacade> positionList;

    @FindBy(css = "#edit-field-vanceva-phone-und-0-value")
    private WebElementFacade phoneField;

    @FindBy(css = ".form-checkbox")
    private WebElementFacade acceptPromotions;

    @FindBy(css = "#edit-submit")
    private WebElementFacade createNewAccount;

    @FindBy(css = ".messages.error.messages-inline")
    private WebElementFacade emailErrorMessage;

    Random myRandomizer = new Random();

    public void setFirstNameField(String firstName)
    {
        typeInto(firstNameField, firstName);
    }

    public void setLastNameField(String last)
    {
        typeInto(lastNameField, last);
    }

    public void setEmailField(String email)
    {
        typeInto(emailField, email);
    }

    public void setPasswordField(String pass1)
    {
        typeInto(passwordField, pass1);
    }

    public void setConfirmationField(String pass2)
    {
        typeInto(confirmationField, pass2);
    }

    public void setCompanyField(String company)
    {
        typeInto(companyField, company);
    }

    public void clickPositionField()
    {
        clickOn(positionField);
        waitABit(500);
    }

    public void selectPosition()
    {
        if (positionList.size() > 0) {
            positionList.get(myRandomizer.nextInt(positionList.size())).click();
            waitABit(2000);
        }
    }

    public void setPhoneField(String phoneNumber)
    {
        typeInto(phoneField,phoneNumber);
    }



    public void clickCreateNewAccount()
    {
        clickOn(createNewAccount);
        waitABit(500);
    }

    public void emailAlreadyRegistered()
    {
        emailErrorMessage.getText().contains("The e-mail address  is already registered");
    }


}
