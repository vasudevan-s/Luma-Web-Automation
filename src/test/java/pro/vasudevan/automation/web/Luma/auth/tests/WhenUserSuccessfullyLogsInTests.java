package pro.vasudevan.automation.web.Luma.auth.tests;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import pro.vasudevan.automation.web.Luma.auth.actions.AuthActions;
import pro.vasudevan.automation.web.Luma.base.TestBase;
import pro.vasudevan.automation.web.Luma.interfaces.Csv2List;
import pro.vasudevan.automation.web.Luma.welcome.pages.WelcomePage;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

/*
Created By: Vasudevan Sampath
WhenUserSuccessfullyLogsInTests.java has all tests for passing login scenarios
Uses Serenity @Steps syntax for initializing Action classes
Uses JUnit 5 @ParameterizedTest annotation for data driven test methods
Uses @CsvFileSource for CSV external test data file support
Uses @Csv2List custom interface for converting parameters to List simplifying method signature
Uses AssertJ for expressive asserts
*/
@Order(3)
public class WhenUserSuccessfullyLogsInTests extends TestBase {

    @Steps
    AuthActions authActions;

    WelcomePage welcomePage;

//    @Order(3)
    @ParameterizedTest
    @DisplayName("Login to Luma app")
    @CsvFileSource(resources = "/testData/GoodLogin.csv", numLinesToSkip = 1)
    public void isGreetedToTheWelcomePageTest(@Csv2List List<String> user) {
        authActions.loginAs(user);
        Serenity.reportThat("User should be logged in",
                () -> assertThat(welcomePage.getWelcomeText())
                        .isEqualTo("Welcome, ZZZ QA!"));
    }
}
