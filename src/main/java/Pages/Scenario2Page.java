package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Scenario2Page extends Pagebase{



    private final By todayDeals= By.xpath("//a[contains(text(),'Today's Deals')]");
    private final  By seeMore=By.cssSelector("a[aria-labelledby='see-more-departments-label']");
    private final By Electronics=By.xpath("//span[contains(text(),'Electronics')]");
    private final By Headphones=By.xpath("//span[contains(text(),'Headphones, Earbuds & Accessories')]");
   private final By  tenPrecent=By.cssSelector("span.a-size-base.a-color-base");
    private final By firstItem=By.cssSelector("//div[contains(@class, 'a-section') and contains(@class, 'ProductCardImage-module__container_XJaC1bSBwo7eFD2Ncs2r')]");
    private final By addTocartbtn=By.cssSelector("//input[@id='add-to-cart-button']");
    public Scenario2Page(WebDriver driver) {
        super(driver);
    }

    public Scenario2Page clickOntodayDeals()
    {
        new Pagebase(driver).waitForElement(todayDeals);
        driver.findElement(todayDeals).click();
        return this;

    }
    public Scenario2Page clkOnMoretoshowitem(){
        new Pagebase(driver).waitForElement(seeMore);
        driver.findElement(seeMore).click();
        return this;
    }

    public Scenario2Page clkOnElectronics()
    {
        new Pagebase(driver).scrolltoelementView(Electronics);
        driver.findElement(Electronics).click();
        return this;
    }
    public Scenario2Page clkOnHeadphones()
    {
        new Pagebase(driver).scrolltoelementView(Headphones);
        driver.findElement(Headphones).click();
        return this;
    }


    public Scenario2Page clkOnTenPrecent()
    {
        new Pagebase(driver).scrolltoelementView(tenPrecent);
        driver.findElement(tenPrecent).click();
        return this;
    }

    public Scenario2Page clkOnitem()
    {
        driver.findElement(firstItem).click();
        return this;
    }
    public Scenario2Page AdditemTocart()
    {
        new Pagebase(driver).waitForElement(addTocartbtn);
        driver.findElement(addTocartbtn).click();
        return this;

    }

}
