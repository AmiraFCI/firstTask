import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


public class TestBase {
     WebDriver driver;
    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

    }
}
