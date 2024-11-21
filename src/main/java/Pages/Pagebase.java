package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Pagebase {
    WebDriver driver;
    private final By SuccessMessage =By.xpath("//h1[contains(text(),'Added to cart')]");

    public Pagebase(WebDriver driver) {
        this.driver=driver;
    }

    public void waitForElement(By locator)
    {
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public void scrolltoelementView(By locator)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(locator);
        js.executeScript("arguments[0].scrollIntoView();", Element);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));

    }
    public boolean CheckifitemAddedsuccessfully()
    {
        try {
            return driver.findElement(this.SuccessMessage).isEnabled();
        }
        catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
}
}
