package pro.vasudevan.automation.web.Luma.home.tests;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import pro.vasudevan.automation.web.Luma.home.actions.HomePageActions;
import pro.vasudevan.automation.web.Luma.base.TestBase;
import pro.vasudevan.automation.web.Luma.home.pages.HomePage;

/*
Created By: Vasudevan Sampath
WhenUserNavigatesToHomePageTests.java has all tests for home page scenarios
Uses Serenity @Steps syntax for initializing Action classes
Uses AssertJ for expressive asserts
*/
@Order(1)
public class WhenUserNavigatesToHomePageTests extends TestBase {

    @Steps
    HomePageActions homePageActions;

    HomePage homePage;

//    @Order(1)
    @Test
    @DisplayName("Verify Logo, Title and Search bar presence")
    public void theLogoIsPresentTest() {
        homePageActions.go();
        Serenity.reportThat("The Logo should appear",
                () -> assertThat(homePage.isLogoVisible()));
        Serenity.reportThat("The Title should match",
                () -> assertThat(homePage.getPageTitle()));
        Serenity.reportThat("The Search bar should appear",
                () -> assertThat(homePage.isSearchVisible()));
    }
}
