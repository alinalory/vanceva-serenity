package org.apache.maven.features.search;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.apache.maven.steps.serenity.RegisterSteps;
import org.apache.maven.utils.Constante;
import org.apache.maven.utils.TestBase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class RegisterTests {

    Constante constante;

    @Managed(uniqueSession = true)
    public WebDriver driver;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String company;
    private int phone;

    @Before
    public void maximize() {
        driver.manage().window().maximize();
    }


    @Before
    public void init(){
    TestBase testBase = new TestBase();
    firstname = testBase.getRandomString(7);
    lastname = testBase.getRandomString(6);
    email = testBase.getRandomString(5)+ constante.emailRandom;
    password = testBase.getRandomString(6);
    company = testBase.getRandomString(10);
    phone = testBase.getRandomInt();
    }


    @Steps
    RegisterSteps registerSteps;

    @Test
    public void registerUserRandom() {
        registerSteps.setFirstName(firstname);
        registerSteps.setLastName(lastname);
        registerSteps.setEmailField(email);
        registerSteps.setPasswordField(password);
        registerSteps.setConfirmationField(password);
        registerSteps.setCompanyField(company);
        registerSteps.selectPosition();
        registerSteps.setPhoneFieldRandom(phone);
        registerSteps.clickCreateNewAccount();
//        registerSteps.checkEmailAlreadyRegistered();
    }

    @Test
    public void registerUserAlina() {
        registerSteps.setFirstName(constante.firstName);
        registerSteps.setLastName(constante.lastName);
        registerSteps.setEmailField(constante.email);
        registerSteps.setPasswordField(constante.password);
        registerSteps.setConfirmationField(constante.password);
        registerSteps.setCompanyField(constante.company);
        registerSteps.selectPosition();
        registerSteps.setPhoneField(constante.phone);
        registerSteps.clickCreateNewAccount();
        registerSteps.checkEmailAlreadyRegistered();
    }
}
