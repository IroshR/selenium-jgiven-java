package com.iroshnk.jgivenselenium.pages.widgets;

import com.iroshnk.jgivenselenium.pages.UiComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by HP on 8/10/2017.
 */
public class HOneTag extends UiComponent {
    public HOneTag(final WebDriver driver, final By locator) {
        super(driver, locator);
    }

    public String getText(){
        return find().getText();
    }
}
