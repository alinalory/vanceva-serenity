package org.apache.maven.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.apache.maven.utils.Messages;
import org.openqa.selenium.support.FindBy;

public class UserPage extends PageObject {
    Messages messages;

    @FindBy(css = ".greeting")
    private WebElementFacade welcomeMessage;

    public void checkSuccessLogin()
    {
        welcomeMessage.shouldContainText(messages.WELCOME_MESSAGE);
    }
}
