package org.apache.maven.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.maven.pages.LoginPage;
import org.apache.maven.pages.UserPage;

public class LoginSteps extends ScenarioSteps {

    LoginPage loginPage;
    UserPage userPage;

    @Step
    public void login()
    {
        loginPage.open();
        loginPage.setLoginEmailField("alina@mailinator.com");
        loginPage.setLoginPasswordField("vanceva123");
        loginPage.submitLogin();
        userPage.checkSuccessLogin();

    }
}
