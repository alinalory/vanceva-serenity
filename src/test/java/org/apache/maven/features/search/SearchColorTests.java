package org.apache.maven.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.apache.maven.steps.serenity.SearchSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchColorTests {

    @Managed(uniqueSession = true)
    WebDriver driver;

    @Steps
    SearchSteps searchSteps;

    @Test
    public void searchRandomVancevaColorCode()
    {
        searchSteps.searchVancevaColorCode();
    }

    @Test
    public void searchRGB_ColorCode()
    {
        searchSteps.searchVancevaRGB_ColorCode();
    }

    @Test
    public void searchPantone_ColorCode()
    {
        searchSteps.searchVancevaPantone_ColorCode();
    }

    @Test
    public void searchRAL_ColorCode()
    {
        searchSteps.searchVancevaRAL_ColorCode();
    }

    @Test
    public void searchNCS_ColorCode()
    {
        searchSteps.searchVancevaNCS_ColorCode();
    }

    @Test
    public void search_ColorCode()
    {
        searchSteps.searchVancevaRGB_ColorCode();
        searchSteps.searchVancevaColorCode();
        searchSteps.searchVancevaPantone_ColorCode();
        searchSteps.searchVancevaRAL_ColorCode();
        searchSteps.searchVancevaNCS_ColorCode();
    }

    @Test
    public void searchOneColorFamily()
    {
        searchSteps.selectOneColorFamily();
    }
}
