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
    }

    @Step
    public void setEmailField(){
        loginPage.setLoginEmailField("alina@mailinator.com");
    }
    @Step
    public void setPasswordField(){
        loginPage.setLoginPasswordField("vanceva123");
    }
    @Step
    public void clicklogin()
    {
        loginPage.submitLogin();
    }
    @Step
    public void checkSuccesLogin()
        {
            userPage.checkSuccessLogin();

        }
}
