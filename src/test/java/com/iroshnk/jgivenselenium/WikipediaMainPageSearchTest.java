package com.iroshnk.jgivenselenium;

import com.iroshnk.jgivenselenium.steps.wikipedia.GivenWikipedia;
import com.iroshnk.jgivenselenium.steps.wikipedia.ThenWikipedia;
import com.iroshnk.jgivenselenium.steps.wikipedia.WhenWikipedia;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by HP on 8/10/2017.
 */
@RunWith( DataProviderRunner.class )
public class WikipediaMainPageSearchTest extends WebUiScenarioTestBase<GivenWikipedia,WhenWikipedia,ThenWikipedia> {
    @Test
    @DataProvider( {
            "Software"
    })
    public void aUserCanSuccessfullyLogin(final String searchText) throws Exception{
        given().User_Navigates_To_WikiPage(webDriver);

        when().Enter_Search_Text(searchText)
                .and().Click_Search_Button();

        then().show();
    }
}
