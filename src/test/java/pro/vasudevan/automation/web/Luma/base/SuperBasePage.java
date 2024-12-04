package pro.vasudevan.automation.web.Luma.base;

import net.serenitybdd.core.pages.PageObject;

/*
Created By: Vasudevan Sampath

SuperBasePage.java follows Selenium Page Object Model (POM) design pattern and uses Serenity BDD model/Selenium driver
*/
public abstract class SuperBasePage extends PageObject {

    public void openHomePage() {
        open();
    }

    public String getPageTitle() {
        return getDriver().getTitle();
    }
}
