import Pages.Pagebase;
import Pages.Scenario1Page;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario1Tests extends TestBase{


    @Test
    public void scenario1Test()
    {
        new Scenario1Page(driver)
               .ClickonCart()
               .ClickonFirstitem()
          .ClickonAdditemToCart();
     Assert.assertTrue(new Pagebase(driver).CheckifitemAddedsuccessfully(),"the item didn't added to cart ");
    }
}
