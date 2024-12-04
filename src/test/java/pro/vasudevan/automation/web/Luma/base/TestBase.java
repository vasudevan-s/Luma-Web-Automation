package pro.vasudevan.automation.web.Luma.base;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

/*
Created By: Vasudevan Sampath

TestBase.java initializes Serenity JUnit 5 and sets up WebDriver instance
 */
@ExtendWith({SerenityJUnit5Extension.class})
public class TestBase {
        @Managed(options = "--start-maximized")
        WebDriver webDriver;
}