package pro.vasudevan.automation.web.Luma.misc;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/*
Created By: Vasudevan Sampath

Common.java has utility methods
 */
public class Common {

    public static void scroll(WebDriver webDriver, WebElement webElement) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) webDriver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", webElement);
    }

    public static void scroll(WebDriver webDriver) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) webDriver;
        javascriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    public static void hover(WebDriver webDriver, WebElement webElement) {
        new Actions(webDriver).moveToElement(webElement).perform();
    }
}
