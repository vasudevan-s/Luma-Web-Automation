package pro.vasudevan.automation.web.Luma.products.pages;

import pro.vasudevan.automation.web.Luma.base.SuperBasePage;

/*
Created By: Vasudevan Sampath
ShoppingCartPage.java follows Selenium Page Object Model (POM) design pattern and uses Serenity BDD model
*/
public class ShoppingCartPage extends SuperBasePage {

    public String getAddedProductName() {
        return $("(//td[@class='col item']//a)[2]").getText();
    }

    public String getAddedProductSize() {
        return $$(".item-options dd").getFirst().getText();
    }

    public String getAddedProductColor() {
        return $$(".item-options dd").get(1).getText();
    }

    public int getAddedProductQuantity() {
        return Integer.parseInt($(".input-text.qty").getDomProperty("value"));
    }
}
