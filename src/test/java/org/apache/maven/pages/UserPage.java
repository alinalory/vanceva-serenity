package org.apache.maven.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class UserPage extends PageObject {

    @FindBy(css = ".greeting")
    private WebElementFacade welcomeMessage;

    public void checkSuccessLogin()
    {
        welcomeMessage.shouldContainText("Welcome");
    }
}
