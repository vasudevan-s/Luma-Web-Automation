package pro.vasudevan.automation.web.Luma.products.tests;

import java.util.List;
import static org.assertj.core.api.Assertions.*;

import net.serenitybdd.core.Serenity;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import pro.vasudevan.automation.web.Luma.products.pages.ProductsPage;
import pro.vasudevan.automation.web.Luma.base.TestBase;
import pro.vasudevan.automation.web.Luma.interfaces.Csv2List;

/*
Created By: Vasudevan Sampath
WhenOnDefaultProductListAfterLoginTests.java has all tests for product scenarios
Uses Serenity @Steps syntax for initializing Action classes
Uses JUnit 5 @ParameterizedTest annotation for data driven test methods
Uses @CsvFileSource for CSV external test data file support
Uses @Csv2List custom interface for converting parameters to List simplifying method signature
Uses AssertJ for expressive asserts
*/
@Order(4)
public class WhenOnDefaultProductListAfterLoginTests extends TestBase {

    ProductsPage productsPage;

    @ParameterizedTest
    @DisplayName("Validate default Product List count and product name")
    @CsvFileSource(resources = "/testData/ProductList.csv", numLinesToSkip = 1)
    public void isProductCountAndNameMatchingTest(@Csv2List List<?> productList) {
        int count = Integer.parseInt((String) productList.get(0));
        Serenity.reportThat("Product count should be: " + count + " and product name: " + productList.get(1) + " should match",
                () -> assertThat(productsPage.getTitles()).hasSize(count)
                        .contains(productList.get(1).toString()));
    }
}