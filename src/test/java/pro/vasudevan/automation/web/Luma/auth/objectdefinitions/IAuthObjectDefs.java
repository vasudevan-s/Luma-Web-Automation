package pro.vasudevan.automation.web.Luma.auth.objectdefinitions;

import org.openqa.selenium.By;

public interface IAuthObjectDefs {
    By signInLink = By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]");
    By signInButton = By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]");
    By userName = By.cssSelector("#email");
    By password = By.xpath("//input[@name='login[password]']");
}
