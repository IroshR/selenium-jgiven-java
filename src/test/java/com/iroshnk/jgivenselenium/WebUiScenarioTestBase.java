package com.iroshnk.jgivenselenium;

import com.iroshnk.jgivenselenium.driver.Drivers;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

/**
 * Created by HP on 8/10/2017.
 */
@RunWith( DataProviderRunner.class )
public class WebUiScenarioTestBase<GIVEN, WHEN, THEN> extends ScenarioTest<GIVEN, WHEN, THEN> {
    protected WebDriver webDriver;

    @Before
    public void aNewWebDriver() {
        webDriver = Drivers.make(System.getProperty("webdriver.type"));
        webDriver.manage().window().maximize();
    }

    @After
    public void quitDriver() throws IOException {
        webDriver.quit();
    }
}