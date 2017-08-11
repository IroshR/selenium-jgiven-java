package com.iroshnk.jgivenselenium.steps.wikipedia;

import com.iroshnk.jgivenselenium.pages.WikipediaMainPage;
import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;

/**
 * Created by HP on 8/10/2017.
 */
public class ThenWikipedia extends Stage<ThenWikipedia>{
    @ExpectedScenarioState
    private WikipediaMainPage wikipediaMainPage;

    public ThenWikipedia show(){
        wikipediaMainPage.checkResult();
        return self();
    }
}
