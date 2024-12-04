package pro.vasudevan.automation.web.Luma.products.tests;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import pro.vasudevan.automation.web.Luma.base.TestBase;
import pro.vasudevan.automation.web.Luma.products.actions.SelectedProductActions;
import pro.vasudevan.automation.web.Luma.products.pages.ShoppingCartPage;

import static org.assertj.core.api.Assertions.assertThat;

/*
Created By: Vasudevan Sampath
WhenCostumesAreAddedToShoppingCartTests.java has all tests for shopping cart scenarios
Uses Serenity @Steps syntax for initializing Action classes
Uses AssertJ for expressive asserts
*/
@Order(5)
public class WhenCostumesAreAddedToShoppingCartTests extends TestBase {

    @Steps
    SelectedProductActions selectedProductActions;

    ShoppingCartPage shoppingCartPage;

    @Test
    @DisplayName("Add a random Costume to Shopping Cart and validate the shopping cart")
    public void addCostumesToShoppingCartAndValidateTest() {
        String randomProductName = selectedProductActions.pickARandomProduct();
        String randomSize = selectedProductActions.selectRandomSize();
        String randomColor = selectedProductActions.selectRandomColor();
        int productQuantity = selectedProductActions.addOneOrMoreCostumes();
        selectedProductActions.addToCart();
        selectedProductActions.navigateToShoppingCart();

        Serenity.reportThat(randomProductName + " selected random product should match",
                () -> assertThat(shoppingCartPage.getAddedProductName()).isEqualTo(randomProductName));

        Serenity.reportThat(randomSize + " selected size should match",
                () -> assertThat(shoppingCartPage.getAddedProductSize()).isEqualTo(randomSize));

        Serenity.reportThat(randomColor + " selected color should match",
                () -> assertThat(shoppingCartPage.getAddedProductColor()).isEqualTo(randomColor));

        Serenity.reportThat(productQuantity + " item(s) should match",
                () -> assertThat(shoppingCartPage.getAddedProductQuantity()).isEqualTo(productQuantity));
    }
}
