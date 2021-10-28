package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    WebDriver driver; // обьявляется обьект вебрайвера
    WebDriverWait wait = new WebDriverWait(driver, 10);

    BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage(String url) {
        driver.get(url);
    }

    public void waitForElementLoketed(By element, int timeout) {
        wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id")));
    }

}











