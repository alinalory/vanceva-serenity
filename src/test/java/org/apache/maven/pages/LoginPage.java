package org.apache.maven.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;
@DefaultUrl("https://www.vanceva.com/user-login")
public class LoginPage extends PageObject {

    @FindBy(css = "#edit-name")
    private WebElementFacade loginEmailField;

    @FindBy(css = "#edit-pass")
    private WebElementFacade loginPasswordField;

    @FindBy(css = "#edit-submit")
    private WebElementFacade loginButton;


    public void setLoginEmailField(String email)
    {
        typeInto(loginEmailField, email);
    }

    public void setLoginPasswordField(String password)
    {
        typeInto(loginPasswordField, password);
    }

    public void submitLogin()
    {
        clickOn(loginButton);
    }
}
