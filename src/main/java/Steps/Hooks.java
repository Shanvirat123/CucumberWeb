package Steps;


import com.base.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends BaseClass {


    @Before
    public void setUp() {
        driver.set(new ChromeDriver());
    }

    @After
    public void tearDown() {
        if (driver != null) {
            getDriver().close();
        }
    }
}
