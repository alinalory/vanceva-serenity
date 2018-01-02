package org.apache.maven.features.search;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.apache.maven.steps.serenity.RegisterSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class RegisterTests {

    @Managed(uniqueSession = true)
    public WebDriver driver;


    @Steps
    RegisterSteps registerSteps;

    @Test
    public void registerUser() {
        registerSteps.setFirstName("Alina");
        registerSteps.setLastName("Vasileniuc");
        registerSteps.setEmailField("alina@mailinator.com");
        registerSteps.setPasswordField("vanceva123");
        registerSteps.setConfirmationField("vanceva123");
        registerSteps.setCompanyField("Vanceva");
        registerSteps.selectPosition();
        registerSteps.setPhoneField("0230562125");
        registerSteps.clickCreateNewAccount();
        registerSteps.checkEmailAlreadyRegistered();
    }
}
