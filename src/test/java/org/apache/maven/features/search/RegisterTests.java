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
    email = testBase.getRandomString(5)+ constante.EMAIL_RANDOM;
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
        registerSteps.checkNewAccountCreated();
    }

    @Test
    public void registerUserAlina() {
        registerSteps.setFirstName(constante.FIRST_NAME);
        registerSteps.setLastName(constante.LAST_NAME);
        registerSteps.setEmailField(constante.EMAIL);
        registerSteps.setPasswordField(constante.PASSWORD);
        registerSteps.setConfirmationField(constante.PASSWORD);
        registerSteps.setCompanyField(constante.COMPANY);
        registerSteps.selectPosition();
        registerSteps.setPhoneField(constante.PHONE);
        registerSteps.clickCreateNewAccount();
        registerSteps.checkEmailAlreadyRegistered();
    }
}
