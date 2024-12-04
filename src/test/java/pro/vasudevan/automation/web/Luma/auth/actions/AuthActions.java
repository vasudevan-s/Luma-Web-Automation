package pro.vasudevan.automation.web.Luma.auth.actions;

import net.serenitybdd.annotations.Step;
import pro.vasudevan.automation.web.Luma.auth.pages.LoginPage;

import java.util.List;

/*
Created By: Vasudevan Sampath
AuthActions.java follows Serenity BDD model and is for auth scenarios. Actions correspond to Steps in Serenity
*/
public class AuthActions {

    private LoginPage loginPage;

    @Step("Login to the web app")
    public void loginAs(List<String> user) {
        loginPage.doLogin(user);
    }
}
