package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.ProductsPage;

public class ProductSteps {
    private LoginPage loginPage;
    private ProductsPage productPage;

    public ProductSteps(WebDriver driver) {
        loginPage = new LoginPage(driver);
        productPage = new ProductsPage(driver);
    }

    @Step("Login and add product to cart")
    public ProductSteps loginAndAddProductToCart(String username, String password, String productName) {
        loginPage.openPage()
                .login(username, password)
                .addProductToCart(productName);
        return this;
    }
}













