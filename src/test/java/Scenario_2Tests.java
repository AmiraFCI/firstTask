import Pages.Pagebase;
import Pages.Scenario2Page;
import org.testng.Assert;

public class Scenario_2Tests extends TestBase {

    public void scenario2Test()
    {
        new Scenario2Page(driver)
                .clickOntodayDeals()
                .clkOnMoretoshowitem()
                .clkOnElectronics()
                .clkOnHeadphones()
                .clkOnTenPrecent()
                .clkOnitem()
                .AdditemTocart();
        Assert.assertTrue(new Pagebase(driver).CheckifitemAddedsuccessfully(),"item didn't add");


    }


}
