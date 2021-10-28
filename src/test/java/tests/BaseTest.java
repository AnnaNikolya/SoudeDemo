package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductsPage;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    LoginPage loginPage;
    ProductsPage productsPage;
    CartPage cartPage;

    @BeforeMethod // позволяет запускать метод перед каждым запуском теста
    public void initTest() {
        WebDriverManager.chromedriver().setup(); // настройка драйвера
        driver = new ChromeDriver(); // инициализация драйвера
        driver.manage().window().maximize(); // настройка что бы окно расширялось на все окно
       // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // задаем время выполнение работы, для стабильности выполнения тестов
        loginPage = new LoginPage(driver); //
        productsPage = new ProductsPage(driver); //
        cartPage = new CartPage(driver); //
    }

    @AfterMethod // запускается после каждого метода
    public void closeDriver() {
        driver.quit();
    } // в конце теста закрывает браузер

}
