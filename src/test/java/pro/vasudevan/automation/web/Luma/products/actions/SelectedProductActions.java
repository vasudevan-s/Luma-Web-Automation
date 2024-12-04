package pro.vasudevan.automation.web.Luma.products.actions;

import net.serenitybdd.annotations.Step;
import pro.vasudevan.automation.web.Luma.products.pages.ProductsPage;

/*
Created By: Vasudevan Sampath
SelectedProductActions.java has methods for product specific actions
*/
public class SelectedProductActions {

    ProductsPage productsPage;

    @Step("Pick a random costume from the welcome page")
    public String pickARandomProduct() {
        return productsPage.selectRandomCostume();
    }

    @Step("Select a random size on the selected costume")
    public String selectRandomSize() {
        return productsPage.selectRandomSizeOnTheOpenedCostume();
    }

    @Step("Select a random color on the selected costume")
    public String selectRandomColor() {
        return productsPage.selectRandomColorOnTheOpenedCostume();
    }

    @Step("Add 1 or more costumes")
    public int addOneOrMoreCostumes() {
        return productsPage.addOneOrMoreCostumesToShoppingCart();
    }

    @Step("Click on Add to Cart")
    public void addToCart() {
        productsPage.addToCart();
    }

    @Step("Navigate to Shopping Cart")
    public void navigateToShoppingCart() {
        productsPage.navigateToShoppingCart();
    }
}
