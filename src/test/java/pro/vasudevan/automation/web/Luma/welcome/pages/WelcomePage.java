package pro.vasudevan.automation.web.Luma.welcome.pages;

import pro.vasudevan.automation.web.Luma.base.SuperBasePage;

/*
Created By: Vasudevan Sampath
WelcomePage.java follows Selenium Page Object Model (POM) design pattern and uses Serenity BDD model
*/
public class WelcomePage extends SuperBasePage {

    public String getWelcomeText() {
        return $("//div[@class='panel header']//span[@class='logged-in']").getText();
    }
}
