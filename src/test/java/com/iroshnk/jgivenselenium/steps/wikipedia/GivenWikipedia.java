package com.iroshnk.jgivenselenium.steps.wikipedia;

import com.iroshnk.jgivenselenium.pages.WikipediaMainPage;
import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import org.openqa.selenium.WebDriver;

/**
 * Created by HP on 8/10/2017.
 */
public class GivenWikipedia extends Stage<GivenWikipedia> {
    @ProvidedScenarioState
    private WikipediaMainPage wikipediaMainPage;

    public GivenWikipedia User_Navigates_To_WikiPage(WebDriver webDriver){
        wikipediaMainPage = new WikipediaMainPage(webDriver, "https://en.wikipedia.org/wiki/Main_Page");
        return this;
    }
}
