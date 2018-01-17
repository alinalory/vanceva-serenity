package org.apache.maven.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.maven.pages.RegisterPage;


import java.util.List;

public class RegisterSteps extends ScenarioSteps {

    RegisterPage registerPage;

    @Step
    public void setFirstName (String firstName)
    {
        registerPage.open();
        registerPage.setFirstNameField(firstName);
    }
    @Step
    public void setLastName (String last )
    {
        registerPage.setLastNameField(last);
    }

    @Step
    public void setEmailField (String email)
    {
        registerPage.setEmailField(email);
    }

    @Step
    public void setPasswordField (String pass)
    {
        registerPage.setPasswordField(pass);
    }

    @Step
    public void setConfirmationField (String pass)
    {
        registerPage.setConfirmationField(pass);
    }

    @Step
    public void setCompanyField(String company)
    {
        registerPage.setCompanyField(company);
    }

    @Step
    public void selectPosition()
    {
        registerPage.clickPositionField();
        registerPage.selectPosition();
    }
//
    @Step
    public void setPhoneFieldRandom(int phoneNumberRandom)
    {
        registerPage.setPhoneFieldRandom(phoneNumberRandom);
    }
    @Step
    public void setPhoneField( String phoneNumber)
    {
        registerPage.setPhoneField(phoneNumber);
    }

    @Step
    public void clickCreateNewAccount()
    {
        registerPage.clickCreateNewAccount();
    }

    @Step
    public void checkEmailAlreadyRegistered()
    {
        registerPage.emailAlreadyRegistered();
    }
}
