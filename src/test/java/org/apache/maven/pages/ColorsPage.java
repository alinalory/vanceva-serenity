package org.apache.maven.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.apache.maven.utils.Messages;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

@DefaultUrl("https://www.vanceva.com/color-selector")
public class ColorsPage extends PageObject {

    Messages messages;

    @FindBy(css = "#edit-vanceva-color-code")
    private WebElementFacade searchColor;

    @FindBy(css = ".form-item-vanceva-color-code .submit-text-search")
    private WebElementFacade searchButton;

    @FindBy(css = ".color-selector-boxes .views-row")
    private List<WebElementFacade> colorBoxes;

    @FindBy(css = ".form-item:not(.form-item-edit-color-family-double-sided) > a.jquery-once-1-processed.color-family-changed-processed")
    private List<WebElementFacade> colorBoxesList;

    @FindBy(css = ".color-selector-boxes h2")
    private WebElementFacade messageColorAreNotAvailable;

    @FindBy(css = ".form-item-color-selector-global .sbHolder .sbSelector")
    private WebElementFacade searchOptionBar;

    @FindBy(css = ".form-item-color-selector-global a[rel='2']")
    private WebElementFacade searchOptionRGBColorCode;

    @FindBy(css = ".form-item-color-selector-global a[rel='3']")
    private WebElementFacade searchOptionPantoneColorCode;

    @FindBy(css = ".form-item-color-selector-global a[rel='4']")
    private WebElementFacade searchOptionRALColorCode;

    @FindBy(css = ".form-item-color-selector-global a[rel='5']")
    private WebElementFacade searchOptionNCSColorCode;

    @FindBy(css = "#edit-rgb-r")
    private WebElementFacade RGBColorR;

    @FindBy(css = "#edit-vanceva-color-code-2")
    private WebElementFacade PantoneColor;

    @FindBy(css = "#edit-vanceva-color-code-2")
    private WebElementFacade RALColor;

    @FindBy(css = ".form-item-rgb-b .field-suffix .submit-text-search ")
    private WebElementFacade searchButtonRGB;

    @FindBy(css = ".form-item-vanceva-color-code-2 .field-suffix .submit-text-search")
    private WebElementFacade searchButtonPantone;

    @FindBy(css = ".info-color-code span")
    private WebElementFacade colorCode;

    private String colorCodeText;

    @FindBy(css = ".form-submit.fake-form")
    private WebElementFacade addToCartButton;

    @FindBy(css = ".cart-sign")
    private WebElementFacade miniCart;

    @FindBy(css = "td.views-field.views-field-line-item-title")
    private WebElementFacade productNameFromMiniCart;

    private String productNameFromMiniCartText;


    Random myRandomizer = new Random();

    public void setSearchColor() {
        String randomValue = "";
        for (Integer i = 1; i <= 4; ++i) {
            randomValue = randomValue + myRandomizer.nextInt(9);

        }
        typeInto(searchColor, randomValue);

    }

    public void clickSearchButton() {
        clickOn(searchButton);
        waitABit(2000);
    }

    public void checkColorBox() {
        if (colorBoxes.size() > 0) {
            Assert.assertTrue(containsElements(".color-box-swatch a"));
        } else {
            Assert.assertTrue(messageColorAreNotAvailable.getText().contains(messages.COLOR_NOT_AVAILABLE));
        }
    }

    public void clickSearchOptionBar() {
        clickOn(searchOptionBar);
    }

    public void select_RGB_Color_Code() {
        searchOptionRGBColorCode.click();
    }

    public void select_Pantone_Color_Code() {
        searchOptionPantoneColorCode.click();
    }

    public void select_RAL_Color_Code() {
        searchOptionRALColorCode.click();
    }

    public void select_NCS_Color_Code() {
        searchOptionNCSColorCode.click();
    }

    public void setRBGColorR() {
        waitABit(3000);
        String randomValue = "";
        for (Integer i = 1; i <= 2; ++i) {
            randomValue = randomValue + myRandomizer.nextInt(9);
        }
        typeInto(RGBColorR, randomValue);
    }

    public void setPantoneColor() {
        waitABit(3000);
        String randomValue = "";
        for (Integer i = 1; i <= 4; ++i) {
            randomValue = randomValue + myRandomizer.nextInt(9);
        }
        typeInto(PantoneColor, randomValue);
    }

    public void setRAL_NCSColor() {
        waitABit(3000);
        String randomValue = "";
        for (Integer i = 1; i <= 4; ++i) {
            randomValue = randomValue + myRandomizer.nextInt(9);
        }
        typeInto(RALColor, randomValue);
    }


    public void clickSearchButtonRGB() {
        clickOn(searchButtonRGB);
        waitABit(2000);
    }

    public void clickSearchButtonPantone_RAL_NCS() {
        clickOn(searchButtonPantone);
        waitABit(2000);
    }

    public void selectOneColorFamily() {
        if (colorBoxesList.size() > 0) {
            colorBoxesList.get(myRandomizer.nextInt(colorBoxesList.size())).click();
            waitABit(2000);
        }

    }

    public void selectOneColor() {
        if (colorBoxes.size() > 0) {
            colorBoxes.get(myRandomizer.nextInt(colorBoxes.size())).click();
            waitABit(2000);
        }

    }

    public String getColorCode() {
        return colorCodeText;
    }

    public void clickAddToCart() {
        colorCodeText = colorCode.getText();
        clickOn(addToCartButton);
        waitABit(3000);
    }

    public void openMiniCart() {
        clickOn(miniCart);
    }

    public void checkProductAdded() {
        Assert.assertTrue(productNameFromMiniCart.getText().contains(getColorCode()));
    }
}


