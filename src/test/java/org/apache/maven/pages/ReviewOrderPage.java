package org.apache.maven.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class ReviewOrderPage extends PageObject {

    @FindBy(css = ".form-item-utm-source-text input")
    private WebElementFacade pleaseSpecify;

    @FindBy(css = "#edit-continue")
    private WebElementFacade buttonContinue;



    public void setPleaseSpecify(String value){
        typeInto(pleaseSpecify, value);
    }
    public void clickButtonContinue(){
        clickOn(buttonContinue);
    }

}
