package com.iroshnk.jgivenselenium.steps.wikipedia;

import com.iroshnk.jgivenselenium.pages.WikipediaMainPage;
import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;

/**
 * Created by HP on 8/10/2017.
 */
public class WhenWikipedia extends Stage<WhenWikipedia> {
    @ExpectedScenarioState
    private WikipediaMainPage wikipediaMainPage;

    public WhenWikipedia Enter_Search_Text(final String searchText){
        wikipediaMainPage.searchText(searchText);
        return self();
    }

    public WhenWikipedia Click_Search_Button(){
        wikipediaMainPage.clickSearchButton();
        return self();
    }

}
