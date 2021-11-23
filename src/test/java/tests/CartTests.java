package tests;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;

public class CartTests extends BaseTest {
    @Test (dataProvider = "User data", dataProviderClass = TestDataProvider.class, retryAnalyzer = Retry.class)
    @Description("Add product to cart")
    public void addProductToCartTest(String userName, String password, String productName, String expectedPrice) {
       cartSteps.addProductToCartTest(userName, password, productName);
       productsSteps
        loginPage.openPage();
        loginPage.login(userName, password);
        productsPage.addProductToCart();
        Assert.assertEquals(cartPage.getProductPrice("Sauce Labs Bolt T-Shirt"), expectedPrice);
    }

    @Test
    public void addProductToCartWithFactoryTest(LoginPage loginPageFactory, String expectedPrice) {
        loginPageFactory.openPage("https://www.soucedemo.com");
        loginPageFactory.login(System.getenv("userName"), System.getenv("password"));
        productsPage.addProductToCart("Sauce Labs Bolt T-Shirt");
        productsPage.openPage("https://www.soucedemo.com/cart.html");
        Assert.assertEquals(cartPage.getProductPrice("Sauce Labs Bolt T-Shirt"), expectedPrice);
    }

    @Test
    public void withoutPageFactoryTests() {
        BasePage loginPageFactory = null;
        loginPageFactory.openPage("https://www.soucedemo.com");
        WebElement addButtonElement = driver.findElement(By.xpath("//button[contain]"));
        addButtonElement.click();
        WebElement deleteButtonElement = driver.findElement(By.xpath("//button[contain]"));
        addButtonElement.click();
        deleteButtonElement.click();
    }

    @Ignore("This test is disabled due to blocking bug: TMS - 99")
    @Test(enabled = false, description = "This test is creating a user via DB")
    public void createUserTest() {
        System.out.println("demo test");
    }

    @BeforeMethod
    //create user

    @Test()
    public void demoTest1() {
        // create user
        // update user
    }
    @Test()
    public void demoTest2() {
       // create user
        // delete user
    }
}





















