package org.apache.maven.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.apache.maven.steps.serenity.LoginSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTests {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Before
    public void maximize(){
        driver.manage().window().maximize();
    }

    @Steps
    LoginSteps loginSteps;

    @Test
    public void loginTest()
    {
        loginSteps.login();
        loginSteps.setEmailField();
        loginSteps.setPasswordField();
        loginSteps.clicklogin();
        loginSteps.checkSuccesLogin();
    }
}
