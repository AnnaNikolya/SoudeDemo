package tests;

import io.qameta.allure.Attachment;
import org.bouncycastle.util.test.SimpleTestResult;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;

public class TestLirners { @Attachment(value = "screenshot", type = "image/png")
p@Attachment(value = "screenshot", type = "image/png")
    public static byte[] takeScreenshot(ITestResult iTestResult) {
        ITestContext context = iTestResult.getTestContext();
        try{
            WebDriver driver = (WebDriver) context.getAttribute("driver");
            if (driver != null) {
                return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            } else {
                return new byte[] {};
            }
        } catch (NoSuchSessionException | IllegalStateException exception) {
            return new byte[] {};
        }
    }











    return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
}
}
}
