package pro.vasudevan.automation.web.Luma.home.pages;

import pro.vasudevan.automation.web.Luma.base.SuperBasePage;

/*
Created By: Vasudevan Sampath
HomePage.java follows Selenium Page Object Model (POM) design pattern and uses Serenity BDD model
*/
public class HomePage extends SuperBasePage {

    public boolean isLogoVisible() {
        return $("//a[@class='logo']/img[contains(@src, 'logo.svg')]").isVisible();
    }

    public boolean isSearchVisible() {
        return find("search").isVisible();
    }
}
