package pro.vasudevan.automation.web.Luma.home.actions;

import net.serenitybdd.annotations.Step;
import pro.vasudevan.automation.web.Luma.home.pages.HomePage;

/*
Created By: Vasudevan Sampath
HomePageActions.java follows Serenity BDD model. Used for Home Page Actions. Actions correspond to Steps in Serenity
*/
public class HomePageActions {

    private HomePage homePage;

    @Step("Navigate to Luma Home Page")
    public void go() {
        homePage.openHomePage();
    }
}
