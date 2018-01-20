package org.apache.maven.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.maven.pages.LoginPage;
import org.apache.maven.pages.UserPage;
import org.apache.maven.utils.Constante;

public class LoginSteps extends ScenarioSteps {

    Constante constante;

    LoginPage loginPage;
    UserPage userPage;

    @Step
    public void login()
    {
        loginPage.open();
    }

    @Step
    public void setEmailField(){
        loginPage.setLoginEmailField(constante.EMAIL);
    }
    @Step
    public void setPasswordField(){
        loginPage.setLoginPasswordField(constante.PASSWORD);
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
