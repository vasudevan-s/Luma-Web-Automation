package pro.vasudevan.automation.web.Luma.products.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pro.vasudevan.automation.web.Luma.base.SuperBasePage;
import pro.vasudevan.automation.web.Luma.misc.Common;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

/*
Created By: Vasudevan Sampath
ProductsPage.java follows Selenium Page Object Model (POM) design pattern and uses Serenity BDD model
*/
public class ProductsPage extends SuperBasePage {

    public List<String> getTitles() {
        return findAll("//ol[@class='product-items widget-product-grid']/li")
                .stream()
                .map(product -> product.getText().split("\n")[0])
                .toList();
    }

    public String selectRandomCostume() {
        Common.scroll(getDriver(), $("//h2[text()='Hot Sellers']"));
        List<WebElementFacade> items = $$(".product-items li");
        WebElement webElement = items.get(new Random().nextInt(1, items.size() - 2));
        String getText = Stream.of(webElement)
                .map(product -> product.getText().split("\n")[0])
                .findFirst().get();
        webElement.click();
        return getText;
    }

    public String selectRandomSizeOnTheOpenedCostume() {
        List<WebElementFacade> items = $$("div[class$='size'] .swatch-attribute-options div");
        WebElement webElement = items.get(new Random().nextInt(1, items.size()));
        webElement.click();
        return webElement.getText();
    }

    public String selectRandomColorOnTheOpenedCostume() {
        try {
            wait(2000);
        } catch (Exception ignored) {}
        List<WebElementFacade> items = $$("div[class$='color'] .swatch-attribute-options div");
        WebElement webElement = items.get(new Random().nextInt(1, items.size()));
        webElement.click();
        return webElement.getDomAttribute("option-label");
    }

    public int addOneOrMoreCostumesToShoppingCart() {
        int rnd = ThreadLocalRandom.current().nextInt(1,1000);
        find(By.id("qty")).sendKeys(String.valueOf(rnd));
        return rnd;
    }

    public void addToCart() {
        WebElementFacade cart = $(".action.primary.tocart");
        Common.scroll(getDriver(), cart);
        cart.click();
    }

    public void navigateToShoppingCart() {
        WebElementFacade showCart = $(".action.showcart");
        Common.scroll(getDriver(), showCart);
        showCart.click();
        $(".action.viewcart").click();
    }
}
