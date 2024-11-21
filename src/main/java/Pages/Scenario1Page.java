package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Scenario1Page  extends Pagebase{
    WebDriver driver;
  private final By Cartmark= By.cssSelector("span.nav-cart-icon.nav-sprite");
    private final By FirstItem=By.xpath("//div[@class='_cDEzb_p13n-sc-css-line-clamp-2_EWgCb']");
   private final By AddtoCartbtn=By.xpath("//input[@id='add-to-cart-button']");
   private final By SuccessMessage =By.xpath("//h1[contains(text(),'Added to cart')]");

   public Scenario1Page(WebDriver driver) {
        super(driver);

    }
    public Scenario1Page ClickonCart()
    {
        new Pagebase(driver).waitForElement(Cartmark);
        driver.findElement(Cartmark).click();
        return this;
    }
    public Scenario1Page ClickonFirstitem()
    {
        new Pagebase(driver).waitForElement(FirstItem);
        driver.findElement(FirstItem).click();
        return this;
    }
    public Scenario1Page ClickonAdditemToCart()
    {
        new Pagebase(driver).waitForElement(AddtoCartbtn);
        driver.findElement(AddtoCartbtn).click();
        return this;
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
