package pro.vasudevan.automation.web.Luma.auth.tests;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import pro.vasudevan.automation.web.Luma.auth.actions.AuthActions;
import pro.vasudevan.automation.web.Luma.auth.pages.LoginPage;
import pro.vasudevan.automation.web.Luma.base.TestBase;
import pro.vasudevan.automation.web.Luma.interfaces.Csv2List;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

/*
Created By: Vasudevan Sampath
WhenUserFailsToLoginTests.java has all tests for failed login scenarios
Uses Serenity @Steps syntax for initializing Action classes
Uses JUnit 5 @ParameterizedTest annotation for data driven test methods
Uses @CsvFileSource for CSV external test data file support
Uses @Csv2List custom interface for converting parameters to List simplifying method signature
Uses AssertJ for expressive asserts
*/
@Order(2)
public class WhenUserFailsToLoginTests extends TestBase {

    @Steps
    AuthActions authActions;

    LoginPage loginPage;

//    @Order(2)
    @ParameterizedTest
    @DisplayName("Failed Login to Luma app")
    @CsvFileSource(resources = "/testData/BadLogin.csv", numLinesToSkip = 1)
    public void isFailedLoginErrorMessageDisplayedTest(@Csv2List List<String> user) {
        authActions.loginAs(user);
        Serenity.reportThat("User should be displayed with a login failed error message",
                () -> assertThat(loginPage.getLoginFailedErrorMessage())
                        .isEqualTo("The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later."));
    }
}
