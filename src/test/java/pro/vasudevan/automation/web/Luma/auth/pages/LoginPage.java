package pro.vasudevan.automation.web.Luma.auth.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import pro.vasudevan.automation.web.Luma.auth.objectdefinitions.IAuthObjectDefs;
import pro.vasudevan.automation.web.Luma.base.SuperBasePage;
import pro.vasudevan.automation.web.Luma.misc.Common;

import java.util.List;

/*
Created By: Vasudevan Sampath

LoginPage.java follows Selenium Page Object Model (POM) design pattern and uses Serenity BDD model
*/
public class LoginPage extends SuperBasePage implements IAuthObjectDefs {

    public void doLogin(List<String> user) {
        open();
        find(signInLink).click();
        WebElementFacade signInButtonFacade = $(signInButton);
        Common.scroll(getDriver(), signInButtonFacade);
        find(userName).sendKeys(user.getFirst());
        find(password).sendKeys(user.getLast());
        signInButtonFacade.click();
    }

    public String getLoginFailedErrorMessage() {
        return $("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']").getText();
    }
}
