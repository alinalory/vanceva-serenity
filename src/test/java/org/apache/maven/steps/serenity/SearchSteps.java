package org.apache.maven.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.maven.pages.ColorsPage;

public class SearchSteps extends ScenarioSteps {
    ColorsPage colorsPage;

    @Step
    public void searchVancevaColorCode()
    {
        colorsPage.open();
        colorsPage.setSearchColor();
        colorsPage.clickSearchButton();
        colorsPage.checkColorBox();

    }

    @Step
    public void searchVancevaRGB_ColorCode()
    {
        colorsPage.open();
        colorsPage.clickSearchOptionBar();
        colorsPage.select_RGB_Color_Code();
        colorsPage.setRBGColorR();
        colorsPage.clickSearchButtonRGB();
        colorsPage.checkColorBox();
    }

    @Step
    public void searchVancevaPantone_ColorCode()
    {
        colorsPage.open();
        colorsPage.clickSearchOptionBar();
        colorsPage.select_Pantone_Color_Code();
        colorsPage.setPantoneColor();
        colorsPage.clickSearchButtonPantone_RAL_NCS();
        colorsPage.checkColorBox();
    }

    @Step
    public void searchVancevaRAL_ColorCode()
    {
        colorsPage.open();
        colorsPage.clickSearchOptionBar();
        colorsPage.select_RAL_Color_Code();
        colorsPage.setRAL_NCSColor();
        colorsPage.clickSearchButtonPantone_RAL_NCS();
        colorsPage.checkColorBox();
    }

    @Step
    public void searchVancevaNCS_ColorCode()
    {
        colorsPage.open();
        colorsPage.clickSearchOptionBar();
        colorsPage.select_NCS_Color_Code();
        colorsPage.setRAL_NCSColor();
        colorsPage.clickSearchButtonPantone_RAL_NCS();
        colorsPage.checkColorBox();
    }

    @Step
    public void selectOneColorFamily()
    {
        colorsPage.open();
        colorsPage.selectOneColorFamily();
        colorsPage.selectOneColor();
        colorsPage.checkColorBox();
    }

}
